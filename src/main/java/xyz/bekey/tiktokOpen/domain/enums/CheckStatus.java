package xyz.bekey.tiktokOpen.domain.enums;

public enum CheckStatus {

    Unreviewed(1), Reviewing(2),
    Approved(3), ReviewRejected(4),
    Ban(5);

    private int code;

    CheckStatus(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
