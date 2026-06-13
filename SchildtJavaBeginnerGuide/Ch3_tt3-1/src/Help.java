import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
        System.out.println("Help on:");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.print("Choose one: ");

        char choice = (char) System.in.read();

        switch(choice) {
            case '1':
                System.out.println("if(condition) {");
                System.out.println("    statement_1;");
                System.out.println("    statement_n;");
                System.out.println("} else {");
                System.out.println("    statement_1;");
                System.out.println("    statement_n;");
                System.out.println("}");
                break;
            case '2':
                System.out.println("switch(controlling_variable) {");
                System.out.println("    case 'value_match_1':");
                System.out.println("        statement_1");
                System.out.println("        statement_n");
                System.out.println("    case 'value_match_n':");
                System.out.println("        statement_1");
                System.out.println("        statement_n");
                System.out.println("    default:");
                System.out.println("        statement_1");
                System.out.println("        statement_n");
                System.out.println("}");
                break;
            default:
                System.out.println("Something else other than 1 or 2 has been selected. Exiting... ");
        }
    }
}