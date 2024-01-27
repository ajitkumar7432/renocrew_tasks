import java.util.Scanner;
public class PS_6_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the total number of students : ");
        int n = sc.nextInt();
        float arr[] = new float[n];
        float avg = 0;
        float sum =0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the marks in Physics of student " + (i+1) + " : ");
            arr[i] = sc.nextFloat();
            sum += arr[i];
            avg = sum /n;
        }
        
        System.out.println("The average of all marks of students in Physics are : " + avg);
    }
}
