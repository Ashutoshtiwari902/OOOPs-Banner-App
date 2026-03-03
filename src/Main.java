import java.util.HashMap;
import java.util.Map;

public class Main {

    // Map to store character patterns
    private static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        // Step 1: Load patterns
        loadPatterns();

        // Step 2: Render Banner
        renderBanner("OOPS");
    }

    // Load character patterns into HashMap
    private static void loadPatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Render banner using Map lookup
    private static void renderBanner(String word) {

        word = word.toUpperCase();

        for (int row = 0; row < 5; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                if (patternMap.containsKey(ch)) {
                    System.out.print(patternMap.get(ch)[row] + "  ");
                } else {
                    System.out.print("     "); // empty space if char not found
                }
            }

            System.out.println();
        }
    }
}