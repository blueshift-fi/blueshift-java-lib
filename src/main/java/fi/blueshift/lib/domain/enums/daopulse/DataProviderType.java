package fi.blueshift.lib.domain.enums.daopulse;

import java.util.List;

public enum DataProviderType {

    SYSTEM,
    COINMARKETCAP,
    COINGECKO,
    DEFILLAMA,
    GLASSNODE,
    BITQUERY,
    SNAPSHOT,
    BOARDROOM
    ;

    public static DataProviderType getByName(String name) {
        return List.of(DataProviderType.values()).parallelStream()
                .filter(c -> c.name().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
