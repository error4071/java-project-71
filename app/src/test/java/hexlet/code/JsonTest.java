package hexlet.code;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonTest {

    @Test
    public static void jsonTest() throws Exception {

        String File1 = "./src/test/resources/file1.json";
        String File2 = "./src/test/resources/file2.json";
        String correctResult = Files.readString(Paths.get("./src/test/resources/correctResult"));

        String result = Differ.generate(File1, File2);
        assertThat(result).isEqualTo(correctResult);
    }
}