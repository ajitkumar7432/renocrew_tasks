import java.util.Scanner;
public class PS_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any number of a month (1-31) to print the day of week : ");
        int n = sc.nextInt();
        switch(n%7)
        {
            case 1 : {
                System.out.println("Monday");
            } break ;
            case 2 : {
                System.out.println("Tuesday");
            } break ;
            case 3 : {
                System.out.println("Wednesday");
            } break ;
            case 4 : {
                System.out.println("Thrusday");
            } break ;
            case 5 : {
                System.out.println("Friday");
            } break ;
            case 6 : {
                System.out.println("Saturday");
            } break ;
            case 7 : {
                System.out.println("Sunday");
            } break ;
            default : {
                System.out.println("Invalid number");
            } break ;

        }
    }
}
