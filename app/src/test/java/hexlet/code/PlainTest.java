package hexlet.code;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Paths;

public class PlainTest {
    private static String File1;
    private static String File2;
    private static String PlainCorrectResult;
    private static String defaultFormat;

    @BeforeAll
    public static void beforeAll() throws Exception {
        File1 = "./src/test/resources/json/file1.json";
        File2 = "./src/test/resources/json/file2.json";
        PlainCorrectResult = Files.readString(Paths.get("./src/test/resources/PlainCorrectResult"));
        defaultFormat = "stylish";
    }
    @Test
    public void jsonTest() throws Exception {
        String result = Differ.generate(File1, File2, "stylish");
        assertThat(result).isEqualTo(PlainCorrectResult);
    }


}