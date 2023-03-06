package fi.blueshift.lib.domain.graphqlDto.statistic;

import fi.blueshift.lib.domain.enums.FrequencyIntervalType;
import io.leangen.graphql.annotations.GraphQLId;
import io.leangen.graphql.annotations.GraphQLInputField;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@GraphQLType(name = "Factory")
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SummaryPortfolioStatisticDto {

    @GraphQLId
    String id;

    @GraphQLInputField(description = "total volume all time in derived USD by 24h")
    BigDecimal volume24hUSD;

    @GraphQLInputField
    BigDecimal volume24hChange;

    @GraphQLInputField(description = "total swap fees in USD by 24h")
    BigDecimal fees24hUSD;

    @GraphQLInputField
    BigDecimal fees24hChange;

    @GraphQLInputField(description = "TVL derived in USD")
    BigDecimal tvlUSD;

    @GraphQLInputField
    BigDecimal tvl24hChange;

    @GraphQLInputField(description = "amount of transactions all time")
    Long txCount;

    @GraphQLInputField
    Long txCount24hChange;

    @GraphQLInputField
    LocalDateTime dateTime;

    @GraphQLInputField
    FrequencyIntervalType interval;
}
