package hexlet.code;

import hexlet.code.Differ;
import org.junit.jupiter.api.BeforeEach;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonTest {

    private String File1;
    private String File2;
    private String correctResult;

    @BeforeEach
    public void beforeEach() throws Exception {

        File1 = "./src/test/resources/file1.json";
        File2 = "./src/test/resources/file2.json";
        correctResult = Files.readString(Paths.get("./src/test/resources/correctResult"));

        String result = Differ.generate(File1, File2);
        assertThat(result).isEqualTo(correctResult);

    }
}