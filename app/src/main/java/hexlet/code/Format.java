package hexlet.code;

import hexlet.code.Formatter.Plain;
import hexlet.code.Formatter.Json;
import java.io.IOException;

import java.util.List;
import java.util.Map;

public class Format {
    public static String format(List<Map<String, Object>> comparison, String format) throws IOException{
        switch("format") {
            case "plain":
                return Plain.formatPlain(comparison);
            default:
                throw new Error("Unknown format: " + format);
        }
    }
}