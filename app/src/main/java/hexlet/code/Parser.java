package hexlet.code;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;
import java.util.Map;

public class Parser {

        public static Map<String, Object> parser(String content, String formatData) throws Exception {
            return switch (formatData) {
                case "yml", "yaml" -> parseYaml(content);
                case "json" -> parseJson(content);
                default -> throw new Exception("Unknown format: '" + formatData + "'");
            };
        }

        public static Map<String, Object> parseJson(String json) throws JsonProcessingException {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, new TypeReference<>() {
            });
        }

        public static Map<String, Object> parseYaml(String yaml) throws JsonProcessingException {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            return mapper.readValue(yaml, new TypeReference<>() {
            });
        }
    }


