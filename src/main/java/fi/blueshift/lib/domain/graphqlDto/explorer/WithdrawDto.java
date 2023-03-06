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

@GraphQLType(name = "Burn", description = "withdraw liquidity")
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WithdrawDto {
    @GraphQLId
    String id;

    @GraphQLInputField(description = "transaction hash + # + index in burn TransactionDto array")
    String addressId;

    @GraphQLInputField(description = "timestamp of txn")
    Long timestamp;

    @GraphQLInputField(description = "datetime of txn")
    LocalDateTime dateTime;

    @GraphQLInputField(description = "which txn the mint was included in")
    TransactionDto transaction;

    @GraphQLInputField(description = "portfolio position is within")
    PortfolioDto portfolio;

    @GraphQLInputField(description = "allow indexing by tokens")
    TokenDto token;

    @GraphQLInputField(description = "owner of position where liquidity was burned")
    String owner;

//    @GraphQLInputField(description = "the address that minted the liquidity")
//    String sender;

    @GraphQLInputField(description = "txn origin. The EOA that initiated the txn")
    String origin;

    @GraphQLInputField(description = "amount of token burned")
    BigDecimal amount;

    @GraphQLInputField(description = "derived amount based on available prices of tokens")
    BigDecimal amountUSD;
}
