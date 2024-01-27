import java.util.Scanner;
public class PS_7_3 {
    static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        sum(a);
        System.out.println("The sum of first " + a + " natural number is : " +sum(a));


    }
}
