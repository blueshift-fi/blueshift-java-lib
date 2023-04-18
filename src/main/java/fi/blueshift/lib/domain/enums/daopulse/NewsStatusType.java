package fi.blueshift.lib.domain.enums.daopulse;

import java.util.Arrays;

public enum NewsStatusType {

    CREATED("Created", ""),
    PUBLISHED("Published", ""),
    DELETED("Deleted", ""),
    ;

    private final String typeName;
    private final String description;

    NewsStatusType(String typeName, String description) {
        this.typeName = typeName;
        this.description = description;
    }

    public static NewsStatusType fromType(String type) {
        return Arrays.stream(NewsStatusType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public static NewsStatusType getDefault() {
        return NewsStatusType.PUBLISHED;
    }

    public String getDescription() {
        return description;
    }

    public String getTypeName() {
        return typeName;
    }
}
