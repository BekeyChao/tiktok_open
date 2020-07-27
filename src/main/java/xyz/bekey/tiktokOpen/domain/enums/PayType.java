package xyz.bekey.tiktokOpen.domain.enums;

import java.util.Arrays;

/**
 * 付款方式
 */
public enum PayType {
    CashOnDelivery(0), OnlinePayments(1),
    Both(2);

    private int code;

    PayType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static PayType codeOf(int code) {
        return Arrays.stream(values())
                .filter( payType -> payType.code == code )
                .findFirst().orElse(null);
    }


    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
