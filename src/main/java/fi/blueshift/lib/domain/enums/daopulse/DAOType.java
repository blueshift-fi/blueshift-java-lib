package fi.blueshift.lib.domain.enums.daopulse;

import java.util.Arrays;

public enum DAOType {

    SOCIAL_DAO("Social", "Social group that wants to have a DAO for whatever reason (Dave DAO, guilds, etc)"),
    PROTOCOL_DAO("Protocol", "DAO that manages a protocol (Uniswap, Maker, ENS)"),
    CORPORATE_DAO("Corporate", "DAO with express purpose to have a profitable business (can also be a цэцэг protocol DAO) (Index COOP, Compound)"),
    OWNERSHIP_DAO("Ownership", "DAO with the purpose to own, maintain and share a physical or digital thing or funds (Constitution DAO, PleaserDAO, MetaCartel Ventures)"),
    REAL_LIFE_DAO("Real-life", "on-chain governance / control / sharing / voting for something based in real life (DeFi Advocacy DAO, MarketingDAO)");

    private final String typeName;
    private final String description;

    DAOType(String typeName, String description) {
        this.typeName = typeName;
        this.description = description;
    }

    public static DAOType fromType(String type) {
        return Arrays.stream(DAOType.values()).parallel()
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
