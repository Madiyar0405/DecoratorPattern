package Task1;

import java.util.List;
import java.util.ArrayList;

public class CompositeTextFormatter implements TextFormatter {
    private List<TextFormatter> formatters;

    public CompositeTextFormatter(TextFormatter... formatters) {
        this.formatters = new ArrayList<>();
        for (TextFormatter formatter : formatters) {
            this.formatters.add(formatter);
        }
    }

    @Override
    public String format(String text) {
        for (TextFormatter formatter : formatters) {
            text = formatter.format(text);
        }
        return text;
    }
}
