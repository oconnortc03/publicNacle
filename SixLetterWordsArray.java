import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SixLetterWordsArray {

    private String fileName = "6LetterWords.txt"; //Text file containing all valid 6 letter words
    private static String[] wordsArray = new String[10538];

    public SixLetterWordsArray() {
        wordsArray = readWordsFromFile(fileName);
    }

    private static String[] readWordsFromFile(String fileName) {
        String[] wordsInArray = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String wordsLine = reader.readLine();
            wordsInArray = wordsLine.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsInArray;
    }

    public static String[] getWordsArray(){
        return wordsArray;
    }
}