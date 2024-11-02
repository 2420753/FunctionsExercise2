import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

        // comment out the function call one out of the three to run it in console, without it conncanating with each other. :)

        // Squaring number call:
        int squaredNumber = displaySquareOfNumberEntered();
        System.out.printf("The squared number is: %d", squaredNumber);


        // Counting down from nine to zero
        countingDownFromNine();

        // calculating the sum through addition
        displayCalculatedSum();




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


    // Asking user to input a number 3 times, which will then add all the numbers and print it to console
    static void displayCalculatedSum() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter a number to sum: ");
            int userInput = stdin.nextInt();
            sum += userInput;
        }
        System.out.printf("The sum of the numbers is: %d", sum);
    };


}