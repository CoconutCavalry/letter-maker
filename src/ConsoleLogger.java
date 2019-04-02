public class ConsoleLogger {

    private static boolean noLineWrap = false;
    private static boolean delay = false;
    private static boolean delayByCharacter = true;

    private static int MAX_CHAR_LENGTH = 50;

    /**
     * Created in order to be able to easily change
     * the output method for the game.
     * @param content the content to be outputted
     */
    public static void output(String content) {
        if (noLineWrap) {
            showLong(content);
        } else if (delay) {
            showWithDelay(content);
        } else if (delayByCharacter) {
            showWithDelayByCharacter(content);
        } else {
            System.out.println(content);
        }
    }

    private static void showWithDelay(String content) {
        String[] contentArr = content.split("\n");
        for (String c : contentArr) {
            System.out.println(c);
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private static void showWithDelayByCharacter(String content) {
        String[] contentArr = content.split("");
        for (String c : contentArr) {
            if (!c.equals(" ")) {
                try {
                    Thread.sleep(250);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.print(c);
        }
    }

    public static void outputForInput(String content) {
        System.out.print(content);
    }

    public static void outputLn(String content) {
        System.out.println(content);
    }
    public static void outputLn() {
        System.out.println();
    }

    private static void showLong(String content) {
        String[] contentArr = content.split("\n");
        for (String c : contentArr) {
            int origin = 0;
            String remaining = c;

            String s = "";
            while (remaining.length() > MAX_CHAR_LENGTH) {
                s = remaining.substring(origin, MAX_CHAR_LENGTH);
                remaining = remaining.substring(MAX_CHAR_LENGTH);
                if (!s.contains("\n")) {
                    String[] sArr = s.split("\n");
                    printEachArrayElementOnNewLine(sArr);
                } else {
                    System.out.println(s);
                }
            }
            System.out.println(remaining);
        }
    }

    private static void printEachArrayElementOnNewLine(String[] stringArr) {
        for (String s : stringArr) {
            System.out.println(s);
        }
    }

}
