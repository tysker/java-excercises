package code_challenge.challenges;

/**
 * Test
 */
public class JavaPrintfMethods {
    /**
     * %s = String %d = int %f = double
     */

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        String name = "Joerg";
        String town = "Böblingen";
        int age = 42;
        double balance = 450.37;

        System.out.printf("Hello %S, you are from %s.%n", name, town);
        System.out.printf("I am %d years old.", age);
        System.out.printf("My balance is %.2f.", balance);// .2 ist zum angeben der komma stelle

    }
}