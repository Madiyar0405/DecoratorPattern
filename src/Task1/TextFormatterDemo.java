package Task1;
import java.util.Scanner;

public class TextFormatterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userText = getUserInput(scanner);
        TextFormatter textFormatter = selectFormatter(scanner);
        String formattedText = formatText(userText, textFormatter);

        displayFormattedText(formattedText);

    }
    private static String getUserInput(Scanner scanner){
        System.out.print("Enter text: ");
        return scanner.nextLine();
    }
    private static TextFormatter selectFormatter(Scanner scanner){
        System.out.println("Choose formatting:");
        System.out.println("1. Italic + Bold");
        System.out.println("2. Italic + Underline");
        System.out.println("3. Bold + StrikeThrough");
        System.out.println("4. Italic + StrikeThrough");
        System.out.println("5. All at once");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        TextFormatter textFormatter = new PlainTextFormatter();


        if (choice == 1) {
            textFormatter = new CompositeTextFormatter(new BoldTextFormatter(new PlainTextFormatter()),new ItalicTextFormatter(new PlainTextFormatter()));
        } else if (choice == 2) {
            textFormatter = new CompositeTextFormatter(new ItalicTextFormatter(new PlainTextFormatter()),new UnderlineTextFormatter(new PlainTextFormatter()));
        }else if (choice == 3) {
            textFormatter = new CompositeTextFormatter(new BoldTextFormatter(new PlainTextFormatter()),new StrikethroughTextFormatter(new PlainTextFormatter()));
        }else if (choice == 4) {
            textFormatter = new CompositeTextFormatter(new ItalicTextFormatter(new PlainTextFormatter()),new StrikethroughTextFormatter(new PlainTextFormatter()));
        }else if (choice == 5) {
            textFormatter =new CompositeTextFormatter(new BoldTextFormatter(new PlainTextFormatter()),new ItalicTextFormatter(new PlainTextFormatter()),new StrikethroughTextFormatter(new PlainTextFormatter()), new UnderlineTextFormatter(new PlainTextFormatter()));
        }
        return textFormatter;
    }

    private static String formatText(String userText, TextFormatter textFormatter) {
        return textFormatter.format(userText);
    }
    private static void displayFormattedText(String formattedText) {
        System.out.println("Formatted text: " + formattedText);
    }
}
