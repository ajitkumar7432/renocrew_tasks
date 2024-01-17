import java.util.Scanner;
public class PS_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the String : ");
        String string = sc.nextLine();
        System.out.println("The entered String is : " + string);
        String lowercase = string.toLowerCase();
        System.out.println("The Lower case of the String is : " + lowercase);
    }
}
