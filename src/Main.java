public class Main {
    public static void main(String[] args) {

        printBanner();
    }

    public static void printBanner() {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        String[] banner = new String[o.length];

        for (int i = 0; i < o.length; i++) {
            banner[i] = String.join("  ", o[i], o[i], p[i], s[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String[] buildO() {
        return new String[]{
                "OOOO",
                "O  O",
                "O  O",
                "O  O",
                "OOOO"
        };
    }

    public static String[] buildP() {
        return new String[]{
                "PPPP",
                "P   P",
                "PPPP",
                "P",
                "P"
        };
    }

    public static String[] buildS() {
        return new String[]{
                "SSSS",
                "S",
                "SSSS",
                "    S",
                "SSSS"
        };
    }
}


