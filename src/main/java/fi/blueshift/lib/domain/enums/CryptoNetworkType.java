package fi.blueshift.lib.domain.enums;


import io.leangen.graphql.annotations.types.GraphQLType;

import java.util.Arrays;

@GraphQLType(name = "Network")
public enum CryptoNetworkType {
    MILKOMEDA_CARDANO("MilkAda", "Milkomeda Cardano C1", "Milkomeda", "Milkomeda extension of Cardano network"),
    MILKOMEDA_ALGORAND("MilkAlgo", "Milkomeda Algorand A1", "Milkomeda Algorand", "Milkomeda extension of Algorand network"),
    KAVA("Kava", "Kava EVM co-Chain", "Kava", "The Kava Network is a blockchain with support the Cosmos SDK and developers of Ethereum."),
    CROSS_CHAIN("Crosschain", "Cross chain", "Crosschain", "Undefined chain protocol with support bridge operations."),
    DEGEN_CHAIN("Degen", "Degen-layer chain", "Degen-layer", "Cross chain protocol for omnichain swaps."),
    POLYGON("Polygon", "Polygon", "Polygon", "Polygon protocol is a Layer 2 commit chain to the Ethereum network."),
    ETHEREUM("Ethereum", "Ethereum", "Ethereum", "Main platform for creating decentralized services based on smart contracts."),
    ARBITRUM("Arbitrum", "Arbitrum", "Arbitrum", "The leading Layer 2 technology blockchain"),
    BERA_CHAIN("Berachain", "Berachain", "Bera", "A modular EVM compatible L1 chain"),
    BOB_CHAIN("Bobchain", "Bobchain", "Bob", "BOB is a hybrid L2 that combines the security of Bitcoin with the versatility of Ethereum"),
    EVM_CHAIN("EVM Based", "EVM chain", "EVM", "EVM Based chain"),
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

    public static CryptoNetworkType getByName(String name){
        try {
            return CryptoNetworkType.valueOf(name);
        }catch (IllegalArgumentException e){
            return null;
        }
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
