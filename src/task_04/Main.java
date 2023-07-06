package task_04;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    static Scanner scanner;
    static int temp;

    private static final Logger LOGGER = Logger.getLogger(task_01.Main.class.getName());

    public static void main(String[] args) {

        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter temperature of environment: ");
            temp = scanner.nextInt();
            scanner.close();
        } catch (InputMismatchException exception) {
            System.out.println("Caught an exception.");
            System.out.println("An exception has occurred: " + exception);
        }

        try {
            LOGGER.info("\n" + validate(temp));

        } catch (InvalidTempException ex) {
            System.out.println("Caught an exception.");
            System.out.println("An exception has occurred: " + ex);
        }
    }

    static String validate(int temp) throws InvalidTempException {
        if (temp >= -10 && temp <= 35) {
            return "OK. Temperature: " + temp;
        } else {
            throw new InvalidTempException("\nTemperature " + temp +
                    " is wrong!");
        }
    }

}
