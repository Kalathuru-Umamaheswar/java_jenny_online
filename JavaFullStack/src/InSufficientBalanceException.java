public class InSufficientBalanceException extends Exception{
    private String msg;
    InSufficientBalanceException(String msg){
        this.msg=msg;
    }

    public String getMsg(){
        return msg;
    }

}
