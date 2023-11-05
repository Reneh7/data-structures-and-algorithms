package challenge32;

import java.util.HashSet;
import java.util.Set;

public class TreeIntersection {
    public Set<Integer> treeIntersection(TreeNode root1, TreeNode root2) {
        Set<Integer> commonValues = new HashSet<>();
        Set<Integer> valuesFromTree1 = new HashSet<>();

        populateHashSet(root1, valuesFromTree1);

        findCommonValues(root2, valuesFromTree1, commonValues);

        return commonValues;
    }

    private void populateHashSet(TreeNode node, Set<Integer> set) {
        if (node == null) {
            return;
        }
        set.add(node.val);
        populateHashSet(node.left, set);
        populateHashSet(node.right, set);
    }

    private void findCommonValues(TreeNode node, Set<Integer> valuesFromTree1, Set<Integer> commonValues) {
        if (node == null) {
            return;
        }

        if (valuesFromTree1.contains(node.val)) {
            commonValues.add(node.val);
        }

        findCommonValues(node.left, valuesFromTree1, commonValues);
        findCommonValues(node.right, valuesFromTree1, commonValues);
    }
}
