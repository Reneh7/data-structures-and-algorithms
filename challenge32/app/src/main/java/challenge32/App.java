/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge32;

import java.util.Set;

public class App {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(4);

        TreeIntersection treeIntersection = new TreeIntersection();

        Set<Integer> commonValues = treeIntersection.treeIntersection(root1, root2);

        System.out.println("Common values: " + commonValues);
    }
}
