import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        printBanner("OOPS");
    }

    public static void printBanner(String word) {

        CharacterPatternMap patternMap = new CharacterPatternMap();

        int height = 5; // number of rows in each character

        String[] banner = new String[height];

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.getPattern(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                }
            }

            banner[row] = lineBuilder.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    /**
     * Static Inner Class to manage character-pattern mappings
     */
    static class CharacterPatternMap {

        private final Map<Character, String[]> patternMap;

        public CharacterPatternMap() {

            patternMap = new HashMap<>();

            patternMap.put('O', new String[]{
                    "OOOO",
                    "O  O",
                    "O  O",
                    "O  O",
                    "OOOO"
            });

            patternMap.put('P', new String[]{
                    "PPPP",
                    "P   P",
                    "PPPP",
                    "P",
                    "P"
            });

            patternMap.put('S', new String[]{
                    "SSSS",
                    "S",
                    "SSSS",
                    "    S",
                    "SSSS"
            });
        }

        public String[] getPattern(char character) {
            return patternMap.get(Character.toUpperCase(character));
        }
    }
}