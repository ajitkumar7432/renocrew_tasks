import java.util.Scanner;

public class PS_5_7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        int i =n;
        while(i>=1)
        {
            int j =1;
            while(j<=i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.print("\n");
            i--;
        }  
    }
}
