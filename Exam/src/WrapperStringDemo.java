public class WrapperStringDemo {
    public static void main(String[] args) {
        Integer num = 12345;
        String str = num.toString();
        System.out.println("Length: " + str.length());
        System.out.println("Upper Case: " + str.toUpperCase());
        System.out.println("Character at index 2: " + str.charAt(2));
    }
}