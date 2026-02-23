public class OOPSBANNERAPP2 {

    public static void main(String[] args) {

        // Store banner lines in String array
        String[] lines = {

                String.join("", "  ***   ", "  ***   ", "******  ", "  ***** "),
                String.join("", " **  ** ", " **  ** ", "**    **", " **     "),
                String.join("", "**    **", "**    **", "**    **", " **      "),
                String.join("", "**    **", "**    **", "**    **", " *****   "),
                String.join("", "**    **", "**    **", " ****** ", "    **   "),
                String.join("", " **  ** ", " **   **", "**      ", "    **   "),
                String.join("", "  ***   ", "   ***  ", "**      ", " *****  ")
        };

        // Print using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}