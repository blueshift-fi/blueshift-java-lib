package fi.blueshift.lib.domain.enums.daopulse;

import java.util.Arrays;

public enum NewsSourceCollectorType {

    NONE("None", ""),
    ALEXANDRIA("alexandria", "CoinMarketCap Alexandria library collector with strategy 'to collect, if possible, all of the information about cryptocurrency in the world."),
    GRAVITY("Tweets", "Small and middle size announcements that was collected or posted through CoinMarketCap");

    private final String typeName;
    private final String description;

    NewsSourceCollectorType(String typeName, String description) {
        this.typeName = typeName;
        this.description = description;
    }

    public static NewsSourceCollectorType fromType(String type) {
        return Arrays.stream(NewsSourceCollectorType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public static NewsSourceCollectorType getDefault() {
        return NewsSourceCollectorType.NONE;
    }

    public String getDescription() {
        return description;
    }

    public String getTypeName() {
        return typeName;
    }
}
