import java.util.Scanner;
class sphere
{
    private double radius;
    private double volume;
    private double surfacearea;
    public sphere(double radius)
    {
        this.radius=radius;
     
    }
    public double getVolume()
    {
        volume = 4 * 3.142 * radius * radius;
        return volume;
    }
    public void setVolume(double radius)
    {
        this.volume=volume;
    } 
    public double getSurfacearea()
    {
        surfacearea=(4 * 3.142 * radius * radius * radius) / (3);
        return surfacearea;
    }
    public void setSurfacearea(double radius )
    {
        this.surfacearea=surfacearea;
    }
}
public class PS_9_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radius of sphere : ");
        double n = sc.nextInt();
        sphere a = new sphere(n);
        System.out.println("The Volume of the Sphere : " + a.getVolume());
        System.out.println("The Surface Area of the sphere : " + a.getSurfacearea());

    }
}
