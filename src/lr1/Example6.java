package lr1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String[] tokens = {"Name", "Family Name", "Patronymic"};
        String[] values = new String[tokens.length];

        for (int i = 0; i < tokens.length; ++i) {
            System.out.print("Enter " + tokens[i] + ": ");
            values[i] = input.nextLine();
        }

        System.out.print("Hello <");
        for (int i = 0; i < tokens.length; ++i) {
            System.out.print(values[i]);
            if (i == tokens.length - 1) { // don't put space after last token
                break;
            }
            System.out.print(" ");
        }
        System.out.print(">");
    }
}
