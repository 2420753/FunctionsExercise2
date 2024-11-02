import java.util.Scanner;

public class Main {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        // Squaring number call:
        int squaredNumber = displaySquareOfNumberEntered();
        System.out.printf("The squared number is: %d", squaredNumber);
         */

        // Counting down from nine to zero
        countingDownFromNine();


    }
    // Displaying the squared number function:
    static int displaySquareOfNumberEntered() {
        System.out.print("Enter a number to square: ");
        int userInput = stdin.nextInt();
        int result = userInput * userInput;
        return result;
    }

    // Counting down from 9 function
    static void countingDownFromNine() {
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + "\n");

        }
    }


}