import java.util.Scanner;
public class PS_1_2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter the marks of three subjects : ");
     System.out.print("Subject 1 : ");
     float a = sc.nextFloat();  
     System.out.print("Subject 2 : ");
     float b = sc.nextFloat(); 
      System.out.print("Subject 3 : ");
     float c = sc.nextFloat();
     float cgpa = (a + b +  c)/30;
     System.out.printf("The CGPA of the student is : %f ",cgpa);   
    }
}
