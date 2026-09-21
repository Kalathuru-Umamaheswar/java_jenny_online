package Stack;

import java.util.Stack;

public class PrefixToInfix {
    static String prefixToInfix(String exp) {
        Stack<String> stack = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) //Fetching the character from right to left
        {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String updatedOperand = "(" + operand1 + ch + operand2 + ")";
                stack.push(updatedOperand);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String prefix="-+a*bc-/de+fg";
        String infix=prefixToInfix(prefix);
        System.out.println("Infix : "+infix);
    }
}
