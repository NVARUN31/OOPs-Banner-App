import java.util.HashMap;
import java.util.Map;

public class OOPSBANNERAPP5 {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Store character patterns in map
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));

        String word = "OOPS";
        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        // Build banner dynamically
        for (char ch : word.toCharArray()) {
            CharacterPattern cp = patternMap.get(ch);

            for (int i = 0; i < 7; i++) {
                banner[i].append(cp.getPattern()[i]).append("  ");
            }
        }

        // Display banner
        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }
}