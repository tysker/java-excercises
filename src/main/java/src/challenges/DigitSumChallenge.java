package src.challenges;

/**
 * DigitSumChallange Write a method with the name sumDigits that has one int
 * parameter called number. If parameter is >= 10 then the method should process
 * the number and return sum of all digits, otherwise return -1 to indicate an
 * invalid value. The numbers from 0-9 have 1 digit so we donft want to process
 * them, also we donft want to process negative numbers, so also return -1 for
 * negative numbers. For example calling the method sumDigits(125) should return
 * 8 since 1 + 2 + 5 = 8. Calling the method sumDigits(1) should return -1 as
 * per requirements described above.
 */
public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigitSolution(5));
        System.out.println(sumDigitSolutionTwo(4));

    }

    public static int sumDigitSolution(int number) {

        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number -= (number % 10);
            number = (number / 10);
        }
        return sum;
    }

    public static int sumDigitSolutionTwo(int number) {
        int num = 0;

        if (number < 10) {
            return -1;
        }

        try {
            String numberString = Integer.toString(number);

            for (int i = 0; i < numberString.length(); i++) {
                num += Integer.parseInt(numberString.substring(i, i + 1));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return num;
    }
}