package Task1;

public class BoldTextFormatter implements TextFormatter{
    private TextFormatter wrappedFormatter;

    public BoldTextFormatter(TextFormatter wrappedFormatter) {
        this.wrappedFormatter = wrappedFormatter;
    }

    @Override
    public String format(String text) {
        return "\u001B[1m" + text + "\u001B[0m";
    }
}
