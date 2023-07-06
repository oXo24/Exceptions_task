package task_01;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    static int age;

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        LOGGER.info("\n" + formOutput(getInput()));
    }


    private static int getInput() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your full age: ");
            age = Integer.parseInt(scanner.nextLine());
            scanner.close();
        } catch (NumberFormatException notInt) {
            System.out.println("Exception: " + notInt);
        }

        return age;
    }

    private static String formOutput(int age) {
        if (age == 0) {
            return "Please enter only a full age";
        } else {
            return "Thank you! Your age was registered as: " + age;
        }
    }
}
