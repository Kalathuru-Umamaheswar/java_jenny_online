package Stack;

import java.util.Stack;

public class InfixToPrefix {

        static int precedence(char op){
            switch (op){
                case '^' : return 3;
                case '/','*' : return 2;
                case '+','-' : return 1;
            }
            return -1;
        }
    static String reverseAndSwap(String exp) {
        StringBuilder rev = new StringBuilder();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                rev.append(')');
            } else if (ch == ')') {
                rev.append('(');
            } else {
                rev.append(ch);
            }
        }
            return rev.toString();
        }


        static String infixToPostfix(String exp) {
            StringBuilder output = new StringBuilder();
            Stack<Character> stack = new Stack<>();
            for (char ch : exp.toCharArray()) {
                if (Character.isLetterOrDigit(ch)) {
                    output.append(ch);
                } else if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        output.append(stack.pop());
                    }
                    stack.pop(); //for removing '(' from stack
                } else {
                    while (!stack.isEmpty() && stack.peek() != '(' &&
                            (precedence(ch) < precedence(stack.peek())
                                    || precedence(ch) == precedence(stack.peek()) && ch == '^')) {
                        output.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }
            while (!stack.isEmpty()) {
                output.append(stack.pop());
            }
            return output.toString();
        }
    static String infixToPrefix(String exp){
        String updatedExp=reverseAndSwap(exp);
        String postfix=infixToPostfix(updatedExp);
        return new StringBuilder(postfix).reverse().toString();
    }
    public static void main(String[] args) {
        String expression="a+(b*c-(d/e^f)*g)*h";
        String prefix=infixToPrefix(expression);
        System.out.println("Prefix : "+prefix);
    }
}
