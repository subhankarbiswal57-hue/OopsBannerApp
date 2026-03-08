package UC5;

public class UC5 {
     public static void main(String[] args) {

        String[] lines = {

            // Row 1
            String.join("   ",
                    " *** ",
                    " *** ",
                    "** ",
                    " *** "
            ),

            // Row 2
            String.join("   ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*      "
            ),

            // Row 3
            String.join("   ",
                    "*     *",
                    "*     *",
                    "** ",
                    " *** "
            ),

            // Row 4
            String.join("   ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "      *"
            ),

            // Row 5
            String.join("   ",
                    " *** ",
                    " *** ",
                    "*      ",
                    " *** "
            )
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
    

