import java.util.Stack;

public class PostfixToInfix {
    static String postfixToInfix(String exp){
        Stack<String> stack=new Stack<>();
        //for(char ch:exp.toCharArray())
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            else{
                String operand1=stack.pop();
                String operand2=stack.pop();
                String updatedOperand="("+operand2+ch+operand1+")";
                stack.push(updatedOperand);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String postfix="ab+cd-*e/";
        String infix=postfixToInfix(postfix);
        System.out.println("Infix : "+infix);
    }
}
