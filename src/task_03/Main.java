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

}
