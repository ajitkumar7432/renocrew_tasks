import java.util.Scanner;
public class PS_5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number whose multiplication table and the sum of all values of that table need to be calculated : ");
        int n = sc.nextInt();
        int sum =0;
        for(int i =1; i<=10; i++)
        {
            System.out.printf(" \n%d X %d = %d ",n,i,n*i);
            sum = sum + n*i;
        }
        System.out.println("\nThe sum of all values of multiplication table of " + n + " is : " + sum);
    }
}
