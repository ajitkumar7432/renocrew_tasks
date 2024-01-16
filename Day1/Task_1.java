import java.util.Scanner;
public class Task_1 {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("\nEnter the 5 subjects whose marks would be calculated to find the percentage:");
        System.out.print("\nSubject 1:");
        String subject1 = sc.nextLine();
        System.out.print("Subject 2:");
        String subject2 = sc.nextLine();
        System.out.print("Subject 3:");
        String subject3 = sc.nextLine();
        System.out.print("Subject 4:");
        String subject4 = sc.nextLine();
        System.out.print("Subject 5:");
        String subject5 = sc.nextLine();
        System.out.print("Enter the marks of " + subject1 + " : ");
        float a = sc.nextFloat();
        System.out.print("Enter the marks of " + subject2 +" :");
        float b = sc.nextFloat();
        System.out.print("Enter the marks of " + subject3 +" :");
        float c = sc.nextFloat();
        System.out.print("Enter the marks of " + subject4 +" :");
        float d = sc.nextFloat();
        System.out.print("Enter the marks of " + subject5 +" :");
        float e = sc.nextFloat();
        float percentage = (((a+b+c+d+e)*100)/500);
        System.out.print("The percentage of the student is : " + percentage);


    }

}