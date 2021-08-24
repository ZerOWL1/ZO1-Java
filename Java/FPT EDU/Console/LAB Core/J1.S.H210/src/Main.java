
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ryuu
 */
public class Main {

    /**
     * Swap 2 line
     *
     */
    private static final Scanner SC = new Scanner(System.in);

    public static File checkFile(String msg) {
        String name = "";
        File file;
        do {
            System.out.print(msg);
            name = SC.nextLine();
            file = new File(name);
            if (file.exists()) {
                break;
            } else {
                System.err.println("File " + name + " does not exist. "
                        + "Please Re-Enter");
            }
        } while (true);
        return file;
    }

    public static String flipLines(Scanner input) {
        String rs = "";

        while (input.hasNextLine()) {
            String line1 = input.nextLine();
            String line2 = "";
            if (input.hasNextLine()) {
                line2 = input.nextLine();
            } else {
                rs += line1;
                break;
            }

            rs += line2 + "\n" + line1 + "\n";
        }
        return rs;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = checkFile("Enter file name: ");
        System.out.println(flipLines(new Scanner(file)));
    }
}
