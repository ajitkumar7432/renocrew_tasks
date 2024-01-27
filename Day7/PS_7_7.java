import java.util.Scanner;
public class PS_7_7 {
    static void pattern(int a)
    {
        if (a>0)
        {
            pattern(a-1);
            for(int i=0;i<a;i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows : ");
        int b = sc.nextInt();
        System.out.println("The required pattern is : ");
        pattern(b);
    }
}
