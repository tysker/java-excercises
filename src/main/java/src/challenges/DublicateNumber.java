package code_challenge.challenges;

import java.util.Arrays;

/**
 * DublicateNumber
 */
public class DublicateNumber {

    public static void main(String[] args) {
        // findDublicataNumber(new int[] { 1, 1, 2, 6, 5, 5, 9 });
        findDublicataNumber(new int[] { 9, 9, 9, 5, 6, 7, 7, 2, 4, 5, 5 });
        // findDublicataNumber(new int[] { 1, 1, 2, 6, 5, 5, 9 });
    }

    public static void findDublicataNumber(int[] intArray) {

        Arrays.sort(intArray);
        int duplicateNumber = 0;

        for (int i = 0; i < intArray.length - 1; i++) {

            if (intArray[i] == intArray[i + 1]) {
                duplicateNumber = intArray[i];
                duplicateNumber = intArray[i + 1];
                System.out.println(intArray[i] + " " + intArray[i + 1]);
            }
        }

    }
}