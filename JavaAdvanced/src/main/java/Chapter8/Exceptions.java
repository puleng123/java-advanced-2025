package Chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name ;
        int numerator;
        int denominator;
        double quotient;

        try
        {
            System.out.println("Please enter your name: ");
            name = scan.nextLine();
            System.out.println("Please enter your numerator: ");
            numerator = scan.nextInt();
            System.out.println("Please enter your denominator: ");
            denominator = scan.nextInt();

            quotient = numerator / denominator;

            System.out.println("Your name is: " + name);
            System.out.println("Last letter of your name" + name.substring(0, 1).toUpperCase() + name.substring(4));
            System.out.println("Your quotient is: " + quotient);
        }
        catch (InputMismatchException e)
        {
            System.err.println("Incorrect data type");
        }
        catch (ArithmeticException e)
        {
            System.err.println("Cannot divide by zero");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.err.println("Error the last letter of  have a char at position 4");
        }
    }
}
