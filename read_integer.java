// read integer between 1 to 1000.....

import java.util.Scanner;

public class read_integer {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        // Variable to store the sum
        int sum = 0;
        int originalNumber = number;

        // Process the number using a loop
        while (number > 0) {
            // Extract the last digit using %
            sum += number % 10;
            // Remove the last digit using /
            number /= 10;
        }

        // Display the results
        System.out.println("The sum of the digits in " + originalNumber + " is " + sum);
    }
}

