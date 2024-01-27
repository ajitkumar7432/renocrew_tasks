import java.util.Scanner;
public class PS_7_6 {
    static int average(int ...arr)
    {
     int sum =0;
        
        
        for(int i=0;i<arr.length;i++)
        {
            sum = sum +arr[i];
            

        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the number of Elements : ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Element" + (i+1) + " : ");
             arr[i] = sc.nextInt();
        }
        int avg = average(arr);
        System.out.println("The average of all the elements are :  " + avg);

    }
}
