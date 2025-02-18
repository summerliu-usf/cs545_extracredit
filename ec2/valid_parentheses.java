package ec2;

import java.util.Stack;

public class valid_parentheses {
    // parentheses must be opened and closed in the correct order, therefore location matter
    //stack will keep track of open parentheses

    public boolean isValid(String s) {
        Stack<> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char match = (char) stack.pop();
                if ((c == ')' && match != '(') ||
                        (c == ']' && match != '[') ||
                        (c == '}' && match != '{')) {
                    return false;
                }
            }}
    return true;
    }}
