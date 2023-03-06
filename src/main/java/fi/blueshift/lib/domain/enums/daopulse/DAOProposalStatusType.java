package fi.blueshift.lib.domain.enums.daopulse;

import java.util.Arrays;

public enum DAOProposalStatusType {

    ACCEPTED( "Accepted", "Proposal is accepted"),
    REJECTED ("Rejected", "Proposal is rejected"),
    UNKNOWN("Unknown", "No decision for proposal")
    ;

    private final String typeName;
    private final String description;

    DAOProposalStatusType(String typeName, String description) {
        this.typeName = typeName;
        this.description = description;
    }

    public static DAOProposalStatusType fromType(String type) {
        return Arrays.stream(DAOProposalStatusType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public String getDescription() {
        return description;
    }

    public String getTypeName() {
        return typeName;
    }
}
