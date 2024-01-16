import java.util.Scanner;
public class PS_2_4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter the value of v : ");
     int v = sc.nextInt();
     System.out.print("Enter the value of u : ");
     int u = sc.nextInt();
     System.out.print("Enter the value of a : ");
     int a = sc.nextInt();
     System.out.print("Enter the value of s : ");
     int s = sc.nextInt();
     float d = ((v*v) - (u*u)) /(2*a*s);
     System.out.println("The value of the expression is : " + d);
     
    }
}
