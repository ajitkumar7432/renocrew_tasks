import java.util.Scanner;
public class PS_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of subjects : ");
        int n = sc.nextInt();
        int totalmarks = 0;
        sc.nextLine();
        String[] subjects = new String[n];
        int marks [] = new int[n];
        System.out.println("Enter the Subjects : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("Subject" + (i+1) + " : ");
            subjects[i] = sc.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.print("Enter the Marks of "+ subjects[i] +" : " );
            marks[i] = sc.nextInt();
            if(marks[i]>=33)
            {
                System.out.println("He is passed in this subject ");
            }
            else {
                System.out.println("He is not passed in this subject");
            }
            totalmarks += marks[i];
        }
        int percentage = totalmarks/n * 100;
        if(percentage >= 40) 
        {
            System.out.println(" Therefore , He is passed in every Subject ");
        }
        else{
            System.out.println("Therefore , He is not passed ");
        }

    }
}

