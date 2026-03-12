public package UC7;

public class UC7 {

    /**
     * CharacterPatternMap - Inner class for storing character-to-pattern mappings
     *
     * Encapsulates a single character and its corresponding ASCII art pattern.
     * Provides immutable access to character and pattern data through getters.
     */
    static class CharacterPatternMap {

        /** The character being represented */
        Character character;

        /** The ASCII art pattern lines for the character */
        String[] pattern;

        
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

       
        public Character getCharacter() {
            return character;
        }

    
        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        // Pattern for letter 'O'
        characterPatternMap[0] = new CharacterPatternMap('O', new String[] {
            "  ***  ",
            " **  **",
            "**    **",
            "**    **",
            "**    **",
            " **  **",
            "  ***  "
        });

        // Pattern for letter 'P'
        characterPatternMap[1] = new CharacterPatternMap('P', new String[] {
            "****** ",
            "**   **",
            "**   **",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        });

        // Pattern for letter 'S'
        characterPatternMap[2] = new CharacterPatternMap('S', new String[] {
            " *****",
            "**    ",
            "**    ",
            " **** ",
            "    **",
            "    **",
            " *****"
        });

        // Pattern for space character
        characterPatternMap[3] = new CharacterPatternMap(' ', new String[] {
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        });

        return characterPatternMap;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        // If not found, recursively return pattern for space
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        // Get pattern height (number of lines) from first character
        int patternHeight = charMaps[0].getPattern().length;

        // Loop through each line of the pattern
        for (int i = 0; i < patternHeight; i++) {
            StringBuilder line = new StringBuilder();
            // Loop through each character in the message
            for (int j = 0; j < message.length(); j++) {
                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]);
                if (j < message.length() - 1) {
                    line.append("  "); // space between letters
                }
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        // Define the message to be displayed
        String message = "OOPS";
        // Print the banner message
        printMessage(message, charMaps);
    }
} {
    
}
