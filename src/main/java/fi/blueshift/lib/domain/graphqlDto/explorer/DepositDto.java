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

@GraphQLType(name = "Mint", description = "deposit liquidity")
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DepositDto {

    @GraphQLId
    String id;

    @GraphQLInputField(description = "transaction hash + # + index in mints TransactionDto array")
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

    @GraphQLInputField(description = "owner of position where liquidity minted to")
    String owner;

    @GraphQLInputField(description = "the address that minted the liquidity")
    String sender;

    @GraphQLInputField(description = "txn origin. The EOA that initiated the txn")
    String origin;

    @GraphQLInputField(description = "amount of token minted")
    BigDecimal amount;

    @GraphQLInputField(description = "derived amount based on available prices of tokens")
    BigDecimal amountUSD;
}
