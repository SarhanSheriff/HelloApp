public class OOPSBannerApp7 {
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
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

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };

        String[] P = {
            " ******  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *        ",
            " *        ",
            " *        "
        };

        String[] S = {
            "  *****  ",
            " *        ",
            " *        ",
            "  *****  ",
            "        * ",
            "        * ",
            "  *****  "
        };

        String[] SPACE = {
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          "
        };

        CharacterPatternMap[] maps = {
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S),
            new CharacterPatternMap(' ', SPACE)
        };
        return maps;
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {

        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', maps);
    }
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < message.length(); j++) {

                String[] pattern = getCharacterPattern(message.charAt(j), maps);
                System.out.print(pattern[i] + "  ");
            }

            System.out.println();
        }
    }    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, maps);
    }
}

