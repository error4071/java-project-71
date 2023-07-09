package hexlet.code;

import hexlet.code.Formatter.Plain;
import hexlet.code.Formatter.Stylish;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

public class Format {
    public static String formatStyle(Map <String, Object> file1, Map <String, Object> file2, String format) throws Exception {
        switch (format) {
            case "stylish":
                return Stylish.formatStylish(file1, file2, format);

            default:
                throw new Error("Unknown format: " + format);
        }
    }
}