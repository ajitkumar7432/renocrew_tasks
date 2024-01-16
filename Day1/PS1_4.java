import java.util.Scanner;
public class PS1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the kilometer : ");
        int a = sc.nextInt();
        double miles=(a*0.621);
        System.out.println("The conversion of kilometer to miles is : " + miles);

    
    }
}
