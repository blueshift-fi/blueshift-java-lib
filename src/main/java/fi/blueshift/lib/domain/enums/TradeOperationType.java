package fi.blueshift.lib.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TradeOperationType {

    BUY("buy"),
    SELL("sell");

    private final String title;

    TradeOperationType(String title) {
        this.title = title;
    }

    @JsonValue
    public String getTitle() {
        return title;
    }

    public TradeOperationType getReverseType() {
        return this == BUY ? SELL : BUY;
    }
}
