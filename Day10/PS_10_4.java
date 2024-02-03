import java.util.Scanner;
class rectangle
{
    double length;
    double breath;
    double area;
    public rectangle(double length,double breath)
    {
        this.length=length;
        this.breath=breath;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getBreath()
    {
        return breath;
    }
    public void setBreath(double breath)
    {
        this.breath = breath;
    }
    public double getArea()
    {
        area = length * breath;
        return area;
    }public void setArea(double area)
    {
        this.area=area;
    }
}
class cuboid extends rectangle
{
    double height;
    double volume;
    public cuboid (double length,double breath,double height)
    {
        super(length,breath);
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getVolume()
    {
        volume = length * breath * height;
        return volume;
    }
    public void setVolme(double volume)
    {
        this.volume = volume;
    }
}
public class PS_10_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        double a = sc.nextInt();
        System.out.print("Enter the breath : ");
        double b = sc.nextInt();
        System.out.print("Enter the height : ");
        double c = sc.nextInt();
        cuboid d = new cuboid(a,b,c);
        System.out.println("The area of the rectangle is : " + d.getArea());
        System.out.println("The volume of thr cuboid is : " + d.getVolume());
    }
}
