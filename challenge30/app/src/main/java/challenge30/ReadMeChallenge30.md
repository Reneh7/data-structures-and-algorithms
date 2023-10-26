# HashTable

This code defines a Hashtable class, which is a data structure for storing key-value pairs. The set method hashes a key to find an index and stores the
key-value pair in the table, handling collisions by using linked lists. It can also update the value if the key already exists.
The get method retrieves a value associated with a given key, while the has method checks if a key is present in the table. The keys method returns a
collection of all unique keys in the Hashtable. Lastly, the hash method computes an index for a key, ensuring it falls within the table's capacity.
This Hashtable class provides efficient key-based data storage and retrieval with collision handling.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge30%20WhiteBoard%20part1.png)
![WhiteBoard](../../../../../../assests/Challenge30%20WhiteBoard%20part2.png)
![WhiteBoard](../../../../../../assests/Challenge30%20WhiteBoard%20part3.png)

## Approach & Efficiency

The approach in this code is to implement a Hashtable data structure, which stores key-value pairs. It uses an array of linked lists to handle collisions,
ensuring efficient data retrieval. The set method hashes the key to determine its index in the array, allowing the user to set or update the associated
value. The get method retrieves a value based on a given key, and the has method checks for the existence of a key.
The keys method collects all unique keys in the Hashtable. The hash method calculates the index for a key based on its hash code and the table's capacity.
In terms of efficiency, this code demonstrates an average-case time complexity of O(1) for the set, get, and has methods, 
as they rely on the array's index calculation. The keys method, which iterates over all key-value pairs, has a time complexity of O(n),
where n is the number of elements in the Hashtable.

## Solution

![Output](../../../../../../assests/challenge%2030%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the HashTable class.
