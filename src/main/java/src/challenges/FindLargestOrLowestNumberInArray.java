package code_challenge.challenges;

/**
 * FindLargestOrLowestNumberInArray
 */
public class FindLargestOrLowestNumberInArray {

    public static void main(String[] args) {
        findLowAndLargNumberInArray(new int[] { 5, -9, -66, -1, 500, -4, -33, -52,-784 });
    }

    // How do you find the largest and smallest number in an unsorted integer array?
    public static void findLowAndLargNumberInArray(int[] unsortedArray) {

        int min = unsortedArray[0];
        int max = unsortedArray[0];
        int temp = 0;
        int num1 = 0;
        int num2 = 0;
        

        for (int i = 0; i < unsortedArray.length-1; i++) {
            
            num1 = unsortedArray[i];
            num2 = unsortedArray[i + 1];

           
            if(num1 > max && num1 > num2){
                max = num1;
            }
            if(num2 > max && num2 > num1){
                max = num2;
            }
            //
            temp = num1 < num2 ? temp = num1 : num2;
            min = temp < min ? min = temp : min;
        }

        System.out.println(min + " " + max);

    }

}