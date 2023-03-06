package fi.blueshift.lib.domain.graphqlDto.explorer;

import io.leangen.graphql.annotations.GraphQLId;
import io.leangen.graphql.annotations.GraphQLInputField;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;


@GraphQLType(name = "Transaction", description = "crypto transaction")
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TransactionDto {

    @GraphQLId
    String id;

    @GraphQLInputField(description = "transaction hash")
    String addressId;

    @GraphQLInputField(description = "block txn was included in")
    Long blockNumber;

    @GraphQLInputField(description = "timestamp txn was confirmed")
    Long timestamp;

    @GraphQLInputField(description = "datetime txn was confirmed")
    LocalDateTime dateTime;

    @GraphQLInputField(description = "gas used during txn execution")
    Long gasUsed;

    Long gasPrice;

    @GraphQLInputField(name = "mints", description = "liquidity deposits")
    List<DepositDto> deposits;

    @GraphQLInputField(name = "burns", description = "liquidity withdraws")
    List<WithdrawDto> withdraws;

    @GraphQLInputField(name = "swaps", description = "tokens swaps")
    List<SwapDto> swaps;

    String rawInput;
}
