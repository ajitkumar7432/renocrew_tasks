import java.util.Scanner;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Invalid operator input encountered..";
    }
}

class DivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "Toofan can't divide by zero...";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Any of the operands can't be greater than 100000";
    }
}

class MaxMultiplierReachedException extends Exception {
    @Override
    public String toString() {
        return "Can't multiply with a number greater than 7000";
    }
}

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double calculate(String expression) throws InvalidInputException, DivideByZeroException, MaxInputException, MaxMultiplierReachedException {
        double operandOne;
        double operandTwo;
        char operator = ' ';
        double Result;
        int i = 0;
        String operandOneStr = "";
        String operandTwoStr = "";
        while (expression.charAt(i) != ' ') {
            operandOneStr += expression.charAt(i);
            i++;
        }
        i++;
        operandOne = Double.parseDouble(operandOneStr);
        while (expression.charAt(i) != ' ') {
            operator = expression.charAt(i);
            i++;
        }
        for (; i < expression.length(); i++) {
            operandTwoStr += expression.charAt(i);
        }
        operandTwo = Double.parseDouble(operandTwoStr);
        if (operandTwo == 0 && operator == '/') {
            throw new DivideByZeroException();
        }
        if (operandOne > 100000 || operandTwo > 100000) {
            throw new MaxInputException();
        }
        if (operandTwo > 7000 && operator == '*') {
            throw new MaxMultiplierReachedException();
        }
        switch (operator) {
            case '+':
                Result = this.add(operandOne, operandTwo);
                break;
            case '-':
                Result = this.subtract(operandOne, operandTwo);
                break;
            case '*':
                Result = this.multiply(operandOne, operandTwo);
                break;
            case '/':
                Result = this.divide(operandOne, operandTwo);
                break;
            default:
                throw new InvalidInputException();
        }
        return Result;
    }
}

public class Task_6 {
    public static void main(String args[]) {
        Calculator machine = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression [only work for two operands] >> ");
        String expression = sc.nextLine();
        try {
            double answer = machine.calculate(expression);
            System.out.println(answer);
        } catch (InvalidInputException e1) {
            System.out.println(e1);
        } catch (DivideByZeroException e2) {
            System.out.println(e2);
        } catch (MaxInputException e3) {
            System.out.println(e3);
        } catch (MaxMultiplierReachedException e4) {
            System.out.println(e4);
        } finally {
            System.out.println("Program Finished!!!");
        }
    }
}
