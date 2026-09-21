package LeetcodeQuestions;

import java.util.Stack;

public class BaseballGame682 {
    public static int calPoints(String[] ops){
        Stack<Integer> stack=new Stack<>();
        for(String str:ops){
            if(str.equals("+")){
                int x=stack.pop();
                int y=stack.peek();
                int newScore=x+y;
                stack.push(x);
                stack.push(newScore);
            }
            else if(str.equals("C")){
                stack.pop();
            }
            else if(str.equals("D")){
                int newScore=2*stack.peek();
                stack.push(newScore);
            }
            else{
                stack.push(Integer.parseInt(str));
            }
        }
        int total=0;
        for(int score:stack){
            total+=score;
        }
        return total;
    }

    public static void main(String[] args) {
        String[] operations={"5","2","C","D","+"};
        System.out.println(calPoints(operations));
    }
}
