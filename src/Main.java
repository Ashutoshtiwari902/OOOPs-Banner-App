public class Main {
    public static void main(String[] args) {

        printBanner();
    }

    /**
     * Prints OOPS banner using String array and loop
     */
    public static void printBanner() {

        // Store all banner lines inside an array
        String[] banner = {
                String.join("  ", "OOOO", "OOOO", "PPPP", "SSSS"),
                String.join("  ", "O  O", "O  O", "P   P", "S"),
                String.join("  ", "O  O", "O  O", "PPPP", "SSSS"),
                String.join("  ", "O  O", "O  O", "P", "    S"),
                String.join("  ", "OOOO", "OOOO", "P", "SSSS")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}