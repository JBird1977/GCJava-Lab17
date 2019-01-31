import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in = -1;
        // show a menu with 3 options
        // option 1: display a list of countries that have been saved in a file
        // option 2: prompt the user to enter a country then write it to a file
        // option 3: display a goodbye message and exit

        printTitle();
        do {
            printMenu();
            in = getUserInput(scan);
        } while (in == -1);
        System.out.println("Made it!");
        
        
    }

    private static void printTitle() {
        System.out.println("Welcome to the Countries Maintenance Application!");
    }

    private static void printMenu() {

        System.out.println("1 - See athe list of countires");
        System.out.println("2 - Add a country");
        System.out.println("3 - Exit");
    }

    private static int getUserInput(Scanner scan) {
        int in = -1;
        System.out.println("Please choose an option: ");
        try {
            in = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number.");
            scan.nextLine();
            return -1;
        }

        if (!((in > 0 && in < 4))) {
            System.out.println("Please enter a valid number.");
            scan.nextLine();
            return -1;
        }

        return in;
    } // end getUserInput
}
