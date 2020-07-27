package xyz.bekey.tiktokOpen.utils;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Join  {

    public static final Collector<CharSequence, ?, String> COMMA = Collectors.joining(",");

    public static final Collector<CharSequence, ?, String> VERTICAL = Collectors.joining("|");

    public static final Collector<CharSequence, ?, String> UPUP = Collectors.joining("^");

    public static String kvJoin(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        map.forEach((key, value) -> {
            sb.append(key).append("|")
                    .append(value)
                    .append("^");
        });
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
