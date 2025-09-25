package Chapter8.Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CityNotFound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            try
            {
                String[] cities = {"New-York", "Maimi", "Lagos", "Pretoria", "East London", "Mahikeng", "Joburg", "Lisbon"};
                System.out.println("Enter any integer [0 - 7] to choose a city of your choice: ");
                int numPosition = sc.nextInt();
                if (numPosition >= 0 || numPosition <= 7)
                {
                    System.out.println("We have [" + cities[numPosition] + "] city at position [" + numPosition + "]");
                }
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Oops, index out of bounds!");
            }
            catch (InputMismatchException e)
            {
                System.out.println("input mismatch, 0-7 expected");
            }

    }

}
