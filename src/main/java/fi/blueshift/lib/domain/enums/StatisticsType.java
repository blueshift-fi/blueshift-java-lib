package fi.blueshift.lib.domain.enums;


public enum StatisticsType {
    TVL_AMOUNT("total value locked", "", true, true),
    FEE_AMOUNT_24H("fee amount by 24h", "", true, true),
    FEE_AMOUNT_7D("fee amount by 7 days", "", true, true),
    FEE_AMOUNT_30D("fee amount by 30 days", "", true, true),
    VOLUME_AMOUNT_24H("trading volume amount by 24h", "", true, true),
    VOLUME_AMOUNT_7D("trading volume amount by 7 days", "", true, true),
    VOLUME_AMOUNT_30D("trading volume amount by 30 days", "", true, true),
    TX_COUNT_24H("transaction count amount by 24h", "", false, false),
    PRICE("price amount", "", true, true),
    ;

    private final String typeName;
    private final String description;
    private final boolean isMonetary;
    private final boolean isDouble;

    StatisticsType(String typeName, String description, boolean isMonetary, boolean isDouble) {
        this.typeName = typeName;
        this.description = description;
        this.isMonetary = isMonetary;
        this.isDouble = isDouble;
    }

    public String getDescription() {
        return description;
    }

    public String getTypeName() {
        return typeName;
    }

    public boolean isMonetary() {
        return isMonetary;
    }

    public boolean isDouble() {
        return isDouble;
    }

}
