import java.util.Scanner;
public class PS_5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number whose factorial need to be calculated : ");
        int n = sc.nextInt();
        int product = 1;
        for(int i =1;i<=n;i++)
        {
            product = product * i;
        }
        System.out.print("The factorial of the number is : " + product);
    }
}
