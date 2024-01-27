import java.util.Scanner;
import java.io.*; 

public class  PS_7_8
{    
    static void pattern(int n) 
    {       
        if (n < 1) 
            return;     
        System.out.print( "* "); 
        pattern(n - 1); 
    } 
      
    static void pat(int n) 
    { 
         if (n < 1) 
            return;       
        pattern(n);    
        System.out.println (); 
        pat(n - 1);           
    } 
    
    public static void main (String[] args)  
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows : ");
        int a = sc.nextInt();
        System.out.println("The requird pattern is : ");
        pat(a); 
          
    } 
} 


