/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge33;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testLeftJoinWithMatchingData() {
        Map<String, String> synonyms = new HashMap<>();
        synonyms.put("diligent", "employed");
        synonyms.put("fond", "enamored");
        synonyms.put("guide", "usher");

        Map<String, String> antonyms = new HashMap<>();
        antonyms.put("diligent", "idle");
        antonyms.put("fond", "averse");
        antonyms.put("guide", "follow");

        List<List<String>> result = LeftJoin.leftJoin(synonyms, antonyms);

        assertEquals(3, result.size());
        assertEquals("diligent", result.get(0).get(0));
        assertEquals("employed", result.get(0).get(1));
        assertEquals("idle", result.get(0).get(2));
    }

    @Test
    public void testLeftJoinWithNullAntonyms() {
        Map<String, String> synonyms = new HashMap<>();
        synonyms.put("diligent", "employed");
        synonyms.put("fond", "enamored");

        Map<String, String> antonyms = new HashMap<>();
        antonyms.put("diligent", "idle");

        List<List<String>> result = LeftJoin.leftJoin(synonyms, antonyms);

        assertEquals(2, result.size());
        assertEquals("fond", result.get(1).get(0));
        assertEquals("enamored", result.get(1).get(1));
        assertEquals("NULL", result.get(1).get(2));
    }

    @Test
    public void testLeftJoinWithEmptyMaps() {
        Map<String, String> synonyms = new HashMap<>();
        Map<String, String> antonyms = new HashMap<>();

        List<List<String>> result = LeftJoin.leftJoin(synonyms, antonyms);

        assertEquals(0, result.size());
    }

}
