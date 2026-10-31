package src;

public class Main {

    public static void main(String[] args) {
        System.out.println(rename("!!day--yaz!!"));
    }

    public static int rename(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean isLetter = Character.isLetter(c);

            if (i != 0 && (str.charAt(i) == ' ' || !isLetter)) {
                if (str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 'y') count++;
            }
            if (i == str.length() - 1 && (str.charAt(i) == 'z' || str.charAt(i) == 'y')) count++;
        }
        return count;
    }


}
