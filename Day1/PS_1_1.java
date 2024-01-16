import java.util.Scanner;
public class PS_1_1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter the three numbers :");
     System.out.print("Number 1 : ");
     int a = sc.nextInt();
     System.out.print("Number 2 : ");
     int b = sc.nextInt();
     System.out.print("Number 3 : ");
     int c = sc.nextInt();
     int d = a+ b+ c /3;
     System.out.printf("The sum of the three numbers are : %d",d);

    }
}
