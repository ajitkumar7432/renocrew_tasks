import java.util.Scanner;
public class PS_7_2 {
    static void pattern(int a)
    {
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*"); 
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no. of rows : ");
        int n = sc.nextInt();
        System.out.println("The required pattern is as follows : ");
        pattern(n);

    }
}
