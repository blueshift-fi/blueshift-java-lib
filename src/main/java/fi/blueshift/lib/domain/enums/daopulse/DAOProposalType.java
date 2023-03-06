package fi.blueshift.lib.domain.enums.daopulse;

import java.util.Arrays;

public enum DAOProposalType {

    DEFAULT("Default", ""),
    MEMBERSHIP("Membership", "Tributing capital and Requesting new shares to join the DAO"),
    TOKEN("Token", "Tributing Spoils or Requesting funds from the DAO to work on internal projects and improvements"),
    TRADE("Trade", "Request the DAO to swap one asset for another within the War Chest"),
    GUILKICK("GuildKick", "Request to forcibly remove a malicious member through a vote"),
    MINION("Minion", "A contract that allows execution of arbitrary calls i.e swapping assets in the DAO bank");

    private final String typeName;
    private final String description;

    DAOProposalType(String typeName, String description) {
        this.typeName = typeName;
        this.description = description;
    }

    public static DAOProposalType fromType(String type) {
        return Arrays.stream(DAOProposalType.values()).parallel()
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
