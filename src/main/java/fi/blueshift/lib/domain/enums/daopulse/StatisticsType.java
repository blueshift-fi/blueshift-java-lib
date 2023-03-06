package fi.blueshift.lib.domain.enums.daopulse;


import java.util.List;
import java.util.stream.Collectors;

public enum StatisticsType {
    MEMBERS_COUNT("Members count", "", StatisticOwnerType.DAO, false, false),
    VOTERS_COUNT("Voters count", "", StatisticOwnerType.DAO, false, false),
    ACTIVE_VOTERS_PERCENT("Active voters percent", "", StatisticOwnerType.DAO, true, true),
    PROPOSALS_COUNT("Proposals count", "", StatisticOwnerType.DAO, false, false),
    PROPOSAL_VOTES_COUNT("Votes count", "", StatisticOwnerType.DAO, false, false),
    APR_AMOUNT("Annual percentage rate", "", StatisticOwnerType.DAO, true, true),
    REVENUES_AMOUNT("Revenues amount", "", StatisticOwnerType.DAO, true, true),
    NET_REVENUES_AMOUNT("Net revenues amount", "", StatisticOwnerType.DAO, true, true),
    INFLATION_RATE_AMOUNT("Inflation rate", "", StatisticOwnerType.DAO, true, true),
    TVL_AMOUNT("total value locked", "", StatisticOwnerType.DAO, true, true),
    TOTAL_TREASURY_AMOUNT("Total treasure amount", "", StatisticOwnerType.DAO, true, true),
    LIQUID_TREASURY_AMOUNT("Members count", "", StatisticOwnerType.DAO, true, true),
    ANNUAL_PERCENTAGE_RATE("Annual percentage rate", "", StatisticOwnerType.DAO, true, true),
    DAO_PULSE_RATE("DAO pulse rate", "", StatisticOwnerType.DAO, false, false),
    DAO_PULSE_RATE_CHANGE("DAO pulse rate change", "DAO pulse rate change per week", StatisticOwnerType.DAO, false, true),
    DAO_PULSE_RANK("DAO pulse rank", "", StatisticOwnerType.DAO, false, false),
    DAO_PULSE_RANK_CHANGE("DAO pulse rank change", "DAO pulse rate change per week", StatisticOwnerType.DAO, false, false),

    PRICE("Token price", "", StatisticOwnerType.TOKEN, true, true),
    TRADING_VOLUME("Trading volume", "", StatisticOwnerType.TOKEN, true, true),
    MARKET_CAP("Market cap", "", StatisticOwnerType.TOKEN, true, true),
    TOKEN_HOLDER_COUNT("Holders count", "", StatisticOwnerType.TOKEN, false, false);

    private final String typeName;
    private final String description;
    private final StatisticOwnerType ownerType;
    private final boolean isMonetary;
    private final boolean isDouble;

    StatisticsType(String typeName, String description, StatisticOwnerType ownerType, boolean isMonetary, boolean isDouble) {
        this.typeName = typeName;
        this.description = description;
        this.ownerType = ownerType;
        this.isMonetary = isMonetary;
        this.isDouble = isDouble;
    }

    public static List<StatisticsType> filterStatisticTypeByOwner(StatisticOwnerType statisticOwnerType) {
        return List.of(StatisticsType.values()).parallelStream()
                .filter(t -> t.ownerType.equals(statisticOwnerType)).collect(Collectors.toList());
    }

    public String getDescription() {
        return description;
    }

    public String getTypeName() {
        return typeName;
    }

    public StatisticOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isMonetary() {
        return isMonetary;
    }

    public boolean isDouble() {
        return isDouble;
    }

    public enum StatisticOwnerType {
        DAO,
        TOKEN
    }
}
