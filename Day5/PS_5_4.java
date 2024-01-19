import java.util.Scanner;

public class PS_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The multiplication Table of " + n + " in reverse order is : ");
        for(int i=10;i>=1;i--)
        {
            System.out.printf("\n  %d X %d = %d ",n,i,n*i);
        }

    }
}
