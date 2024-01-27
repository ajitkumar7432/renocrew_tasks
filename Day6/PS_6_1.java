import java.util.Scanner;
public class PS_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of floats:");
        int n = sc.nextInt();
        float arr[] = new float[n];
        float sum = 0;
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("Element " + i +  " : ");
            arr[i] = sc.nextFloat();
            sum += arr[i];
        }
        System.out.println("The sum of all Elements are : " + sum);


    }
}
