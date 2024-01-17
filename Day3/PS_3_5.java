import java.util.Scanner;
public class PS_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String hello = "Dear Harry , This java course is nice. Thanks a lot";
        // The predicted output is 
        System.out.println("\"Dear Harry , This course is nice. Thanks a lot.\"");
        // By taking input from user and then formatting is done below 
        System.out.println("Enter the string : ");
        String hi = sc.nextLine();
        System.out.println("\"" + hi + "\"");

    }
}
