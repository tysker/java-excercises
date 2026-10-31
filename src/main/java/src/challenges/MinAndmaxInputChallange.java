package code_challenge.challenges;

import java.util.Scanner;

/**
 * MinAndmaxInputChallange
 */
public class MinAndmaxInputChallange {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        max_And_Min_Number();
    }

    public static void max_And_Min_Number() {
        int num = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Please enter a number: ");
            try {
                num = Integer.parseInt(userInput.nextLine());

                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }

                System.out.println("Min number : " + min);
                System.out.println("Max number : " + max);

            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println("Min number : " + min);
                System.out.println("Max number : " + max);
                break;
            }

        }
    }
}