public class StringToggleCaseOfEachCharacter {
    public static void main(String[] args) {
        String str="Umesh KalaThURu@1223";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        /*String str="uMesh KalAThUrU";
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                result+=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                result+=Character.toUpperCase(ch);
            }
            else{
                result+=ch;
            }
        }
        System.out.println(result);*/
    }
}
