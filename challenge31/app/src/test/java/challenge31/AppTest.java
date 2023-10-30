package challenge31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    public void testRepeatedWordWithRepetition() {
        String inputString = "This is a simple test. This is a test to find the first repeated word.";
        String result = RepeatedWord.repeatedWord(inputString);
        assertEquals("this", result);
    }

    @Test
    public void testRepeatedWordNoRepetition() {
        String inputString = "This is a simple test.";
        String result = RepeatedWord.repeatedWord(inputString);
        assertEquals("No repeated words found", result);
    }

    @Test
    public void testRepeatedWordWithPunctuation() {
        String inputString = "This is a simple test. Simple test to find the first repeated word!";
        String result = RepeatedWord.repeatedWord(inputString);
        assertEquals("simple", result);
    }
}
