public class StringReverse {
    public static void main(String[] args) {
        /*String str=new String("Jenny Khatri");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }*/

        /*String str="Umesh Kalathuru";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());*/

        String str="Umesh Kalathuru";
        StringBuilder sb=new StringBuilder(str);
        int left=0,right=str.length()-1;
        while(left<right){
            char leftChar=sb.charAt(left);
            char rightChar=sb.charAt(right);
            sb.setCharAt(left,rightChar);
            sb.setCharAt(right,leftChar);
            left++;
            right--;
        }
        System.out.println(sb.toString());
    }
}
