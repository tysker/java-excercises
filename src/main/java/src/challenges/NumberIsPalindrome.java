package code_challenge.challenges;

/**
 * NumberIsPalindrome
 */
public class NumberIsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(567898765));
    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number = (number - (number + number));
        }

        int num = number;
        int reverse = 0;

        while (num != 0 || num > 0) {
            reverse += num % 10;
            num /= 10;
            if (num > 0) {
                reverse = reverse * 10;
            }
        }

        if (reverse != number) {
            return false;
        } else {
            return true;
        }
    }
}