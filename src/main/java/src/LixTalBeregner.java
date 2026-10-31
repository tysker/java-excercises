package src;

public class LixTalBeregner {
    /*

    LIX formel

    LIX = (antal ord/antal punktummer) + (lange ord * 100/antal ord)
    (lange ord er 7 bogstaver eller mere)

     */
    public static void main(String[] args) {
        float lixNumber = getLixNumber("hej med dig. jeg hedder patrick.");
        System.out.println(lixNumber);
    }

    public static float getLixNumber(String text) {
        float dotCount = 0;
        float longWord = 0;

        // TODO: clean up
        String cleanText = text.replace(".", "");

        // TODO: antal ord
        String[] words = cleanText.split(" ");
        float wordCount = words.length;

        // TODO: antal punktummer
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') dotCount++;
        }

        // TODO: lange ord
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 7) longWord++;
        }

        return (wordCount /dotCount) +  (longWord * 100/wordCount);

    }
}
