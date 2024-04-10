package fr.polytech.sim.log;

public class LoggerFactory {
    public static NamedLogger createNamedLogger(String name) {
        return new TimestampedLoggerDecorator(name, new ConsoleLogger(name));
    }
}
