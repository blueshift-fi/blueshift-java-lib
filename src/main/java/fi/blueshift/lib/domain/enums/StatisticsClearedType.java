package fi.blueshift.lib.domain.enums;


import java.util.Arrays;

public enum StatisticsClearedType {
    PORTFOLIO_STATISTIC("portfolio cleared statistic"),
    PORTFOLIO_RAW_STATISTIC("portfolio raw statistic"),
    LAST_PORTFOLIO_STATISTIC("last statistic for portfolio entry"),
    SUMMARY_STATISTIC("summary cleared statistic by every network (from portfolio data)"),
    TOTAL_SUMMARY_STATISTIC("total summary statistic by all networks"),
    TOKEN_STATISTIC("token cleared statistic"),
    TOKEN_RAW_STATISTIC("token raw statistic"),
    TOKEN_TVL_RAW("token tvl raw statistic historical"),
    TOKEN_PRICE_RAW("token price raw statistic historical"),
    LAST_TOKEN_STATISTIC("last statistic for token entry"),
    ;

    private final String typeName;

    StatisticsClearedType(String typeName) {
        this.typeName = typeName;
    }

    public static StatisticsClearedType fromType(String type) {
        return Arrays.stream(StatisticsClearedType.values()).parallel()
                .filter(l -> l.name().equalsIgnoreCase(type))
                .findFirst().orElse(null);
    }

    public String getTypeName() {
        return typeName;
    }
}
