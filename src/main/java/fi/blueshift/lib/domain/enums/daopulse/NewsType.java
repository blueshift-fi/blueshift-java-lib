package fi.blueshift.lib.domain.enums.daopulse;

import java.util.Arrays;

public enum NewsType {

    NEWS("News", ""),
    PROPOSAL("Proposal", ""),
    EVENTS("Events", ""),
    ;

    private final String typeName;
    private final String description;

    NewsType(String typeName, String description) {
        this.typeName = typeName;
        this.description = description;
    }

    public static NewsType fromType(String type) {
        return Arrays.stream(NewsType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public static NewsType getDefault() {
        return NewsType.NEWS;
    }

    public String getDescription() {
        return description;
    }

    public String getTypeName() {
        return typeName;
    }
}
