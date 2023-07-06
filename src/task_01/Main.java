package task_01;

import java.util.Scanner;

public class Main {

    static int age;

    public static void main(String[] args) {

        formOutput(getInput());
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

    private static void formOutput(int age) {
        if (age == 0) {
            System.out.println("Please enter only a full age");

        } else
            System.out.println("Thank you! Your age was registered as: " + age);
    }
}
