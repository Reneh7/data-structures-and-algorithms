# hashmap-left-join

A function called leftJoin that Implement a simplified LEFT JOIN for 2 Hashmaps.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge33%20WhiteBoard.png)

## Approach & Efficiency

The approach for the code is to perform a left join operation on two hashmaps containing word strings as keys and either synonyms or antonyms as values.
The code iterates through the keys in the first hashmap, retrieves the corresponding synonym and antonym (if they exist) from the second hashmap,
and constructs a list for each word that includes the word itself, its synonym, and its antonym (or "NULL" if there's no antonym).
These lists are then added to a result list, forming the final output. The code has a time complexity of O(n) where n is the number of keys in the first
hashmap since it iterates through these keys. The space complexity is O(n) as well, as it stores the result in a list of lists with a length proportional
to the number of keys in the first hashmap.

## Solution

![Output](../../../../../../assests/challenge%2033%20output.png)
After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the LeftJoin class.
