package fi.blueshift.lib.domain.enums.daopulse;

import java.util.Arrays;

public enum DAOTechnologyType {

    MOLOCH("Moloch");

    private final String typeName;

    DAOTechnologyType(String typeName) {
        this.typeName = typeName;
    }

    public static DAOTechnologyType fromType(String type) {
        return Arrays.stream(DAOTechnologyType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public String getTypeName() {
        return typeName;
    }
}
