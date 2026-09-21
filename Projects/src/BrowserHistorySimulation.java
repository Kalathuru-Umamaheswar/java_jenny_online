import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class BrowserHistorySimulation {
   private LinkedList<String> list=new LinkedList<>();
   private ListIterator<String> listItr=list.listIterator();
   private String currentPage = null;
    void visitpage(String url){
        while(listItr.hasNext()){
            listItr.next();
            listItr.remove();
        }
        listItr.add(url);
        currentPage=url;
        System.out.println("Visited "+url);
    }
    void goBack(){
        if(listItr.hasPrevious()){
            currentPage=listItr.previous();
            System.out.println("back to : "+currentPage);
        }
        else{
            System.out.println("No previous page exist");
        }
    }
    void goForward(){
        if(listItr.hasNext()){
            currentPage=listItr.next();
            System.out.println("Forward to : "+currentPage);
        }
        else{
            System.out.println("No forward page exist");
        }
    }
    void showCurrentPage(){
        if(currentPage == null){
            System.out.println("No page visited yet");
        }
        else{
            System.out.println("Current Page : "+currentPage);
        }
    }


    public static void main(String[] args) {
        BrowserHistorySimulation browser=new BrowserHistorySimulation();
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("********************");
            System.out.println("Mini Project - Browser History Simulation");
            System.out.println("********************");

            System.out.println("\n------Browser Menu-------");
            System.out.println("1. Visit new page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Show Current page");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 :
                    System.out.println("Enter URL : ");
                    String url=sc.nextLine();
                    browser.visitpage(url);
                    break;

                case 2 :
                    browser.goBack();
                    break;
                case 3 :
                    browser.goForward();
                    break;
                case 4 :
                    browser.showCurrentPage();
                    break;
                case 5 :
                    System.out.println("Existing browser");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }


    }
}
