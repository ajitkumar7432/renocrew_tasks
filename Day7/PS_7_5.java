import java.util.Scanner;
public class PS_7_5 {
    static int fibonacci(int a)
    {
        if(a==0)
        {
            return 0;
        }
        else if (a==1)
        {
            return 1;
        }
        else
        {
            return fibonacci(a-1) + fibonacci (a-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        fibonacci(n);
        System.out.println("The fibonacci series is : " );
        for(int i=0;i<n;i++)
        {
            System.out.println( fibonacci(i));
        }
    }
}
