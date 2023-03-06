package fi.blueshift.lib.domain.enums.daopulse;

import java.util.List;

public enum CurrencyCategoryType {
    FIAT("fiat"),
    COIN("coin"),
    TOKEN("token");

    private final String nativeName;

    CurrencyCategoryType(String nativeName) {
        this.nativeName = nativeName;
    }

    public static CurrencyCategoryType getByNativeName(String name) {
        return List.of(CurrencyCategoryType.values()).parallelStream()
                .filter(c -> c.nativeName.equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public boolean isFiat() {
        return this == FIAT;
    }
}
