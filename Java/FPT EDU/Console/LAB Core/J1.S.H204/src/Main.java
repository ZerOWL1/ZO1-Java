
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Main {

    private static Scanner SC = new Scanner(System.in);

    public static int checkIntLimit(String msg, int min, int max) {
        int rs = -1;
        do {
            try {
                System.out.print(msg);
                String input = SC.nextLine();

                rs = Integer.parseInt(input);

                if (rs < min || rs > max) {
                    throw new NumberFormatException();
                }
                break;
            } catch (Exception e) {
                System.err.println("Please input data value in range "
                        + min + " to " + max);
            }
        } while (true);
        return rs;
    }

    public static void main(String[] args) {
        Account ac = new Account();
        Account.Client c = ac.new Client();
        FilteredAccount filter = new FilteredAccount(c);
        do {
            int t = checkIntLimit("Enter Transaction: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            Account.Transaction tr = ac.new Transaction(t);
            filter.process(tr);
            System.out.println("Persent Trans of Total Transaction: " + filter.percentFiltered() + "%");
        } while (true);
    }
}
