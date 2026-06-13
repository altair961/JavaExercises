public class LogicalOpTable {
    public static void main(String[] args) {
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        DisplayTruthTableRow(true, true);
        DisplayTruthTableRow(true, false);
        DisplayTruthTableRow(false, true);
        DisplayTruthTableRow(false, false);
    }

    private static int GetInt(boolean b) {
        return b ? 1 : 0;
    }

    private static void DisplayTruthTableRow(boolean p, boolean q) {
        System.out.print(GetInt(p) + "\t" + GetInt(q) + "\t");
        System.out.print((GetInt(p & q)) + "\t" + (GetInt(p | q)) + "\t");
        System.out.println((GetInt(p ^ q)) + "\t" +GetInt (!p));
    }
}