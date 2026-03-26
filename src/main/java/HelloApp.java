public class DisplayNames {
    public static void main(String[] args) {
        // 1. Create an array of strings to hold multiple names
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};

        System.out.println("Displaying all names in the list:");
        System.out.println("---------------------------------");

        // 2. Use a 'for-each' loop to go through every name in the array
        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }
    }
}