package folder.folderl1.folderl2;
import java.util.*;
class Calculator{
    public void calculate(int a,int b)
    {
        System.out.println("The multiplication of both the nummbers are : " + a*b);
    }
}
    

public class PS_12_3 {
    public static void main(String args[]){

    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the value of a:");
    int a = sc.nextInt();
    System.out.println("Enter the value of b:");
    int b = sc.nextInt();
    Calculator d = new Calculator();
    d.calculate(a,b);
    }

    
}
