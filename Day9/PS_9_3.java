import java.util.Scanner;
class cylinder 
{
    double radius;
    double height;
    double volume;
    double surfacearea;

    public cylinder (double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }
    public double getVolume()
    {
        volume = 3.142 * radius * radius * height;
        return volume;
    }
    public void setVolume(double radius ,double height)
    {
        this.volume = volume;
    }
    public double getSurfacearea()
    {
        surfacearea = (2 * 3.142 * radius * radius ) + (2 * 3.142 * radius * height );
        return surfacearea;
    }
    public void setSurfacearea(double radius,double height)
    {
        this.surfacearea=surfacearea;
    }

}
public class PS_9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius of the cylinder : ");
        double n = sc.nextInt();
        System.out.print("Enter the height of the cylinder : ");
        double h = sc.nextInt();
        cylinder a = new cylinder(n,h);
        System.out.println("The Volume of the cylinder is : " + a.getVolume());
        System.out.println("The Surface Area of the cylinder : " + a.getSurfacearea());
    }
}
