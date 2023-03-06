package fi.blueshift.lib.domain.graphqlDto.statistic;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fi.blueshift.lib.domain.enums.FrequencyIntervalType;
import fi.blueshift.lib.domain.graphqlDto.PortfolioDto;
import io.leangen.graphql.annotations.GraphQLId;
import io.leangen.graphql.annotations.GraphQLIgnore;
import io.leangen.graphql.annotations.GraphQLInputField;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.springframework.data.relational.core.mapping.Column;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@GraphQLType(name = "PortfolioIntervalDataDto")
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortfolioStatisticDto {

    @JsonIgnore
    @GraphQLId
    String id;

    @GraphQLIgnore
    @JsonProperty("id")
    String guid;

    @GraphQLInputField
    @JsonProperty("portfolioEntity")
    PortfolioDto portfolio;

    @GraphQLInputField
    @JsonProperty("portfolio")
    String portfolioAddress;

    @GraphQLIgnore
    String portfolioName;

    @GraphQLInputField
    BigDecimal fees24hUSD;

    @GraphQLInputField
    BigDecimal fees7dUSD;

    @GraphQLInputField
    BigDecimal fees30dUSD;

    @GraphQLInputField
    BigDecimal volume24h;

    @GraphQLInputField
    BigDecimal volume24h_d;

    @GraphQLInputField
    BigDecimal volume24hUSD;

    @GraphQLInputField
    BigDecimal volume7d;

    @GraphQLInputField
    BigDecimal volume7d_d;

    @GraphQLInputField
    BigDecimal volume7dUSD;

    @GraphQLInputField
    BigDecimal volume30d;

    @GraphQLInputField
    BigDecimal volume30d_d;

    @GraphQLInputField
    BigDecimal volume30dUSD;

    @JsonProperty("valueBase")
    BigDecimal tvlBase;

    @Column("tvl_d")
    BigDecimal tvl_d;

    @JsonProperty("valueUSD")
    BigDecimal tvlUSD;

    @GraphQLInputField
    LocalDateTime dateTime;

    @GraphQLIgnore
    Long timestamp;

    @GraphQLInputField
    FrequencyIntervalType interval;
}
