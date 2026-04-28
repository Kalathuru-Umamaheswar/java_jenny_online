//Stack implementing 2 queues

import java.util.LinkedList;
import java.util.Queue;

class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        public void push(int a){  //TC = O(1)
            q1.add(a);
        }
        public boolean iSEmpty(){ //TC = O(1)
            return q1.isEmpty();
        }
        public int stSize(){ //TC = O(1)
            return q1.size();
        }
        public void stPop(){ //TC = O(n)
            if(q1.isEmpty()){
                System.out.println("stack is empty");
                return;
            }
            while(q1.size() != 1){
                q2.add(q1.peek());
                q1.remove();
            }
            q1.remove(); // the top element in q1 is removed
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        public int stTop(){ //TC = O(n)
            if(q1.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            while(q1.size() != 1){
                q2.add(q1.peek());
                q1.remove();
            }
            int answer = q1.peek();
            q2.add(q1.peek());
            q1.remove();
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return answer;
        }
    }
    public class App {
        public static void main(String[] args) {
            Stack st = new Stack();
            System.out.println(st.iSEmpty());
        }
    }


