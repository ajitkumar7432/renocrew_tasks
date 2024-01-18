import java.util.Scanner;
public class PS_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Year : ");
        double n = sc.nextInt();
        if(n%4==0 && n%100!=0)
        {
            System.out.println("The given year is a leap year");
        } 
        else if(n%400==0)
        {
            System.out.println("The given year is a leap year");
        }
        else 
        {
             System.out.println("The given year is not a leap year ");
        }
        
    }
}
