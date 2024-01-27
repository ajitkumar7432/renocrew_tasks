import java.util.Scanner;
public class PS_6_4 {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of m for number of rows in a matrix :");
        int m = sc.nextInt();
        System.out.print("Enter the value of n for number of coulmns in a matrix :");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        System.out.println("Enter the Elements of Matrix A : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix A looks like : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("\t" + a[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Enter the Elements of Matrix B : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix B looks like : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("\t" + b[i][j]);
            }
            System.out.print("\n");
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The sum of Matrix A and Materix B looks like : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print("\t" +c[i][j]);
            }
            System.out.print("\n");
        }
        



    }
}
