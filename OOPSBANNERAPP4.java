public class OOPSBANNERAPP4 {

    public static void main(String[] args) {

        // Build banner using helper methods
        String[] banner = new String[7];
        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        for (int i = 0; i < 7; i++) {
            banner[i] = o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i];
        }

        // Display banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method to build letter O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method to build letter P
    public static String[] buildP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method to build letter S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}