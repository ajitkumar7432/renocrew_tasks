import java.util.Scanner;

public class PS_5_6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number whose factorial need to be calculated : ");
        int n = sc.nextInt();
        int product = 1;
        int i =1;
        while(i<=n)
        {
            product = product * i;
            i++;
        }  
        System.out.println("The factorial of the number is : " + product );
    }
}
