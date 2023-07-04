package hexlet.code.Formatter;

import hexlet.code.DiffResult;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Json {
    public static String format(List<DiffResult> formedList) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(formedList);
    }
}

