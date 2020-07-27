package xyz.bekey.tiktokOpen.utils;

import xyz.bekey.tiktokOpen.exceptions.BadQueryException;

import java.util.Objects;

public class AssertUtils {

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new BadQueryException(message);
        }
    }

    public static void notNull(Object obj, String message) {
        if (Objects.isNull(obj)) {
            throw new BadQueryException(message);
        }
    }

}
