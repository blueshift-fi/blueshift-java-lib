package fi.blueshift.lib.domain.graphqlDto;

import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@GraphQLType(name = "Pair_filter", isStrictName = true)
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TokenPairFilterDto {
    String addressId;

    String addressId_not;

//	@GraphQLScalar(fieldName = "id_gt", graphQLTypeSimpleName = "ID", javaClass = java.util.UUID.class)
//	java.util.UUID id_gt;
//
//
//	@GraphQLScalar(fieldName = "id_lt", graphQLTypeSimpleName = "ID", javaClass = java.util.UUID.class)
//	java.util.UUID id_lt;
//
//
//	@GraphQLScalar(fieldName = "id_gte", graphQLTypeSimpleName = "ID", javaClass = java.util.UUID.class)
//	java.util.UUID id_gte;
//
//
//	@GraphQLScalar(fieldName = "id_lte", graphQLTypeSimpleName = "ID", javaClass = java.util.UUID.class)
//	java.util.UUID id_lte;
//
//
//	@GraphQLScalar(fieldName = "id_in", graphQLTypeSimpleName = "ID", javaClass = java.util.UUID.class)
//	List<java.util.UUID> id_in;
//
//
//	@GraphQLScalar(fieldName = "id_not_in", graphQLTypeSimpleName = "ID", javaClass = java.util.UUID.class)
//	List<java.util.UUID> id_not_in;
//
//
//	@GraphQLScalar(fieldName = "token0", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0;
//
//
//	@GraphQLScalar(fieldName = "token0_not", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_not;
//
//
//	@GraphQLScalar(fieldName = "token0_gt", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_gt;
//
//
//	@GraphQLScalar(fieldName = "token0_lt", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_lt;
//
//
//	@GraphQLScalar(fieldName = "token0_gte", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_gte;
//
//
//	@GraphQLScalar(fieldName = "token0_lte", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_lte;
//
//
//	@GraphQLScalar(fieldName = "token0_in", graphQLTypeSimpleName = "String", javaClass = String.class)
//	List<String> token0_in;
//
//
//	@GraphQLScalar(fieldName = "token0_not_in", graphQLTypeSimpleName = "String", javaClass = String.class)
//	List<String> token0_not_in;
//
//
//	@GraphQLScalar(fieldName = "token0_contains", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_contains;
//
//
//	@GraphQLScalar(fieldName = "token0_contains_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_contains_nocase;
//
//
//	@GraphQLScalar(fieldName = "token0_not_contains", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_not_contains;
//
//
//	@GraphQLScalar(fieldName = "token0_not_contains_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_not_contains_nocase;
//
//
//	@GraphQLScalar(fieldName = "token0_starts_with", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_starts_with;
//
//
//	@GraphQLScalar(fieldName = "token0_starts_with_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_starts_with_nocase;
//
//
//	@GraphQLScalar(fieldName = "token0_not_starts_with", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_not_starts_with;
//
//
//	@GraphQLScalar(fieldName = "token0_not_starts_with_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_not_starts_with_nocase;
//
//
//	@GraphQLScalar(fieldName = "token0_ends_with", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_ends_with;
//
//
//	@GraphQLScalar(fieldName = "token0_ends_with_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_ends_with_nocase;
//
//
//	@GraphQLScalar(fieldName = "token0_not_ends_with", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_not_ends_with;
//
//
//	@GraphQLScalar(fieldName = "token0_not_ends_with_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token0_not_ends_with_nocase;
//
//
//	@GraphQLScalar(fieldName = "token1", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1;
//
//
//	@GraphQLScalar(fieldName = "token1_not", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_not;
//
//
//	@GraphQLScalar(fieldName = "token1_gt", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_gt;
//
//
//	@GraphQLScalar(fieldName = "token1_lt", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_lt;
//
//
//	@GraphQLScalar(fieldName = "token1_gte", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_gte;
//
//
//	@GraphQLScalar(fieldName = "token1_lte", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_lte;
//
//
//	@GraphQLScalar(fieldName = "token1_in", graphQLTypeSimpleName = "String", javaClass = String.class)
//	List<String> token1_in;
//
//
//	@GraphQLScalar(fieldName = "token1_not_in", graphQLTypeSimpleName = "String", javaClass = String.class)
//	List<String> token1_not_in;
//
//
//	@GraphQLScalar(fieldName = "token1_contains", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_contains;
//
//
//	@GraphQLScalar(fieldName = "token1_contains_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_contains_nocase;
//
//
//	@GraphQLScalar(fieldName = "token1_not_contains", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_not_contains;
//
//
//	@GraphQLScalar(fieldName = "token1_not_contains_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_not_contains_nocase;
//
//
//	@GraphQLScalar(fieldName = "token1_starts_with", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_starts_with;
//
//
//	@GraphQLScalar(fieldName = "token1_starts_with_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_starts_with_nocase;
//
//
//	@GraphQLScalar(fieldName = "token1_not_starts_with", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_not_starts_with;
//
//
//	@GraphQLScalar(fieldName = "token1_not_starts_with_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_not_starts_with_nocase;
//
//
//	@GraphQLScalar(fieldName = "token1_ends_with", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_ends_with;
//
//
//	@GraphQLScalar(fieldName = "token1_ends_with_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_ends_with_nocase;
//
//
//	@GraphQLScalar(fieldName = "token1_not_ends_with", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_not_ends_with;
//
//
//	@GraphQLScalar(fieldName = "token1_not_ends_with_nocase", graphQLTypeSimpleName = "String", javaClass = String.class)
//	String token1_not_ends_with_nocase;
//
//
//	@GraphQLScalar(fieldName = "reserve0", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve0;
//
//
//	@GraphQLScalar(fieldName = "reserve0_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve0_not;
//
//
//	@GraphQLScalar(fieldName = "reserve0_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve0_gt;
//
//
//	@GraphQLScalar(fieldName = "reserve0_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve0_lt;
//
//
//	@GraphQLScalar(fieldName = "reserve0_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve0_gte;
//
//
//	@GraphQLScalar(fieldName = "reserve0_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve0_lte;
//
//
//	@GraphQLScalar(fieldName = "reserve0_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> reserve0_in;
//
//
//	@GraphQLScalar(fieldName = "reserve0_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> reserve0_not_in;
//
//
//	@GraphQLScalar(fieldName = "reserve1", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve1;
//
//
//	@GraphQLScalar(fieldName = "reserve1_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve1_not;
//
//
//	@GraphQLScalar(fieldName = "reserve1_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve1_gt;
//
//
//	@GraphQLScalar(fieldName = "reserve1_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve1_lt;
//
//
//	@GraphQLScalar(fieldName = "reserve1_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve1_gte;
//
//
//	@GraphQLScalar(fieldName = "reserve1_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserve1_lte;
//
//
//	@GraphQLScalar(fieldName = "reserve1_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> reserve1_in;
//
//
//	@GraphQLScalar(fieldName = "reserve1_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> reserve1_not_in;
//
//
//	@GraphQLScalar(fieldName = "totalSupply", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal totalSupply;
//
//
//	@GraphQLScalar(fieldName = "totalSupply_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal totalSupply_not;
//
//
//	@GraphQLScalar(fieldName = "totalSupply_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal totalSupply_gt;
//
//
//	@GraphQLScalar(fieldName = "totalSupply_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal totalSupply_lt;
//
//
//	@GraphQLScalar(fieldName = "totalSupply_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal totalSupply_gte;
//
//
//	@GraphQLScalar(fieldName = "totalSupply_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal totalSupply_lte;
//
//
//	@GraphQLScalar(fieldName = "totalSupply_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> totalSupply_in;
//
//
//	@GraphQLScalar(fieldName = "totalSupply_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> totalSupply_not_in;
//
//
//	@GraphQLScalar(fieldName = "reserveETH", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveETH;
//
//
//	@GraphQLScalar(fieldName = "reserveETH_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveETH_not;
//
//
//	@GraphQLScalar(fieldName = "reserveETH_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveETH_gt;
//
//
//	@GraphQLScalar(fieldName = "reserveETH_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveETH_lt;
//
//
//	@GraphQLScalar(fieldName = "reserveETH_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveETH_gte;
//
//
//	@GraphQLScalar(fieldName = "reserveETH_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveETH_lte;
//
//
//	@GraphQLScalar(fieldName = "reserveETH_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> reserveETH_in;
//
//
//	@GraphQLScalar(fieldName = "reserveETH_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> reserveETH_not_in;
//
//
//	@GraphQLScalar(fieldName = "reserveUSD", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveUSD;
//
//
//	@GraphQLScalar(fieldName = "reserveUSD_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveUSD_not;
//
//
//	@GraphQLScalar(fieldName = "reserveUSD_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveUSD_gt;
//
//
//	@GraphQLScalar(fieldName = "reserveUSD_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveUSD_lt;
//
//
//	@GraphQLScalar(fieldName = "reserveUSD_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveUSD_gte;
//
//
//	@GraphQLScalar(fieldName = "reserveUSD_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal reserveUSD_lte;
//
//
//	@GraphQLScalar(fieldName = "reserveUSD_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> reserveUSD_in;
//
//
//	@GraphQLScalar(fieldName = "reserveUSD_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> reserveUSD_not_in;
//
//
//	@GraphQLScalar(fieldName = "trackedReserveETH", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal trackedReserveETH;
//
//
//	@GraphQLScalar(fieldName = "trackedReserveETH_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal trackedReserveETH_not;
//
//
//	@GraphQLScalar(fieldName = "trackedReserveETH_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal trackedReserveETH_gt;
//
//
//	@GraphQLScalar(fieldName = "trackedReserveETH_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal trackedReserveETH_lt;
//
//
//	@GraphQLScalar(fieldName = "trackedReserveETH_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal trackedReserveETH_gte;
//
//
//	@GraphQLScalar(fieldName = "trackedReserveETH_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal trackedReserveETH_lte;
//
//
//	@GraphQLScalar(fieldName = "trackedReserveETH_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> trackedReserveETH_in;
//
//
//	@GraphQLScalar(fieldName = "trackedReserveETH_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> trackedReserveETH_not_in;
//
//
//	@GraphQLScalar(fieldName = "token0Price", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token0Price;
//
//
//	@GraphQLScalar(fieldName = "token0Price_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token0Price_not;
//
//
//	@GraphQLScalar(fieldName = "token0Price_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token0Price_gt;
//
//
//	@GraphQLScalar(fieldName = "token0Price_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token0Price_lt;
//
//
//	@GraphQLScalar(fieldName = "token0Price_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token0Price_gte;
//
//
//	@GraphQLScalar(fieldName = "token0Price_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token0Price_lte;
//
//
//	@GraphQLScalar(fieldName = "token0Price_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> token0Price_in;
//
//
//	@GraphQLScalar(fieldName = "token0Price_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> token0Price_not_in;
//
//
//	@GraphQLScalar(fieldName = "token1Price", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token1Price;
//
//
//	@GraphQLScalar(fieldName = "token1Price_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token1Price_not;
//
//
//	@GraphQLScalar(fieldName = "token1Price_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token1Price_gt;
//
//
//	@GraphQLScalar(fieldName = "token1Price_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token1Price_lt;
//
//
//	@GraphQLScalar(fieldName = "token1Price_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token1Price_gte;
//
//
//	@GraphQLScalar(fieldName = "token1Price_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal token1Price_lte;
//
//
//	@GraphQLScalar(fieldName = "token1Price_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> token1Price_in;
//
//
//	@GraphQLScalar(fieldName = "token1Price_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> token1Price_not_in;
//
//
//	@GraphQLScalar(fieldName = "volumeToken0", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken0;
//
//
//	@GraphQLScalar(fieldName = "volumeToken0_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken0_not;
//
//
//	@GraphQLScalar(fieldName = "volumeToken0_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken0_gt;
//
//
//	@GraphQLScalar(fieldName = "volumeToken0_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken0_lt;
//
//
//	@GraphQLScalar(fieldName = "volumeToken0_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken0_gte;
//
//
//	@GraphQLScalar(fieldName = "volumeToken0_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken0_lte;
//
//
//	@GraphQLScalar(fieldName = "volumeToken0_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> volumeToken0_in;
//
//
//	@GraphQLScalar(fieldName = "volumeToken0_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> volumeToken0_not_in;
//
//
//	@GraphQLScalar(fieldName = "volumeToken1", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken1;
//
//
//	@GraphQLScalar(fieldName = "volumeToken1_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken1_not;
//
//
//	@GraphQLScalar(fieldName = "volumeToken1_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken1_gt;
//
//
//	@GraphQLScalar(fieldName = "volumeToken1_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken1_lt;
//
//
//	@GraphQLScalar(fieldName = "volumeToken1_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken1_gte;
//
//
//	@GraphQLScalar(fieldName = "volumeToken1_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeToken1_lte;
//
//
//	@GraphQLScalar(fieldName = "volumeToken1_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> volumeToken1_in;
//
//
//	@GraphQLScalar(fieldName = "volumeToken1_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> volumeToken1_not_in;
//
//
//	@GraphQLScalar(fieldName = "volumeUSD", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeUSD;
//
//
//	@GraphQLScalar(fieldName = "volumeUSD_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeUSD_not;
//
//
//	@GraphQLScalar(fieldName = "volumeUSD_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeUSD_gt;
//
//
//	@GraphQLScalar(fieldName = "volumeUSD_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeUSD_lt;
//
//
//	@GraphQLScalar(fieldName = "volumeUSD_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeUSD_gte;
//
//
//	@GraphQLScalar(fieldName = "volumeUSD_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal volumeUSD_lte;
//
//
//	@GraphQLScalar(fieldName = "volumeUSD_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> volumeUSD_in;
//
//
//	@GraphQLScalar(fieldName = "volumeUSD_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> volumeUSD_not_in;
//
//
//	@GraphQLScalar(fieldName = "untrackedVolumeUSD", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal untrackedVolumeUSD;
//
//
//	@GraphQLScalar(fieldName = "untrackedVolumeUSD_not", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal untrackedVolumeUSD_not;
//
//
//	@GraphQLScalar(fieldName = "untrackedVolumeUSD_gt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal untrackedVolumeUSD_gt;
//
//
//	@GraphQLScalar(fieldName = "untrackedVolumeUSD_lt", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal untrackedVolumeUSD_lt;
//
//
//	@GraphQLScalar(fieldName = "untrackedVolumeUSD_gte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal untrackedVolumeUSD_gte;
//
//
//	@GraphQLScalar(fieldName = "untrackedVolumeUSD_lte", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	java.math.BigDecimal untrackedVolumeUSD_lte;
//
//
//	@GraphQLScalar(fieldName = "untrackedVolumeUSD_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> untrackedVolumeUSD_in;
//
//
//	@GraphQLScalar(fieldName = "untrackedVolumeUSD_not_in", graphQLTypeSimpleName = "BigDecimal", javaClass = java.math.BigDecimal.class)
//	List<java.math.BigDecimal> untrackedVolumeUSD_not_in;
//
//
//	@GraphQLScalar(fieldName = "txCount", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long txCount;
//
//
//	@GraphQLScalar(fieldName = "txCount_not", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long txCount_not;
//
//
//	@GraphQLScalar(fieldName = "txCount_gt", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long txCount_gt;
//
//
//	@GraphQLScalar(fieldName = "txCount_lt", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long txCount_lt;
//
//
//	@GraphQLScalar(fieldName = "txCount_gte", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long txCount_gte;
//
//
//	@GraphQLScalar(fieldName = "txCount_lte", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long txCount_lte;
//
//
//	@GraphQLScalar(fieldName = "txCount_in", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	List<Long> txCount_in;
//
//
//	@GraphQLScalar(fieldName = "txCount_not_in", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	List<Long> txCount_not_in;
//
//
//	@GraphQLScalar(fieldName = "createdAtTimestamp", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtTimestamp;
//
//
//	@GraphQLScalar(fieldName = "createdAtTimestamp_not", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtTimestamp_not;
//
//
//	@GraphQLScalar(fieldName = "createdAtTimestamp_gt", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtTimestamp_gt;
//
//
//	@GraphQLScalar(fieldName = "createdAtTimestamp_lt", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtTimestamp_lt;
//
//
//	@GraphQLScalar(fieldName = "createdAtTimestamp_gte", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtTimestamp_gte;
//
//
//	@GraphQLScalar(fieldName = "createdAtTimestamp_lte", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtTimestamp_lte;
//
//
//	@GraphQLScalar(fieldName = "createdAtTimestamp_in", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	List<Long> createdAtTimestamp_in;
//
//
//	@GraphQLScalar(fieldName = "createdAtTimestamp_not_in", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	List<Long> createdAtTimestamp_not_in;
//
//
//	@GraphQLScalar(fieldName = "createdAtBlockNumber", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtBlockNumber;
//
//
//	@GraphQLScalar(fieldName = "createdAtBlockNumber_not", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtBlockNumber_not;
//
//
//	@GraphQLScalar(fieldName = "createdAtBlockNumber_gt", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtBlockNumber_gt;
//
//
//	@GraphQLScalar(fieldName = "createdAtBlockNumber_lt", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtBlockNumber_lt;
//
//
//	@GraphQLScalar(fieldName = "createdAtBlockNumber_gte", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtBlockNumber_gte;
//
//
//	@GraphQLScalar(fieldName = "createdAtBlockNumber_lte", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long createdAtBlockNumber_lte;
//
//
//	@GraphQLScalar(fieldName = "createdAtBlockNumber_in", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	List<Long> createdAtBlockNumber_in;
//
//
//	@GraphQLScalar(fieldName = "createdAtBlockNumber_not_in", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	List<Long> createdAtBlockNumber_not_in;
//
//
//	@GraphQLScalar(fieldName = "liquidityProviderCount", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long liquidityProviderCount;
//
//
//	@GraphQLScalar(fieldName = "liquidityProviderCount_not", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long liquidityProviderCount_not;
//
//
//	@GraphQLScalar(fieldName = "liquidityProviderCount_gt", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long liquidityProviderCount_gt;
//
//
//	@GraphQLScalar(fieldName = "liquidityProviderCount_lt", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long liquidityProviderCount_lt;
//
//
//	@GraphQLScalar(fieldName = "liquidityProviderCount_gte", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long liquidityProviderCount_gte;
//
//
//	@GraphQLScalar(fieldName = "liquidityProviderCount_lte", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	Long liquidityProviderCount_lte;
//
//
//	@GraphQLScalar(fieldName = "liquidityProviderCount_in", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	List<Long> liquidityProviderCount_in;
//
//
//	@GraphQLScalar(fieldName = "liquidityProviderCount_not_in", graphQLTypeSimpleName = "BigInt", javaClass = Long.class)
//	List<Long> liquidityProviderCount_not_in;
//
//
//	@GraphQLNonScalar(fieldName = "_change_block", graphQLTypeSimpleName = "BlockChangedFilter", javaClass = org.uniswap.graphql.BlockChangedFilter.class)
//	org.uniswap.graphql.BlockChangedFilter _change_block;
}
