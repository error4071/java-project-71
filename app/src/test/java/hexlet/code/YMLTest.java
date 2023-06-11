package hexlet.code;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.nio.file.Files;
import java.nio.file.Paths;

public class YMLTest {
    @Test
    public void ymlTest() throws Exception {
        String File1yml = "./src/test/resources/file1.yml";
        String File2yml = "./src/test/resources/file2.yml";
        String correctResult = Files.readString(Paths.get("./src/test/resources/correctResult"));

        String result = Differ.generate(File1yml, File2yml);
        assertThat(result).isEqualTo(correctResult);
    }
}