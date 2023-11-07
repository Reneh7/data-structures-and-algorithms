package challenge33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeftJoin {
    public static List<List<String>> leftJoin(Map<String, String> synonyms, Map<String, String> antonyms) {
        List<List<String>> result = new ArrayList<>();

        for (String key : synonyms.keySet()) {
            String synonym = synonyms.get(key);
            String antonym = antonyms.get(key);

            List<String> row = new ArrayList<>();
            row.add(key);
            row.add(synonym);

            if (antonym == null) {
                row.add("NULL");
            } else {
                row.add(antonym);
            }

            result.add(row);
        }
        return result;
    }
}
