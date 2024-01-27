import java.util.Scanner;
public class PS_7_10 {
    static int natural(int a)
    {
        int product = 1;
        int sum =0;
        for(int i=1;i<=a;i++)
        {
            product *= i;
            sum = sum + i;
        }
        return sum;
        //return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        
        natural(n);
       System.out.println("The sum of the first " + n+ " natural numbers is : " +natural(n));
        //System.out.println("The factorial of the number is : " + natural(n));
    }
}
