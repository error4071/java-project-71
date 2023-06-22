package hexlet.code;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class Formatter {
    public static String format(List<DiffResult> formedList) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(formedList);
    }
}