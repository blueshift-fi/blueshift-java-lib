package fi.blueshift.lib.domain.enums.daopulse;

import java.util.Arrays;

public enum DAOPowerOfControlType {

    PROTOCOL_PARAMETERS("Protocol parameters"),
    FULL_CONTROL_OF_PROTOCOL("Full control of a protocol")
            ;


    private final String typeName;

    DAOPowerOfControlType(String typeName) {
        this.typeName = typeName;
    }

    public static DAOPowerOfControlType fromType(String type) {
        return Arrays.stream(DAOPowerOfControlType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public String getTypeName() {
        return typeName;
    }
}
