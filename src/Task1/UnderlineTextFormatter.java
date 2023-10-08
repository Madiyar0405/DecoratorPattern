package Task1;

public class UnderlineTextFormatter implements TextFormatter{
    private TextFormatter wrappedFormatter;

    public UnderlineTextFormatter(TextFormatter wrappedFormatter) {
        this.wrappedFormatter = wrappedFormatter;
    }

    @Override
    public String format(String text) {
        return "\u001B[4m" + text+ "\u001B[0m";
    }
}
