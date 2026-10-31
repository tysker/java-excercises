package code_challenge.challenges;

/**
 * SumOdd
 */
public class SumChallanges {

    public static void main(String[] args) {
        // sum3And5(555);
        System.out.println(sumOdd(1, 11));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0 || start > end) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void sum3And5(int number) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i < number + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);
    }
}