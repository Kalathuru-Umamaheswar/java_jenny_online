public class StringRemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str="jenny";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(sb.toString().indexOf(ch)==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb);
        /*String str="jenny";
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        System.out.println(result);*/
    }
}
