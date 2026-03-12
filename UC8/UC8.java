package UC8;

import java.util.HashMap;

public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
            "  ***   ",
            " **  ** ",
            "**    **",
            "**    **",
            "**    **",
            " **  ** ",
            "  ***   "
        });

        charMap.put('P', new String[] {
            "******  ",
            "**   ** ",
            "**   ** ",
            "******  ",
            "**      ",
            "**      ",
            "**      "
        });

        charMap.put('S', new String[] {
            " *****  ",
            "**      ",
            "**      ",
            " ****   ",
            "     ** ",
            "     ** ",
            " *****  "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        message = message.toUpperCase();  // ✅ prevents crash for lowercase

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                if (charMap.containsKey(ch)) {
                    sb.append(charMap.get(ch)[line]).append("  ");
                } else {
                    sb.append("        "); // space if character not found
                }
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}
