package fi.blueshift.lib.domain.enums.daopulse;

import java.util.Arrays;

public enum DAOParticipationType {

    OPEN("Open"),
    RESTRICTED("Restricted");

    private final String typeName;

    DAOParticipationType(String typeName) {
        this.typeName = typeName;
    }

    public static DAOParticipationType fromType(String type) {
        return Arrays.stream(DAOParticipationType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public String getTypeName() {
        return typeName;
    }
}
