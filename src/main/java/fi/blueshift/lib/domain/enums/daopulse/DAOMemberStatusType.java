package fi.blueshift.lib.domain.enums.daopulse;

public enum DAOMemberStatusType {
    ACTIVE,
    DELETED,
    QUIT,
    ADMIN;

    public boolean isActive() {
        return this.equals(ACTIVE) || this.equals(ADMIN);
    }
}
