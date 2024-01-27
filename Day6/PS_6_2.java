import java.util.Scanner;
public class PS_6_2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter the value of n : ");  
     int n = sc.nextInt();
     float arr[] = new float[n];
     for(int i=0;i<n;i++) 
     {
        System.out.print("Element" + (i+1) + " : ");
        arr[i] = sc.nextFloat();

     }
     for(int i=0;i<n;i++) 
     {
        if(arr[i] == (int) arr[i])
        break; 
     }
     {
        System.out.println("The array contains an integer in it");
     }
    
     
    }
}
