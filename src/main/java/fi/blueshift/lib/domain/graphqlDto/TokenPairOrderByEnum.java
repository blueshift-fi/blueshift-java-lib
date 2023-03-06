package fi.blueshift.lib.domain.graphqlDto;


import io.leangen.graphql.annotations.types.GraphQLType;

@GraphQLType(name = "Pair_orderBy")
public enum TokenPairOrderByEnum {
    id,
    token0,
    token1,
    reserve0,
    reserve1,
    totalSupply,
    reserveETH,
    reserveUSD,
    trackedReserveETH,
    token0Price,
    token1Price,
    volumeToken0,
    volumeToken1,
    volumeUSD,
    untrackedVolumeUSD,
    txCount,
    createdAtTimestamp,
    createdAtBlockNumber,
    liquidityProviderCount,
    ;
}
