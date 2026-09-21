public class ForEachLoopExercises {
    public static void main(String[] args) {
        //print sum of all elements in an array using for each loop
        /*int[] numbers=new int[]{1,2,3,5,8,4,23,45};
        int sum=0;
        //for(int i=0;i<numbers.length;i++){
        //  sum += numbers[i];
        //}
        for(int i : numbers){
            sum += i;
        }
        System.out.println(sum); */
        //count how many times a specific character appears in a given character array
        /*char[] letters={'a','b','d','d','b'};
        char target='b';
        int count=0;
        for(int  ch : letters){
            if(ch==target){
                count++;
            }
        }
        System.out.println(count); */
        //print all the even numbers from an integer array
        int[] numbers = new int[]{1,2,3,4,5,7,8,9};
        for(int i:numbers){
            if(i % 2 == 0){
                System.out.println(i);
            }
    }

    }
}
