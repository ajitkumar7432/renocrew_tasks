package folder1;

import java.util.Scanner;

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("The multiplication of both the numbers is: " + a * b);
    }
}

class Sc {
    public void calculate(int a, int b) {
        System.out.println("The sin of a X b is: " + Math.sin(a * b));
    }
}

class Hy {
    public void calculate(int a, int b) {
        System.out.println("The multiplication of the numbers is: " + (a + b));
        System.out.println("The sin of a X b is: " + Math.sin(a * b));
    }
}

class Hi extends PS_12_4 {
    Hi() {
        System.out.println(protectedInt);
        System.out.println(defInt);
    }
}

public class PS_12_4 {
    protected static int protectedInt = 5;
    int defInt = 6;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Hi a = new Hi();
    }
}
