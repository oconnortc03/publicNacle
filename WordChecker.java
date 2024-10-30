import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class WordChecker{

    public static String[] all6LetterWords; //String[] that Contains all 6 letterwords in alphabetical order

    public WordChecker(){
        SixLetterWordsArray sixWords = new SixLetterWordsArray();
        all6LetterWords = sixWords.getWordsArray();
    }

    //Takes a String, testString, as input and returns true if testSring is in all6LetterWords,
    //False if it is not
    public static boolean validWordCheck(String testString){
        testString = testString.toLowerCase();
        if(testString.length() != 6){ //testString must be 6 chars long
            return false;
        }
        return Arrays.binarySearch(all6LetterWords, testString) >= 0;
    }


    //returns a 6 length string corisponding with the intended color of each letter
    // 0 = red, letter not in word
    // 1 = yellow, letter in word but not in correct spot
    // 2 - green, letter is in the correct spot
    public static String colorCode(String validWord, String targetWord){
        validWord = validWord.toLowerCase();
        targetWord = targetWord.toLowerCase();
        String sixIntValues = "";
        validWord = validWord.toLowerCase();
        for(int i = 0; i < 6; i++){
            if(validWord.charAt(i) == targetWord.charAt(i)){
                sixIntValues = sixIntValues + "2";
                targetWord = targetWord.substring(0,i)+ "!"+ targetWord.substring(i+1);
            }
        }
        
        for(int i = 0; i < 6; i++){
            String myChar = String.valueOf(validWord.charAt(i)); 
            if(targetWord.charAt(i) == '!'){

            }
            else if(!(targetWord.contains(myChar))){
                sixIntValues = sixIntValues.substring(0,i) + "0" + sixIntValues.substring(i);
            }
            else{
                for(int k = 0; k < 6; k++){
                    if(validWord.charAt(i) == targetWord.charAt(k)){
                        sixIntValues = sixIntValues.substring(0,i) + "1" + sixIntValues.substring(i);
                        targetWord = targetWord.substring(0,k)+ "?"+ targetWord.substring(k+1);
                        break;
                    }
                }
            }
        }
        return sixIntValues;
    }

    public String choseAWord(){
        Random rand = new Random();
        String randomTarget = all6LetterWords[rand.nextInt(10539)];
        return randomTarget;
    }
}