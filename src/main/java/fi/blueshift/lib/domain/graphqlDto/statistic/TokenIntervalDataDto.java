package fi.blueshift.lib.domain.graphqlDto.statistic;

import fi.blueshift.lib.domain.enums.FrequencyIntervalType;
import fi.blueshift.lib.domain.graphqlDto.TokenDto;
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

@GraphQLType(name = "TokenIntervalData")
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TokenIntervalDataDto {

    @GraphQLId
    String id;

    @GraphQLInputField
    TokenDto token;

    @GraphQLInputField
    String tokenAddress;

    /**
     * token total supply
     */
    @GraphQLInputField
    BigDecimal totalSupply;

    @GraphQLInputField
    BigDecimal volume24hUSD;
    @GraphQLInputField
    BigDecimal volume7dUSD;
    @GraphQLInputField
    BigDecimal volume30dUSD;

    @GraphQLInputField
    BigDecimal fees24hUSD;

    @GraphQLInputField
    BigDecimal tvlUSD;

    //Always equal to closePrice
    @GraphQLInputField
    BigDecimal priceUSD;
    @GraphQLInputField
    BigDecimal open;
    @GraphQLInputField
    BigDecimal high;
    @GraphQLInputField
    BigDecimal low;
    @GraphQLInputField
    BigDecimal close;

    @GraphQLInputField
    BigDecimal txCount24h;

    @GraphQLInputField
    LocalDateTime dateTime;

    @GraphQLInputField
    FrequencyIntervalType interval;
}
