package code_challenge.challenges;

import java.util.Scanner;

public class MinimumElementChallange {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int[] userArray = readIntegers(5);
        userArray = sortArray(userArray);
        System.out.println("MIN: " + findMin(userArray));
    }

    // count represents how many integers the user needs to enter
    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Please enter " + count + "numbers.");
        for (int i = 0; i < array.length; i++) {

            array[i] = userInput.nextInt();
        }
        return array;
    }

    public static int[] sortArray(int[] array) {

        boolean flag = true;
        int temp = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

    public static int findMin(int[] array) {
        int num = array[0];
        return num;
    }
}