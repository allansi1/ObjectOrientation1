package pack;

public class CheckChar {
    public static void main(String[] args) {
        String str = "abc{erf[dgf](<mm<>paa))";
        int result = checkBalance(str);
        if (result == -1) {
            System.out.println("The string has balanced characters.");
        } else {
            System.out.println("The string does not have balanced characters. The first unbalanced character is at position " + result + ".");
        }
    }
    public static int checkBalance(String str) {
        char[] stack = new char[str.length()];
        int top = -1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '[' || c == '(' || c == '<') {
                stack[++top] = c;
            } else if (c == '}' || c == ']' || c == ')' || c == '>') {
                if (top == -1) {
                    return i;
                }
                char popped = stack[top--];
                if ((c == '}' && popped != '{') || (c == ']' && popped != '[') || (c == ')' && popped != '(') || (c == '>' && popped != '<')) {
                    return i;
                }
            }
        }
        if (top != -1) {
            return str.length();
        }
        return -1;
    }
}