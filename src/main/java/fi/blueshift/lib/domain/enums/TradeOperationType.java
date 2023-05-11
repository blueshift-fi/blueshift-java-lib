package fi.blueshift.lib.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import static java.util.Objects.isNull;

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

    public static TradeOperationType getReverseType(TradeOperationType type) {
        if (isNull(type)) {
            return null;
        }
        return type == BUY ? SELL : BUY;
    }
}
