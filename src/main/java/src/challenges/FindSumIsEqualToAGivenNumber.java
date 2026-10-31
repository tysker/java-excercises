package code_challenge.challenges;

/**
 * FindSumIsEqualToAGivenNumber
 * 
 * How do you find all pairs of an integer array whose sum is equal to a given
 * number?
 */
public class FindSumIsEqualToAGivenNumber {

    public static void main(String[] args) {
        // findPairsWhoseSumIsEqualToNumber(5, new int[] { 2, 3, 6, 4, 8, 1, 3 });
        // findPairsWhoseSumIsEqualToNumber(7, new int[] { 2, 4, 3, 5, 7, 8, 9 });
        findPairsWhoseSumIsEqualToNumber(7, new int[] { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 });
    }

    public static void findPairsWhoseSumIsEqualToNumber(int number, int[] numberArray) {

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i; j < numberArray.length; j++) {
                if (numberArray[i] + numberArray[j] == number) {
                    System.err.println(numberArray[i] + " " + numberArray[j]);
                }
            }
        }
    }
}