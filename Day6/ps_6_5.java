import java.util.Scanner;
public class ps_6_5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the size :");
    int n = sc.nextInt();
    int arr [] = new int[n];
    System.out.println("Enter the elements : ");
    for(int i=0;i<n;i++)
    {
        System.out.print("Element " + (i+1) + " : ");
        arr[i] = sc.nextInt(); 
    }
    System.out.println("The elements in reverse order are as follows :");
    for( int i=n-1;i>=0;i--)
    {
        System.out.println(arr[i]);
    }

    }
}
