package task_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int[] arr = {140, 121, 134, 145, 152};

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter sequence number of wanted price: ");
            int input = scanner.nextInt();
            scanner.close();
            System.out.println("Your price is: " + arr[input]);
        } catch(ArrayIndexOutOfBoundsException notArray) {
            System.out.println("Exception: " + notArray.getMessage() + "\nPlease try again");
        } catch (InputMismatchException notNumber){
            System.out.println("Exception: " + notNumber + "\nPlease try again");
        }
    }
}
