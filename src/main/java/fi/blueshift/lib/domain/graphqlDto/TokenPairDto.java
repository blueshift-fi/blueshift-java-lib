package fi.blueshift.lib.domain.graphqlDto;

import com.fasterxml.jackson.annotation.JsonAlias;
import fi.blueshift.lib.domain.enums.CryptoNetworkType;
import fi.blueshift.lib.domain.enums.SwapOperationType;
import io.leangen.graphql.annotations.GraphQLId;
import io.leangen.graphql.annotations.GraphQLInputField;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@GraphQLType(name = "Pair")
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TokenPairDto implements Serializable {
    @Serial
    private static final long serialVersionUID = -6558257723604073185L;

    /**
     * pair address
     */
    @GraphQLId
    String addressId;
    CryptoNetworkType network;

    @GraphQLInputField
    TokenDto token0;
    @JsonAlias({"tokenBaseAddress"})
    @NotNull
    String token0AddressId;
    @JsonAlias({"tokenBaseMarketSymbol"})
    @NotNull
    String token0MarketSymbol;

    @GraphQLInputField
    TokenDto token1;
    @JsonAlias({"tokenQuoteAddress"})
    @NotNull
    String token1AddressId;
    @JsonAlias({"tokenQuoteMarketSymbol"})
    @NotNull
    String token1MarketSymbol;

    @JsonAlias({"relatedPortfolioAddresses"})
    List<String> portfolioAddressTrackList;

    @Builder.Default
    SwapOperationType operationType = SwapOperationType.BUY;

    public String getTokenBaseAddress() {
        if (operationType == SwapOperationType.BUY) {
            return token0AddressId;
        }
        return token1AddressId;
    }

    public String getTokenQuoteAddress() {
        if (operationType == SwapOperationType.BUY) {
            return token1AddressId;
        }
        return token0AddressId;
    }

//
//    /**
//     * mirrored from the smart contract
//     *///
//    @GraphQLInputField
//    BigDecimal reserve0;
//
//    @GraphQLInputField
//    BigDecimal reserve1;
//
//    @GraphQLInputField
//    BigDecimal totalSupply;
//
//    /**
//     * derived liquidity
//     */
//    @GraphQLInputField
//    BigDecimal reserveETH;
//
//    @GraphQLInputField
//    BigDecimal reserveUSD;
//
//    /**
//     * used for separating per pair reserves and global
//     */
//    @GraphQLInputField
//    BigDecimal trackedReserveETH;
//
//    /**
//     * Price in terms of the asset pair
//     */
//    @GraphQLInputField
//    BigDecimal token0Price;
//
//    @GraphQLInputField
//    BigDecimal token1Price;
//
//    /**
//     * lifetime volume stats
//     */
//    @GraphQLInputField
//    BigDecimal volumeToken0;
//
//    @GraphQLInputField
//    BigDecimal volumeToken1;
//
//    @GraphQLInputField
//    BigDecimal volumeUSD;
//
//    @GraphQLInputField
//    BigDecimal untrackedVolumeUSD;
//
//    @GraphQLInputField
//    Long txCount;
//
//    /**
//     * creation stats
//     */
//    @GraphQLInputField
//    Long createdAtTimestamp;
//
//    @GraphQLInputField
//    Long createdAtBlockNumber;
//
//    /**
//     * Fields used to help derived relationship
//     */
//    @GraphQLInputField
//    Long liquidityProviderCount;

//    /**
//     * used to detect new exchanges
//     * derived fields
//     */
//    @GraphQLNonScalar(fieldName = "pairHourData", graphQLTypeSimpleName = "PairHourData", javaClass = org.uniswap.graphql.PairHourData.class)
//    List<PairHourData> pairHourData;
//
//    @GraphQLNonScalar(fieldName = "liquidityPositions", graphQLTypeSimpleName = "LiquidityPosition", javaClass = org.uniswap.graphql.LiquidityPosition.class)
//    List<LiquidityPosition> liquidityPositions;
//
//    @GraphQLNonScalar(fieldName = "liquidityPositionSnapshots", graphQLTypeSimpleName = "LiquidityPositionSnapshot", javaClass = org.uniswap.graphql.LiquidityPositionSnapshot.class)
//    List<LiquidityPositionSnapshot> liquidityPositionSnapshots;
//
//    @GraphQLNonScalar(fieldName = "mints", graphQLTypeSimpleName = "MintDto", javaClass = org.uniswap.graphql.MintDto.class)
//    List<MintDto> mints;
//
//    @GraphQLNonScalar(fieldName = "burns", graphQLTypeSimpleName = "BurnDto", javaClass = org.uniswap.graphql.BurnDto.class)
//    List<BurnDto> burns;
//
//    @GraphQLNonScalar(fieldName = "swaps", graphQLTypeSimpleName = "SwapDto", javaClass = org.uniswap.graphql.SwapDto.class)
//    List<SwapDto> swaps;
}
