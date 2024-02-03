package calci;
import java.util.*;
class Calculator{
    public void calculate(int a,int b)
    {
        System.out.println("The multiplication of both the nummbers are : " + a*b);
    }
}
    class Sc{
        public void calculate(int a ,int b){
        System.out.println("The sin of a X b is :  "+ Math.sin(a*b));
        }
}
class Hy{
    public void calculate(int a,int b)
    {
        System.out.println("The multiplication of the numbers are : " +a+b);
        System.out.println("The sin of a X b is : " +Math.sin(a*b));
    }
}

public class PS_12_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
    }
}
