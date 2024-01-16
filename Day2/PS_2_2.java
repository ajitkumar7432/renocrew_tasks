import java.util.Scanner;
public class PS_2_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the grade: ");
    char grade = sc.next().charAt(0); //char input ke liye ham charAt() use karte hain
    char encrypt = (char)(grade + 8);
    System.out.printf("The encrypt is %c \n" ,encrypt);
    char decrypt = (char)(encrypt - 8);
    System.out.println("The correct grade is : "+ decrypt);
    }
}
// ye program me sikhne mila ki kaise char input karne ka aur phir usko increase karke print karneka aur phir usko decrease karke print karne ka 

