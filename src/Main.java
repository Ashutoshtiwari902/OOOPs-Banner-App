public class Main {
    public static void main(String[] args) {

        printBanner();
    }

    /**
     * Prints OOPS banner using String.join()
     */
    public static void printBanner() {

        String line1 = String.join("  ",
                "OOOO",
                "OOOO",
                "PPPP",
                "SSSS");

        String line2 = String.join("  ",
                "O  O",
                "O  O",
                "P   P",
                "S");

        String line3 = String.join("  ",
                "O  O",
                "O  O",
                "PPPP",
                "SSSS");

        String line4 = String.join("  ",
                "O  O",
                "O  O",
                "P",
                "    S");

        String line5 = String.join("  ",
                "OOOO",
                "OOOO",
                "P",
                "SSSS");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}