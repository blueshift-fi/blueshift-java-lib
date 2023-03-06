package fi.blueshift.lib.domain.graphqlDto;

import io.leangen.graphql.annotations.GraphQLId;
import io.leangen.graphql.annotations.GraphQLInputField;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Set;

@GraphQLType(name = "Portfolio")
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PortfolioDto {

    @GraphQLId
    String id;

    @GraphQLInputField
    String name;

    @GraphQLInputField
    String addressId;

    @GraphQLInputField
    TokenDto baseToken;

    @GraphQLInputField
    String baseTokenAddress;

    @GraphQLInputField
    TokenDto lpToken;

    @GraphQLInputField
    String lpTokenAddress;

    @GraphQLInputField
    Set<TokenDto> tokens;

    @GraphQLInputField
    Set<TokenDto> tokenShortRefs;

    //<editor-fold desc="Statistic">
    @GraphQLInputField
    BigDecimal fees24hETH;

    @GraphQLInputField
    BigDecimal fees24hUSD;

    @GraphQLInputField
    BigDecimal fees30dUSD;

    /**
     * volume in base token for 24 hours
     */
    @GraphQLInputField
    BigDecimal volume24hBase;

    /**
     * volume in ETH (ADA) for 24 hours
     */
    @GraphQLInputField
    BigDecimal volume24hETH;

    /**
     * volume in USD for 24 hours
     */
    @GraphQLInputField
    BigDecimal volume24hUSD;

    @GraphQLInputField
    BigDecimal volumeUSD24hChange;

    /**
     * volume in base token for 30 days
     */
    @GraphQLInputField
    BigDecimal volume30d;

    /**
     * volume in USD for 30 days
     */
    @GraphQLInputField
    BigDecimal volume30dUSD;

    /**
     * tvl in base token
     */
    @GraphQLInputField
    BigDecimal tvlBase;

    @GraphQLInputField
    BigDecimal tvlUSD;

    @GraphQLInputField
    BigDecimal tvlUSD24hChange;

    @GraphQLInputField
    BigDecimal lpTokenPrice;

    @GraphQLInputField
    BigDecimal lpTokenPriceUSD;

    @GraphQLInputField
    BigDecimal lpTokenPrice24hChange;

    @GraphQLInputField
    BigDecimal lpTokenPrice30dChange;

    @GraphQLInputField
    BigDecimal txCount;
    //</editor-fold>
}
