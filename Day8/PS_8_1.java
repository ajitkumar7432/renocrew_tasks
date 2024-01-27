import java.util.Scanner;
class Employee 
{
    double salary;
    String name;
    public Employee(String name , double Salary)
    {
        this.name = name;
        this.salary = Salary;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
}


public class PS_8_1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter the name : ");
        String nameInput = sc.nextLine();
        System.out.println("Enter the Salary : ");
        double salaryInput = sc.nextDouble();
        Employee employee = new Employee(nameInput,salaryInput);
        System.out.println("Name : " + employee.getName());
        System.out.printf("Salary : %.0f" , employee.getSalary());

    }
}