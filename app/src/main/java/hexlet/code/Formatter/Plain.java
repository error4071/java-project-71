package hexlet.code.Formatter;

import java.util.TreeSet;
import java.util.Objects;
import java.util.Set;
import java.util.Map;

public class Plain {
    public static String formatPlain(Map<String, Object> file1, Map<String, Object> file2, String format) throws Exception {

        Set<String> keysFromFile = new TreeSet<>(file1.keySet());
        keysFromFile.addAll(file2.keySet());

        String result = "\n";
        for (String key: keysFromFile) {

        if (Objects.equals(file1.get(key), file2.get(key))) {
            result += String.format("") + "\n";
        } else if (!file1.containsKey(key) && (file2.containsKey((key)))) {
            String key1 = complexValue(file1.get(key));
            String key2 = complexValue(file2.get(key));
            result += String.format("Property '" + key + "' was updated. From " + key1 + " to " + key2) + "\n";
        } else if (file1.containsKey(key) && (!file2.containsKey(key))) {
            result += String.format("Property '" + key + "' was removed") + "\n";
        } else if (!file1.containsKey(key) && (file2.containsKey((key)))) {
            String value = complexValue(file2.get(key));
            result += String.format("Property '" + key + "' was added with value: " + value) + "\n";
        }
    }
    return result.toString();
}
    public static String complexValue(Object value) {

        if (value == null) {
            return null;
        } else if (value instanceof String) {
            return "'" + value + "'";
        }
        String stringValue = value.toString();
        boolean isComplexValue = (stringValue.startsWith("[") && stringValue.endsWith("]"))
                || (stringValue.startsWith("{") && stringValue.endsWith("}"));

        if (isComplexValue) {
            stringValue = "[complex value]";
        }
        return stringValue;
    }
}
