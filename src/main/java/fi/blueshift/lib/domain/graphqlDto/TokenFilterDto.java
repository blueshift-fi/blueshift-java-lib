package fi.blueshift.lib.domain.graphqlDto;


import fi.blueshift.lib.domain.enums.CryptoNetworkType;
import io.leangen.graphql.annotations.types.GraphQLType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.List;

@GraphQLType(name = "Token_filter", isStrictName = true)
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TokenFilterDto {

    String addressId;

    List<String> addressId_in;

    String addressId_not;

    String name;

    String symbol_contains;

    CryptoNetworkType network;

    Boolean visible;
}
