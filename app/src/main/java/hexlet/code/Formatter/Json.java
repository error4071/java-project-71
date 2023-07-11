package hexlet.code.Formatter;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;
public class Json {
    public static String formatJson(List<Map<String, Object>> formedList) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(formedList);
    }
}

