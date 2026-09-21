public class CompileTimePolymorphism {
    static void makepayment(int pin,long cardnumber){
        System.out.println("The payment has been done using pin "+pin+" and the card number "+cardnumber);
    }
    static void makepayment(String upi_id){
        System.out.println("The payment has been done using pin "+upi_id);
    }
    static void makepayment(long accno,String ifsccode){
        System.out.println("The payment has been done using accno "+accno+" and the ifsc code "+ifsccode);
    }
    public static void main(String[] args) {
        makepayment("234567@ybl_sbi");
        makepayment(123456,123456789);
        makepayment(1234567890l,"12345678@ybl_sbi");
    }
}
