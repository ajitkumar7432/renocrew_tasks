import java.util.Scanner;
public class PS_3_4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter the String : ");
     String string = sc.nextLine();
     int index = string.indexOf("  ");
     System.out.println(" The Index of double Spaces is: " +index);
     int hi = string.indexOf("   ");
     System.out.println("The Index of triple spaces in String is : " + hi);

    }
}
