package fi.blueshift.lib.domain.enums.daopulse;

import java.util.Arrays;

import static org.apache.commons.lang3.StringUtils.isBlank;

public enum DAOProposalStateType {

    VOTING("Voting", "Proposal is in active or voting phase", "active"),
    PENDING("Pending", "Proposal is pending for start", "pending"),
    CLOSED("Closed", "Proposal was closed for voting", "closed"),
    CORE("Core", "", "core"),
    UNKNOWN("Unknown", "", "");

    private final String typeName;
    private final String description;

    private final String snapshotName;

    DAOProposalStateType(String typeName, String description, String snapshotName) {
        this.typeName = typeName;
        this.description = description;
        this.snapshotName = snapshotName;
    }

    public static DAOProposalStateType fromType(String type) {
        return Arrays.stream(DAOProposalStateType.values()).parallel()
                .filter(l -> l.typeName.equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public static DAOProposalStateType fromSnapshotName(String snapshotType) {
        if (isBlank(snapshotType)) {
            return null;
        }
        return Arrays.stream(DAOProposalStateType.values()).parallel()
                .filter(l -> l.snapshotName.equalsIgnoreCase(snapshotType))
                .findFirst().orElse(null);
    }

    public String getDescription() {
        return description;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getSnapshotName() {
        return snapshotName;
    }
}
