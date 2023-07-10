package hexlet.code;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Paths;

public class AllTest {
    private static String File1;
    private static String File2;
    private static String File1yml;
    private static String File2yml;
    private static String correctResult;
    private static String PlainCorrectResult;
    private static String defaultFormat;

    @BeforeAll
    public static void beforeAll() throws Exception {
        File1 = "./src/test/resources/json/file1.json";
        File2 = "./src/test/resources/json/file2.json";
        File1yml = "./src/test/resources/yml/file1.yml";
        File2yml = "./src/test/resources/yml/file2.yml";
        correctResult = Files.readString(Paths.get("./src/test/resources/correctResult"));
        PlainCorrectResult = Files.readString(Paths.get("./src/test/resources/PlainCorrectResult"));
        defaultFormat = "stylish";
    }
    @Test
    public void jsonTest() throws Exception {
        String result = Differ.generate(File1, File2, "stylish");
        assertThat(result).isEqualTo(correctResult);
    }
    @Test
    public void ymlTest() throws Exception {
        String result = Differ.generate(File1yml, File2yml, defaultFormat);
        assertThat(result).isEqualTo(correctResult);
    }
    @Test
    public void plainTest() throws Exception {
        String result = Differ.generate(File1, File2, "plain");
        assertThat(result).isEqualTo(PlainCorrectResult);
    }
}