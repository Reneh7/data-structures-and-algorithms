/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge14;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> players=new ArrayList<>();
        players.add("A");
        players.add("B");
        players.add("C");
        players.add("D");
        players.add("E");

        Queue newQueue= new Queue();
        System.out.println("The winner is: "+ newQueue.DuckDuckGoose(players,3));

    }
}