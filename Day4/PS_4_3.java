import java.util.Scanner;
public class PS_4_3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter the Salary of an Employee :");
     double n  = sc.nextInt();
     if(n < 250000)
     {
        System.out.println("There is no income tax availabe");
     }
     else if (n >= 250000 || n< 500000) {
        System.out.println("He will have to pay a tax of rs : " +n*0.05);
     }
     else if (n >= 500000 || n< 1000000) {
        System.out.println("He will have to pay a tax of rs : " +n*0.20);
     }
     else if (n >= 1000000) {
        System.out.println("He will have to pay a tax of rs : " +n*0.30);
     }
    }
}
