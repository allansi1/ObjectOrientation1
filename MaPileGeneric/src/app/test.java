package app;

import java.util.Stack;

public class test {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == '<' || current == '[' || current == '{' || current == '(') {
                stack.push(current);
            } else if (current == '>' || current == ']' || current == '}' || current == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.peek();
                if (current == '>' && last == '<' || current == ']' && last == '[' || current == '}' && last == '{' || current == ')' && last == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "abc[c(d(efg)<lk}";
        if (isBalanced(str)) {
            System.out.println("A cadeia de caracteres está equilibrada.");
        } else {
            System.out.println("A cadeia de caracteres não está equilibrada.");
        }
    }
}
