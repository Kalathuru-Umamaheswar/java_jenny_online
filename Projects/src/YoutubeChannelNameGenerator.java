import java.util.Scanner;

public class YoutubeChannelNameGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome TO Youtube Channel Name Generator ");
        System.out.println("What is your Nick Name :");
        String name=sc.nextLine();
        System.out.println("What is the next name you want to add :");
        String nextName=sc.nextLine();
        System.out.println("Your Youtube Channel Name would be "+name+" "+nextName);
    }
}
