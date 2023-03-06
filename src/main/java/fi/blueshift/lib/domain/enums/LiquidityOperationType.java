package fi.blueshift.lib.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LiquidityOperationType {

    DEPOSIT("deposit"),
    WITHDRAW("withdraw"),
    ;

    private final String title;

    LiquidityOperationType(String title) {
        this.title = title;
    }

    @JsonValue
    public String getTitle() {
        return title;
    }
}
