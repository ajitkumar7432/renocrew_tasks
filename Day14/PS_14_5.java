
import java.util.Scanner;

class MaxRetriesReachedException extends Exception {
    public MaxRetriesReachedException(String message) {
        super(message);
    }
}

public class PS_14_5 {
    public static void main(String[] args) {
        try {
            retrieveMarks();
        } catch (MaxRetriesReachedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void retrieveMarks() throws MaxRetriesReachedException {
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
            throw new MaxRetriesReachedException("Max retries reached");
        }
    }
}
