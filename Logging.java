import java.util.Scanner;

/**
* Get length of log and determine how many can fit on a truck.
* @author  Jack Turcotte
* @version 1.0
* @since   2025-09-15
*/

// Defines the class
public final class Logging {

    /**
     * This is a private constructor used to
     * satisfy the style checker.
     * @exception IllegalStateException Utility Class
     * @see IllegalStateException
     */
    private Logging() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Main method.
     *
     * @param args Unused.
     */

    // Get input, calculate log amount to display to user

    public static void main(final String[] args) {
        // Get user input
        System.out.println("Log amount calculator");
        System.out.println("Enter the length of each log in meters"
            + "(0.25, 0.5, 1): ");

        // Create scanner, get input
        final Scanner scanner = new Scanner(System.in);
        final String lengthString = scanner.nextLine();

        // Check if input was a valid number
        try {
            final double lengthDouble = Double.parseDouble(lengthString);
            // Check if radius is > 0
            if (lengthDouble < 0) {

                // Warn input not in possible range
                System.out.println("Please enter a positive length"
                    + " that is either (0.25, 0.5 or 1)");
            } else if (lengthDouble == 0.25
                || lengthDouble == 0.5 || lengthDouble == 1) {

                // Calculate the amount
                final double amount = (1100 / (20 * lengthDouble));
                System.out.println("Your truck can carry " + amount + " logs.");
            } else {

                //Length is not one of the options
                System.out.println("Please enter one of the valid"
                    + " lengths (0.25, 0.5 or 1)");
            }
        } catch (NumberFormatException e) {

            //If number format exception, warn user
            System.out.println("There was an error with casting your"
            + " input, please enter a valid number (0.25, 0.5, 1)");
        } finally {

            // Either way, close the scanner
            scanner.close();
        }
    }
}
