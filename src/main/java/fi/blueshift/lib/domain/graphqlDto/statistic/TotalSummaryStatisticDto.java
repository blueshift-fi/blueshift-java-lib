package fi.blueshift.lib.domain.graphqlDto.statistic;

import io.leangen.graphql.annotations.GraphQLId;
import io.leangen.graphql.annotations.GraphQLInputField;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@GraphQLType(name = "TotalFactory")
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TotalSummaryStatisticDto {

    @GraphQLId
    String id;

    @GraphQLInputField
    BigDecimal bluesPrice;

    @GraphQLInputField
    BigDecimal bluesPrice24hChange;

    @GraphQLInputField
    BigDecimal bluesTotalSupply;

    @GraphQLInputField
    BigDecimal volume24hUSD;

    @GraphQLInputField
    BigDecimal volume24hChange;

    @GraphQLInputField
    BigDecimal fees24hUSD;

    @GraphQLInputField
    BigDecimal fees24hChange;

    @GraphQLInputField
    BigDecimal tvlUSD;

    @GraphQLInputField
    BigDecimal tvl24hChange;

    @GraphQLInputField
    BigDecimal txCount24h;

    @GraphQLInputField
    BigDecimal txCount24hChange;

    @GraphQLInputField
    LocalDateTime dateTime;

    @GraphQLInputField
    Long roundedTimestamp;
}
