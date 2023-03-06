package fi.blueshift.lib.domain.graphqlDto.explorer;


import fi.blueshift.lib.domain.graphqlDto.PortfolioDto;
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

@GraphQLType(name = "Swap", description = "swap tokens")
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SwapDto {
    @GraphQLId
    String id;

    @GraphQLInputField(description = "transaction hash + # + index in swaps Transaction array")
    String addressId;

    @GraphQLInputField(description = "timestamp of txn")
    Long timestamp;

    @GraphQLInputField(description = "datetime of txn")
    LocalDateTime dateTime;

    @GraphQLInputField(description = "which txn the swap was included in")
    TransactionDto transaction;

    @GraphQLInputField(description = "portfolio swap occurred within")
    PortfolioDto portfolio;

    @GraphQLInputField(description = "allow indexing by tokens")
    TokenDto token0;

    @GraphQLInputField(description = "delta of token0 swapped")
    BigDecimal amount0;

    @GraphQLInputField(description = "allow indexing by tokens")
    TokenDto token1;

    @GraphQLInputField(description = "delta of token1 swapped")
    BigDecimal amount1;

    @GraphQLInputField(description = "txn origin. The EOA that initiated the txn")
    String origin;

    @GraphQLInputField(description = "derived info")
    BigDecimal amountUSD;

    @GraphQLInputField(description = "sender of the swap")
    String sender;

    @GraphQLInputField(description = "recipient of the swap")
    String recipient;
}
