package hexlet.code;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Differ {
    public static String generate(String filePath1, String filePath2) throws Exception {

        Path getFile1 = Paths.get(filePath1);
        Path getFile1Location = getFile1.toAbsolutePath().normalize();
        String content1 = Files.readString(getFile1Location);
        ObjectMapper objectMapper1 = new ObjectMapper();
        Map<String, Object> file1 = objectMapper1.readValue(content1, new TypeReference<>(){});

        Path getFile2 = Paths.get(filePath2);
        Path getFile2Location = getFile2.toAbsolutePath().normalize();
        String content2 = Files.readString((getFile2Location));
        ObjectMapper objectMapper2 = new ObjectMapper();
        Map<String, Object> file2 = objectMapper2.readValue(content2, new TypeReference<>(){});

        Set<String> keyFile = new TreeSet<>(file1.keySet());
        keyFile.addAll(file2.keySet());

        String result = "{\n";
        for(String key: keyFile) {
            if (file1.containsKey(key) && file2.containsKey(key) && file1.get(key).equals(file2.get(key))) {
                result += String.format("    %s: %s\n", key, file1.get(key));
//            } else if () {
//                result += String.format("    %s: %s\n", key, );
//            } else if () {
//                result += String.format("    %s: %s\n", key, );
//            } else () {
//                result += String.format("    %s: %s\n", key, );
            }
        }
        return result;
    }
}