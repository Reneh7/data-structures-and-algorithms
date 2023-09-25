package challenge15;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzNode {
    String val;
    List<FizzBuzzNode> children;

    public FizzBuzzNode(String val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}


