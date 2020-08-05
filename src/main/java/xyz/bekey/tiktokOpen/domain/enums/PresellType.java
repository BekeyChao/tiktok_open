package xyz.bekey.tiktokOpen.domain.enums;

/**
 * 预售
 */
public enum PresellType {
    Not(0), Full(1);

    private int code;

    PresellType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static PresellType codeOf(int code) {
        if (code == 1) {
            return PresellType.Full;
        }
        return PresellType.Not;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
