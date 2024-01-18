import java.util.Scanner;
public class PS_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the url to find the type of website :");
        String url = sc.nextLine();
        if(url.endsWith(".com"))
        {
            System.out.println("The url is of Commercial website");
        }
        else if(url.endsWith(".org"))
        {
            System.out.println("The url is of Organization website");
        }
        else if (url.endsWith(".in"))
        {
            System.out.println("The url is of Indian website");
        }
        else
        {
            System.out.println("Invalid url");
        }
    }
}
