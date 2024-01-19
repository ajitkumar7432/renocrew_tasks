import java.util.Scanner;
public class PS_5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + 2*i;
        }
        System.out.print("The sum of first " + n + " even numbers is : " + sum);
    }
}
