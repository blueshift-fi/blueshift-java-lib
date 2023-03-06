package fi.blueshift.lib.domain.enums;


import io.leangen.graphql.annotations.types.GraphQLType;

import java.util.Arrays;

@GraphQLType(name = "NetworkEnvironment")
public enum CryptoNetworkEnvironmentType {
    MAINNET("mainnet"),
    TESTNET("testnet"),
    ;

    private final String typeName;

    CryptoNetworkEnvironmentType(String typeName) {
        this.typeName = typeName;
    }

    public static CryptoNetworkEnvironmentType fromType(String type) {
        return Arrays.stream(CryptoNetworkEnvironmentType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public String getTypeName() {
        return typeName;
    }
}
