import java.util.Scanner;
public class PS_7_1 {
    static void table(int a)
    {
        int product = 1;
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d \n",a,i,i*a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The multiplication table of " + n + " is as follows :");
        table(n);

    }
}
