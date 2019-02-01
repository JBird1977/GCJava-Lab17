import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab17 {

    public static void main(String[] args) throws IOException {
        
        
        Scanner scan = new Scanner(System.in);
        Country cInput = new Country();
        int in = -1;
        // show a menu with 3 options
        // option 1: display a list of countries that have been saved in a file
        // option 2: prompt the user to enter a country then write it to a file
        // option 3: display a goodbye message and exit

        printTitle();
       do {
        do {
            printMenu();
            in = getUserInput(scan);
        } while (in == -1);
        if (in == 1) {
            CountriesTextFile.printFile();
        } else if (in == 2) {
            cInput = getCountryInput(scan);
            CountriesTextFile.appendToFile(cInput);
        }
       } while (in != 3);
        System.out.println("Buh-bye!");
    } //end main

    private static void printTitle() {
        System.out.println("Welcome to the Countries Maintenance Application!");
    }

    private static void printMenu() {

        System.out.println("1 - See a list of countires");
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


private static Country getCountryInput(Scanner scan) {
    
    String inCountry = "";
    int inPop = 0;
    scan.nextLine();
    System.out.println("Please enter the name of the country you would like to add: ");
    inCountry = scan.nextLine();
    
    System.out.println("Please enter the population of the country: ");
    inPop = scan.nextInt();
    
    Country userEntry = new Country(inCountry, inPop);
    return userEntry;
} // end getCountryInput

}
