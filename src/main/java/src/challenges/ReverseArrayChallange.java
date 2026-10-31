package code_challenge.challenges;

import java.util.Arrays;

/**
 * ReverseArrayChallange
 */
public class ReverseArrayChallange {

    public static void main(String[] args) {
        // reverse(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 09 });
        reverse(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
    }

    public static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int len = array.length;
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[--len];
        }

        System.out.println(Arrays.toString(reversedArray));

    }
}