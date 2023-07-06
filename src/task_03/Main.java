package task_03;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    static double funds = 12953;

    private static final Logger LOGGER = Logger.getLogger(task_01.Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("\n" + validate(getPrice(), funds));
    }

    public static double getPrice() {
        double price = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter price of the product: ");
            price = scanner.nextDouble();
            scanner.close();
            return price;
        } catch (InputMismatchException exception) {
            System.out.println("Exception: " + exception);
        }
        return price;
    }

    public static String validate(double price, double funds) {
        if (funds < price) {
            throw new ArithmeticException("\n Not enough funds for the purchase");
        } else if (price == 0) {
            return "Something went wrong!";
        } else {
            return "Transaction complete!" + "\nThank you for the purchase!";
        }
    }
}
