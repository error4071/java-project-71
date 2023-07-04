package hexlet.code.Formatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Plain {
    public static String formatPlain(List<Map<String, Object>> comparison) {
        StringBuilder result = new StringBuilder();
        for (Map<String, Object> keyDiff: comparison) {
            switch (keyDiff.get("status").toString()) {
                case "removed" -> result.append("Property ").append("'")
                        .append(keyDiff.get("key")).append("'").append(" was removed").append("\n");
                case "added" -> result.append("Property ").append(complexValue(keyDiff.get("key")))
                        .append(" was added with value: ")
                        .append(complexValue(keyDiff.get("newValue")))
                        .append("\n");
                case "updated" ->
                        result.append("Property ").append(complexValue(keyDiff.get("key")))
                                .append(" was updated. From ")
                                .append(complexValue(keyDiff.get("oldValue"))).append(" to ")
                                .append(complexValue(keyDiff.get("newValue")))
                                .append("\n");

                default -> result.append("");
            }
        }
        return result.toString().trim();
    }

    public static String complexValue(Object data) {
        if (data instanceof Object[] || data instanceof Collections || data instanceof Map
                || data instanceof ArrayList<?>) {
            return "[complex value]";
        } else if (data instanceof String) {
            return "'" + data + "'";
        } else if (data == null) {
            return null;
        }
        return data.toString();
    }
}