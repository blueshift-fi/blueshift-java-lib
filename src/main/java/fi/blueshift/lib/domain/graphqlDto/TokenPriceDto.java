package fi.blueshift.lib.domain.graphqlDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.leangen.graphql.annotations.GraphQLId;
import io.leangen.graphql.annotations.GraphQLIgnore;
import io.leangen.graphql.annotations.GraphQLInputField;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@GraphQLType(name = "TokenPrice")
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenPriceDto {

    @GraphQLId
    String id;

    @GraphQLInputField(description = "token address")
    String tokenAddress;

    @GraphQLInputField
    BigDecimal priceUSD;

    @GraphQLInputField
    BigDecimal priceBase;

    @GraphQLInputField
    LocalDateTime dateTime;

    @GraphQLInputField
    Long timestamp;

    //<editor-fold desc="unused statistic">
    @GraphQLInputField
    BigDecimal priceETH;

    @GraphQLInputField
    String baseAddress;

    @GraphQLIgnore
    @JsonProperty("portfolio")
    String portfolioAddress;

    @GraphQLInputField
    Long baseTokenDecimals;
    //</editor-fold>
}
