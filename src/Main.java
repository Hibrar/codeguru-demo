public class Main {
    public static void main(String[] args) {
        String name = null;
        System.out.println("Name length: " + name.length()); // Risk: NullPointerException

        for (int i = 0; i < 1000000; i++) { // Inefficient loop
            if (i == 999999) {
                System.out.println("Finished running loop.");
            }
        }
    }
}
