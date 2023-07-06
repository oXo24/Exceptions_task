package task_01;

import java.util.Scanner;

public class Main {

    static int age;

    public static void main(String[] args) {
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
}
