import java.util.Scanner;
public class PS_7_9 {
    public static void fahrenheit(double cel)
    {
        double fahrenheit = ((cel*9)/5 )+ 32;
        System.out.println("The Farhenheit is : " + fahrenheit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Celcius : ");
        double n = sc.nextDouble();
        fahrenheit(n);
    }
}
