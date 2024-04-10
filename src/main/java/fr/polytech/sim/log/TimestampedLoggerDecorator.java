package fr.polytech.sim.log;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampedLoggerDecorator extends NamedLogger {
    private final Logger logger;

    /**
     * Constructor.
     *
     * @param logger the base named logger
     */
    protected TimestampedLoggerDecorator(String name, Logger logger) {
        super(name);
        this.logger = logger;
    }

    @Override
    public void writeLog(String message) {
        this.logger.writeLog("[" + LocalDateTime.now().format(DateTimeFormatter.ISO_TIME) + "] " + message);
    }
}
