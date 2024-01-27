import java.util.Scanner;
class cylinder
{
    double radius ;
    double height;
    double volume;
    double surfacearea;
    // Without Constructor....
    public double getVolume()
    {
        volume = (3.142 * radius * radius * height);
        return volume;
    }
    public void setVolume()
    {
        this.volume=volume;
    }
    public double getSurfacearea()
    {
        surfacearea = (2* 3.14 * radius * radius) + (2*3.142*radius*height) ;
        return surfacearea;
    }
    public void setSurfacearea()
    {
        this.surfacearea=surfacearea;
    }
}
class PS_9_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius of cylinder : ");
        double n = sc.nextDouble();
        System.out.print("Enter the height of cylinder : ");
        double b = sc.nextDouble();
        cylinder a = new cylinder();
        a.radius=n;
        a.height=b;
        System.out.println("The volume of cylinder is : " + a.getVolume());
        System.out.println("The surface area of cylinder is : " + a.getSurfacearea());
    }
}