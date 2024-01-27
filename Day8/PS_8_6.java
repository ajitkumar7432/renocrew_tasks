import java.util.Scanner;
class circle 
{
    private double radius;
    private double circumference;
    private double area;
    public circle (double radius)
    {
       this.radius=radius; 
    }
    public double circumference()
    {
        circumference = (2 * 3.142 * radius);
        return circumference;
    }
    public double area()
    {
        area = (3.142 * radius * radius);
        return area;
    }
    
}
public class PS_8_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius of the Circle : ");
        double n = sc.nextDouble();
        circle a = new circle(n);
        System.out.println("The circumference of the circle is : " + a.circumference());
        System.out.println("The area of the circle is : " + a.area());
    }
}
