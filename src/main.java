import java.util.Scanner;

public class main {

    public static boolean active = true;
    private static String propertyOfString = "" +
            "\n#^*@&%$^*&@@@^&@#<>@#@??/??.&%%!@" +
            "\n>>PROPERTY_OF_STELLAR_INDUSTRIES>>" +
            "\n>>READING_USER_ACCESS_LEVEL>>";
    private static String readingAccessLevelString = "" +
            "\n>>.........." +
            "\n>>ACCESS_GRANTED_LEVEL_7>>";
    private static String initCodexString = "" +
            "\n>>BEGIN_INIT_SEQUENCE......." +
            "\n>>CODEX_ONLINE>>";
    private static String enterDataPrompt = "> ENTER DATA TO DECODE OR\n> ENTER 'X' TO SHUT DOWN:";

    public static void main(String[] args) {
        showWelcome();
        ConsoleLogger.outputLn();
        ConsoleLogger.outputLn();
        ConsoleLogger.outputLn();
        ConsoleLogger.outputLn();

        while (active) {
            ConsoleLogger.outputLn(enterDataPrompt);
            Scanner input = new Scanner(System.in);
            String data = input.nextLine();
            if (data.toLowerCase().equals("x")) {
                active = false;
            } else {
                System.out.println(decode(data));
            }
        }
    }

    private static void showWelcome() {
        // TODO:
//        System.out.println(gibberish);
        ConsoleLogger.output(propertyOfString);
        ConsoleLogger.output(readingAccessLevelString);
        ConsoleLogger.output(initCodexString);
    }

    private static String decode(String input) {
        String value = "";
        String[] inputs = input.split("");

        for (int i = 0; i < inputs.length; i++) {
            // create line divisions:
            if (i % 3 == 0) {
                value += "\n ";
            }
            if (i % 15 == 0) {
                value += "\n ";
            }

            if (inputs[i].equals("1")) {
                value += "X";
            } else if (inputs[i].equals("0")) {
                value += " ";
            }
        }
        return value;
    }
}
