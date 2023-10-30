package challenge31;

import static challenge31.RepeatedWord.repeatedWord;

public class App {
    public static void main(String[] args) {
        String inputString = "This is a simple test. This  is a test to find the first repeated word.";
        String result = repeatedWord(inputString);
        System.out.println("First repeated word: " + result);
    }
}
