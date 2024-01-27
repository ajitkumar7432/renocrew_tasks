import java.util.Scanner;
public class PS_6_7 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter the number of elements in an array : "); 
     int n = sc.nextInt();
     int arr[] = new int [n];
     for(int i=0;i<n;i++)
     {
        System.out.print("Element " + (i+1) + " : ");
        arr[i]=sc.nextInt();
     }  
     int min = arr[0];
     for(int i=0;i<n;i++)
     {
        if(arr[i] < min){
            min= arr[i];
        }
     }
     System.out.println("The minimum element in an array is : " + min);
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1])
            {
            int temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }

        }
    }
        System.out.println("The ascending order of the elements in an array is : " );
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
     
    }
}
