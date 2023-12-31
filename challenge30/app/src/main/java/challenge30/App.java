/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge30;

public class App {
    public static void main(String[] args) {

        HashTable<String, Integer> hashtable = new HashTable<>();

        hashtable.set("key1", 42);
        int value = hashtable.get("key1");
        System.out.println("Value for key1: " + value);

        hashtable.set("key1", 42);
        hashtable.set("key2", 84);

        int value1 = hashtable.get("key1");
        int value2 = hashtable.get("key2");
        System.out.println("Value for key1: " + value1);
        System.out.println("Value for key2: " + value2);

        Integer nonExistentValue = hashtable.get("nonexistent");
        System.out.println("Value for nonexistent key: " + nonExistentValue);

        Iterable<String> keys = hashtable.keys();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }

        int hashedIndex = hashtable.hash("key1");
        System.out.println("Hashed Index for key1: " + hashedIndex);
    }
}
