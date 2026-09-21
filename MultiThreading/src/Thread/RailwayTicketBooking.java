package Thread;

    class TicketCounter{
        public int availableTicket=1;
        synchronized public void bookTicket(String userName){
            System.out.println(userName+" is checking ticket availability");
            if(availableTicket>0){
                try{
                    Thread.sleep(300);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
                System.out.println(userName+" is booking the ticket.");
                availableTicket--;
                System.out.println("Ticket booked for "+userName);
            }
            else{
                System.out.println("Sorry "+userName+" ticket is not available");
            }
            System.out.println("Available Ticket after booking by "+userName+" : "+availableTicket);
        }
    }
    class userThread extends Thread{
        private String userName;
        TicketCounter counter; //creating object
        userThread(TicketCounter counter,String name){
            this.counter=counter;
            this.userName=name;
        }
        @Override
        public void run(){
            counter.bookTicket(userName);
        }

    }
public class RailwayTicketBooking {
    public static void main(String[] args) {
        TicketCounter counter=new TicketCounter();
        userThread thread1=new userThread(counter,"Ravi");
        userThread thread2=new userThread(counter,"Tarun");
        userThread thread3=new userThread(counter,"Mani");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
