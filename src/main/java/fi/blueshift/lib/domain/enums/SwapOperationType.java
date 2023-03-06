package fi.blueshift.lib.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SwapOperationType {

    BUY("buy"),
    SELL("sell"),
    ;

    private final String title;

    SwapOperationType(String title) {
        this.title = title;
    }

    @JsonValue
    public String getTitle() {
        return title;
    }
}
