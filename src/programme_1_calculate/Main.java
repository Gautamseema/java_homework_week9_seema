package programme_1_calculate;
/**
 * Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 *  With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main {
    // main method
    public static void main(String[] args) {
     // using scanner
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();// create object

        char choice;
        do{
            System.out.println("Enter first number:");
            int a = scanner.nextInt();
            System.out.println("Enter second number : ");
            int b = scanner.nextInt();
            System.out.println("Enter one of symbol +, -, *, /: ");
            char symbol = scanner.next().charAt(0);

            calculator.calculateResult(a, b, symbol ) ;
            System.out.println("Would you like to do more calculation? Please enter 'Y' OR 'N' : ");
            choice = scanner.next().charAt(0);
        }while ( choice == 0);
        scanner.close() ;
    }
}
