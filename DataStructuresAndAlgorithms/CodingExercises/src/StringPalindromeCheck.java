public class StringPalindromeCheck {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        if (str.equals(reversed)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }*/
        String str="civic";
        int left=0,right=str.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
             isPalindrome=false;
             break;
            }
            left++;
            right--;
        }
        if(isPalindrome==false){
            System.out.println("String is not a palindrome");
        }
        else{
            System.out.println("String is palindrome");
        }
    }
}
