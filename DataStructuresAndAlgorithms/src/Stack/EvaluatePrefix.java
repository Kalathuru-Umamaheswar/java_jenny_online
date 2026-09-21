package Stack;
import java.util.Stack;
public class EvaluatePrefix {
    static boolean isOperator(char op){
        return op=='+' || op=='-' || op=='*' || op=='/' || op=='^';
    }
    static int compute(char op,int op1,int op2){
        switch (op){
            case '+':return op1+op2;
            case '-':return op1-op2;
            case '*':return op1*op2;
            case '/':return op1/op2;
            case '^':return (int)Math.pow(op1,op2); //it will return double values
            default:throw new IllegalArgumentException("Invalid operator: "+op);
        }
    }
    static int evaluatePrefix(String exp){
        Stack<Integer> stack=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }
            else if(isOperator(ch)){
                int op1=stack.pop();
                int op2=stack.pop();
                int updatedOperand=compute(ch,op1,op2);
                stack.push(updatedOperand);
            }
            else{
                throw new IllegalArgumentException("Invalid Character : "+ch);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String prefix="^2^23";
        int output=evaluatePrefix(prefix);
        System.out.println("Output : "+output);
    }
}
