package hexlet.code;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.nio.file.Files;
import java.nio.file.Paths;

public class YMLTest {

    private static String File1yml;
    private static String File2yml;
    private static String correctResult;

    @Test
    public static void ymlTest() throws Exception {
        File1yml = "./src/test/resources/file1.yml";
        File2yml = "./src/test/resources/file2.yml";
        correctResult = Files.readString(Paths.get("./src/test/resources/correctResult"));

        String result = Differ.generate(File1yml, File2yml);
        assertThat(result).isEqualTo(correctResult);
    }
}