public class main {

    public static void main(String[] args) {
        System.out.println("Decoding:");
        String s = "";
//        for (:
//             ) {
//
//        }
        for (String arg : args) {
            s += arg.toString();
        };

        if (args.length > 0) {
            String message = "";
            String input = args[0];
            message = decode(input);
            System.out.println(message);
        }
    }

    private static String decode(String input) {
        String value = "";
        String[] inputs = input.split("");

        for (int i = 0; i < inputs.length; i++) {
            // create line divisions:
            if (i % 3 == 0) {
                value += "\n";
            }
            if (i % 15 == 0) {
                value += "\n";
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
