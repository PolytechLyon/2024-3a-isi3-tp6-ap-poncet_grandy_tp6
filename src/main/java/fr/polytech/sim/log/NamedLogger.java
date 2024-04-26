package fr.polytech.sim.log;

/**
 * Name logger that is supposed to log its name along with each log entry, to
 * facilitate tracing.
 */
public abstract class NamedLogger implements Logger {
    final protected String name;

    /**
     * Constructor.
     *
     * @param name  logger name.
     */
    protected NamedLogger(String name) {
        this.name = name;
    }

    /**
     * Cette méthode hydrate le message avec les arguments passés et retourne un message formatté avec un message
     * sur une/plusieurs lignes distinctes
     *
     * @param format le message à formatter
     * @param args les arguments pour hydrater le message
     * @return un message formatté avec les arguments hydratés sur une/plusieurs lignes distinctes
     */
    public void log(String format, Object... args) {
        String entry = String.format(format, args);
        String message=String.format("%s\t%s\n", this.name, entry);
        this.writeLog(message);
    }

    public abstract void writeLog(String message);
}
