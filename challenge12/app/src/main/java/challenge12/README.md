#  Animal Shelter

## Description

The AnimalShelter class is a data structure that simulates an animal shelter following a "first-in, first-out" (FIFO)
approach. It maintains a queue of animals, including cats and dogs, and provides methods for enqueuing (adding) animals
and dequeuing (removing and returning) animals based on a specified preference, which can be either "cat" or "dog." 
The class ensures that animals are adopted in the order they were added to the shelter, and it allows for selective
adoption based on the preferred species.

## Whiteboard Process

![WhiteBoard](../../../../../../assests/Challenge12%20WhiteBoard.png)

## Approach & Efficiency

The AnimalShelter class implements a queue-like data structure to manage a collection of cats and dogs.
The enqueue operation adds animals to the shelter, and the dequeue operation allows adopting animals based on a 
preference of "cat" or "dog." The class maintains two pointers, one for the front and one for the back,
ensuring efficient enqueuing with a time complexity of O(1). The dequeue operation searches for the preferred animal
in the queue, removing and returning it, which may require traversing the queue, resulting in a time complexity of O(n)
in the worst case, where n is the number of animals in the shelter. This class provides a simple and organized way to 
manage and adopt animals from the shelter.

## Solution

![Output](../../../../../../assests/challenge%2012%20output.png)

After compiling, run the Java program using the java command followed by the class name and it will execute the main function that invoke the AnimalShelter class.
