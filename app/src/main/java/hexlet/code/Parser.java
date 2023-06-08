package hexlet.code;

import org.junit.jupiter.api.BeforeAll;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class Parser {

    private static String FileYml1;
    private static String FileYml2;
    private static String correctResult;

    @BeforeAll
    public static void beforeAll() throws Exception {

        FileYml1 = "./src/test/resources/file1.yml";
        FileYml2 = "./src/test/resources/file2.yml";
        correctResult = Files.readString(Paths.get("./src/test/resources/correctResult"));

        String result = Differ.generate(FileYml1, FileYml2);
        assertThat(result).isEqualTo(correctResult);
    }
}