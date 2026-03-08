package UC4;

public class UC4 {
    public static void main(String[] args) {

        String banner[] = {

        String.join(" ","**","*","**","**"),
        String.join(" ","*   ","   ","    ","   "),
        String.join(" ","*   ","   ","    ",""),
        String.join(" ","*   ","   ","**","**"),
        String.join(" ","*   ","   ","","         *"),
        String.join(" ","*   ","   ","","         *"),
        String.join(" ","**","*","","     ***")

        };

        for(String line : banner)
        {
            System.out.println(line);
        }

    }
}

    

