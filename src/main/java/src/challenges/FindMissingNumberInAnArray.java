package code_challenge.challenges;

public class FindMissingNumberInAnArray {

    public static void main(String[] args) {
        // one missing number
        // printMissingNumber(new int[] { 1, 2, 3, 4, 6 }, 6);
        // two missing number
        // printMissingNumber(new int[] { 1, 2, 3, 4, 6, 7, 8, 10 }, 10);
        // three missing number
        // printMissingNumber(new int[] { 1, 2, 3, 4, 6, 8, 9 }, 10);
        // four missing number
        printMissingNumber(new int[] { 1, 2, 3, 4, 9, 8 }, 10);
    }

    // this method only works if the array is sorted
    public static void printMissingNumber(int[] listOfNumbers, int length) {

        int[] newArray = new int[length];
        int[] missingNumbers = new int[length - listOfNumbers.length];
        int gap = 0;
        for (int i = 0; i < listOfNumbers.length; i++) {
            newArray[listOfNumbers[i] - 1] = listOfNumbers[i];
        }

        for (int i = 0; i < newArray.length; i++) {

            if (newArray[i] == 0) {
                missingNumbers[gap++] = i + 1;
            }
        }
    }

}