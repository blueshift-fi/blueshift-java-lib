package fi.blueshift.lib.domain.graphqlDto.health;

import fi.blueshift.lib.domain.enums.CryptoNetworkType;
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

@GraphQLType(name = "ChainStatus")
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChainStatusDto {

    @GraphQLId
    CryptoNetworkType network;

    @GraphQLInputField(description = "ETH price in USD")
    BigDecimal ethPriceUSD;

    @GraphQLInputField
    String ethSymbol;

    @GraphQLInputField
    String bluesContract;

    @GraphQLInputField
    BlockDto chainHeadBlock;

    @GraphQLInputField
    BlockDto latestBlock;

    @GraphQLInputField
    LocalDateTime dateTime;

    @GraphQLInputField
    Long timestamp;
}
