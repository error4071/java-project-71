package hexlet.code;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonTest {
    private static String File1;
    private static String File2;
    private static String correctResult;
    @BeforeAll
    public static void beforeAll() throws Exception {
        File1 = "./src/test/resources/file1.json";
        File2 = "./src/test/resources/file2.json";
        correctResult = Files.readString(Paths.get("./src/test/resources/correctResult"));
    }
    @Test
    public void jsonTest() throws Exception {
        String result = Differ.generate(File1, File2);
        assertThat(result).isEqualTo(correctResult);
    }
}