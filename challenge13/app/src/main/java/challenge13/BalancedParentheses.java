package challenge13;

public class BalancedParentheses {
        private Node top;
        public boolean isEmpty()
        {
            return top == null;
        }

        public void push(String value)
        {
            Node newNode = new Node(value);
            if (isEmpty()) {
                top = newNode;
                top.next = null;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }

        public void pop()
        {
            if (isEmpty()) {
                throw new IllegalArgumentException("Stack is empty");
            } else {
                top = top.next;
            }
        }

    public boolean validateBrackets(String exp)
    {
        for (int i = 0; i < exp.length(); i++)
        {
            char currentChar = exp.charAt(i);
            if (currentChar == '{' || currentChar == '[' || currentChar == '(')
            {
                push(String.valueOf(currentChar));
            }
            else if (currentChar == '}' || currentChar == ']' || currentChar == ')')
            {
                if (isEmpty() || !areMatching(top.getItem(), String.valueOf(currentChar)))
                    return false;
                 else
                    pop();
            }
        }
        return isEmpty();
    }

        private boolean areMatching(String openBracket, String closeBracket)
        {
            if (openBracket.equals("{") && closeBracket.equals("}"))
                return true;
            else if (openBracket.equals("[") && closeBracket.equals("]"))
                return true;
            else if (openBracket.equals("(") && closeBracket.equals(")"))
                return true;
            else
                return false;
        }
}
