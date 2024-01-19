import java.util.Scanner;
public class PS_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Multiplication Table of " + n + " : ");
        for(int i=1;i<=10;i++)
        {
            System.out.printf(" \n%d X %d = %d",n,i,n*i);
        }
    }
}
