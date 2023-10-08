package Task1;

public class ItalicTextFormatter implements TextFormatter{
    private TextFormatter wrappedFormatter;

    public ItalicTextFormatter(TextFormatter wrappedFormatter) {
        this.wrappedFormatter = wrappedFormatter;
    }

    @Override
    public String format(String text) {
        return "\u001B[3m" + text + "\u001B[0m";
    }
}
