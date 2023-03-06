package fi.blueshift.lib.domain.enums.daopulse;

import java.util.Arrays;

public enum DAOGovernanceStructureType {

    EQUALS_RIGHTS("equal rights"),
    PROPORTIONAL_TO_DEPOSIT("proportional to deposit")
            ;

    private final String typeName;

    DAOGovernanceStructureType(String typeName) {
        this.typeName = typeName;
    }

    public static DAOGovernanceStructureType fromType(String type) {
        return Arrays.stream(DAOGovernanceStructureType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public String getTypeName() {
        return typeName;
    }
}
