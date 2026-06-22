package semantic;

/**
 * A single finding produced by the Semantic Analysis phase.
 * Shared by both pipelines (Python/Flask and HTML/CSS/Jinja2) so the runner can
 * aggregate, sort and print every diagnostic in one place.
 */
public class SemanticError {

    public enum Severity {
        ERROR, WARNING
    }

    public final String phase;   // "Python", "HTML", "CSS", "Jinja"
    public final String message;
    public final int line;
    public final Severity severity;

    public SemanticError(String phase, String message, int line, Severity severity) {
        this.phase = phase;
        this.message = message;
        this.line = line;
        this.severity = severity;
    }

    public static SemanticError error(String phase, String message, int line) {
        return new SemanticError(phase, message, line, Severity.ERROR);
    }

    public static SemanticError warning(String phase, String message, int line) {
        return new SemanticError(phase, message, line, Severity.WARNING);
    }

    @Override
    public String toString() {
        return String.format("  %-7s [%-6s] line %-3d : %s",
                severity, phase, line, message);
    }
}
