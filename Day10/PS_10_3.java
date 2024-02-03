import java.util.Scanner;
class circle
{
    double radius;
    double area;
    public circle(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        area = 3.142 * radius * radius;
        return area;
    }
}
class cylinder extends circle
{
    double height;
    double volume;
    public cylinder(double radius,double height)
    {
        super(radius);
        this.height=height;
    }
    public double getVolume()
    {
        volume = 3.142 * radius * radius * height;
        return volume;
    }

}
public class PS_10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double n = sc.nextInt();
        System.out.print("Enter the height : ");
        double b = sc.nextInt();
        cylinder a = new cylinder(n,b);
        System.out.println("The area of the circle is : " + a.getArea());
        System.out.println("The volume of the cylinder is : " +a.getVolume());
    }
}
