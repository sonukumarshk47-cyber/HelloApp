public class HelloArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }

        String result = "";

        // Concatenate all arguments with a comma
        for (int i = 0; i < args.length; i++) {
            result += args[i] + ",";
        }

        // Remove trailing comma using substring
        result = result.substring(0, result.length() - 1);

        // Display output
        System.out.println("Hello " + result);
    }
}