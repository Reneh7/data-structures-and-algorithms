# hashmap-repeated-word
A function called repeated word that finds the first word to occur more than once in a string.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge31%20WhiteBoard.png)

## Approach & Efficiency

The repeatedWord function employs an approach that efficiently uses a HashMap to keep track of word frequencies while iterating through the input string.
It splits the string into words, cleans them of punctuation and converts them to lowercase to ensure case-insensitive comparison. As it encounters words,
it checks if they are already in the HashMap, making it easy to identify the first repeated word. The time complexity of this approach is O(n),
where n is the number of words in the input string. The space complexity is O(n), where n is the number of unique words in the input string.

## Solution

![Output](../../../../../../assests/challenge%2031%20output.png)
After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the RepeatedWord class.
