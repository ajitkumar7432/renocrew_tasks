import java.util.Scanner;
public class pS_6_8 {
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter the number of Elements in an array : ");
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.print("Elements " + (i+1) + " : ");
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;

                    }
                }
            }
            System.out.println("The elements in an array is not sorted :");
            System.out.print("The sorted Elements in an array is : ");
            for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }


    }
}
