package fr.polytech.sim.log;

import java.io.FileWriter;
import java.io.IOException;

/**
 * File logger.
 */
class FileLogger extends NamedLogger {
    private static final String FILE_NAME = "logs.txt";

    /**
     * Constructor.
     *
     * @param name  logger name.
     */
    FileLogger(String name) {
        super(name);
    }

    @Override
    public void writeLog(String message) {
        try (FileWriter fileWriter = new FileWriter(FILE_NAME, true)) {
            fileWriter.write(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
