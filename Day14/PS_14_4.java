import java.util.Scanner;
class MaxRetriesReachedException extends Exception {
    public MaxRetriesReachedException(String message) {
        super(message);
    }
}

public class PS_14_4 {
    public static void main(String[] args) {
        boolean b = true;
        int[] marks = {7, 8, 9};
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        final int MAX_RETRIES = 5;
        
        System.out.println("Enter the value of index:");
        while (b && i < MAX_RETRIES) {
            try {
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                b = false; 
            } catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
        }

        if (i >= MAX_RETRIES) {
            try {
                throw new MaxRetriesReachedException("Max retries reached");
            } catch (MaxRetriesReachedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
