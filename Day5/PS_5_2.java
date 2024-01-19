import java.util.Scanner;
public class PS_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int i = 1;
        int sum =0;
        while(i<=n)
        {
            sum = sum + 2*i;
            i++;
            
        }
        System.out.println("The sum of first " + n+ " even numbers is : " + sum);

    }
}
