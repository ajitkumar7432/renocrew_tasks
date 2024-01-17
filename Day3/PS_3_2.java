import java.util.Scanner;
public class PS_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the String : ");
        String string = sc.nextLine();
        System.out.println("The Entered String is : " + string);
        String spacetounderscore = string.replace(" ", "_");
        System.out.println("The Resulted String is : " + spacetounderscore);
    }
}
