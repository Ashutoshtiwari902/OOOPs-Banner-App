public class Main {
    public static void main(String[] args) {

        printBanner();
    }

    /**
     * Prints OOPS banner using concise array initialization
     */
    public static void printBanner() {

        String[] banner = new String[5];

        banner[0] = String.join("  ", "OOOO", "OOOO", "PPPP", "SSSS");
        banner[1] = String.join("  ", "O  O", "O  O", "P   P", "S");
        banner[2] = String.join("  ", "O  O", "O  O", "PPPP", "SSSS");
        banner[3] = String.join("  ", "O  O", "O  O", "P", "    S");
        banner[4] = String.join("  ", "OOOO", "OOOO", "P", "SSSS");

        for (String line : banner) {
            System.out.println(line);
        }
    }
}