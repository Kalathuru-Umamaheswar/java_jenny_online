public class StringRemoveWhiteSpaces {
    public static void main(String[] args) {
        /*String str="  Welcome to   jenny's\n Lec\ttures  ";
        String str1="";
        int i=0;
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '&& ch!='\t' && ch!='\n'){
                str1+=ch;
            }
        }
        System.out.println(str1);*/

        String str = "  Welcome to   jenny's\n Lec\ttures  ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && ch != '\t' && ch != '\n') {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }

    }



