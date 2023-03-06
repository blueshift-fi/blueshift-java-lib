package fi.blueshift.lib.domain.enums;


import io.leangen.graphql.annotations.types.GraphQLType;

import java.util.Arrays;

@GraphQLType(name = "Network")
public enum CryptoNetworkType {
    MILKOMEDA_CARDANO("MilkAda", "Milkomeda Cardano C1", "Milkomeda", "Milkomeda extension of Cardano network"),
    MILKOMEDA_ALGORAND("MilkAlgo", "Milkomeda Algorand A1", "Milkomeda Algorand", "Milkomeda extension of Algorand network"),
    KAVA("Kava", "Kava EVM co-Chain", "Kava", "The Kava Network is a blockchain with support the Cosmos SDK and developers of Ethereum."),
    BLUES_CHAIN("Blues", "Blueshift chain", "Blueshift", "The Blueshift chain is a blockchain with support the Cosmos SDK."),
    ;

    private final String typeName;
    private final String displayName;
    private final String shortName;
    private final String description;


    CryptoNetworkType(String typeName, String displayName, String shortName, String description) {
        this.typeName = typeName;
        this.displayName = displayName;
        this.shortName = shortName;
        this.description = description;
    }

    public static CryptoNetworkType fromType(String type) {
        return Arrays.stream(CryptoNetworkType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public String getDescription() {
        return description;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getShortName() {
        return shortName;
    }

}
