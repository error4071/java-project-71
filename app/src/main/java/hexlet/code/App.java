package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "gendiff",
        description = "Compares two configuration files and shows a difference.")

public final class App {

        @Parameters(paramLabel = "filepath1", index = "0", description = "path to first file")
        private String filePath1;
        @Parameters(paramLabel = "filepath2", index = "1", description = "path to second file")
        private String filePath2;
        @Option(names = {"-f", "--format"}, paramLabel = "format",
                description = "output format: [default: stylish]", defaultValue = "stylish")
        private String format;
        @Option(names = {"-h", "--help"}, usageHelp = true, description = "Show this help message and exit.")
        boolean usageHelpRequested;
        @Option(names = {"-V", "--version"}, versionHelp = true, description = "Print version information and exit.")
        boolean versionInfoRequested;

        public static void main(String[] args) {
                int exitCode = new CommandLine(new App()).execute(args);
                System.exit(exitCode);
        }
}