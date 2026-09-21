package LeetcodeQuestions;

import java.util.Stack;

public class ValidParanthesis20 {
    static boolean checkValidParanthesis(String exp){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch != '(' && ch != '[' && ch != '{' && ch!=')' && ch!=']' && ch!='}'){
                continue;
            }
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if( (ch==')' && top!='(') || (ch==']' && top!='[') || (ch=='}' && top!='{') ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String exp="({()})";
        boolean result=checkValidParanthesis(exp);
        System.out.println(result);
    }
}
