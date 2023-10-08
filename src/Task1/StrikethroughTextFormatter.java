package Task1;

public class StrikethroughTextFormatter implements TextFormatter{
    private TextFormatter wrappedFormatter;

    public StrikethroughTextFormatter(TextFormatter wrappedFormatter) {
        this.wrappedFormatter = wrappedFormatter;
    }

    @Override
    public String format(String text) {
        return "\u001B[9m" + text + "\u001B[0m";
    }
}
