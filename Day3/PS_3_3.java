import java.util.Scanner;
public class PS_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Original Tempalate  : \"Dear <|name|> , Thanks a lot \"");
        String never = "Dear <|name|> , Thanks a lot ";
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        String replace = never.replace("<|name|>", name);
        System.out.println("The Resulted Tempalate looks like : " + replace);
        //System.out.println("\"Dear " + replace + ", Thanks a lot .\"");
        

    }
}
