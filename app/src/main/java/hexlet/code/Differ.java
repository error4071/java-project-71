package hexlet.code;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import static picocli.CommandLine.Help.Ansi.Style.parse;

public class Differ {
    public static Map getData(String content) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        String file1 = "{\"host\":\"hexlet.io\", \"timeout\":\"50\", \"proxy\":\"123.234.53.22\", \"follow\":\"false\"}";
        Map<String, Object> map
                = objectMapper.readValue(file1, new TypeReference<Map<String, Object>>(){});
        String file2 = "{\"timeout\":\"20\", \"verbose\":\"true\", \"host\":\"hexlet.io\"}";
        Map<String, Object> map2
                = objectMapper.readValue(file2, new TypeReference<Map<String, Object>>(){});

        return null;
    }
}
