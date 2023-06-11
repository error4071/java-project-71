package hexlet.code;

import static org.assertj.core.api.Assertions.assertThat;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Parser {

    public static void testYML() throws Exception {

        String FileYml1;
        String FileYml2;
        String correctResult;

        FileYml1 = "./src/test/resources/file1.yml";
        FileYml2 = "./src/test/resources/file2.yml";
        correctResult = Files.readString(Paths.get("./src/test/resources/correctResult"));

        String result = Differ.generate(FileYml1, FileYml2);
        assertThat(result).isEqualTo(correctResult);
    }
}