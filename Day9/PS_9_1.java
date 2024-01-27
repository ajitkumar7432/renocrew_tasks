import java.util.Scanner;
class cylinder
{
    private int radius ;
    private int height ;

public cylinder(int radius, int height)
{
    this.radius = radius ;
    this.height=height;
}
public int getRadius()
{
    return radius;
}
public void setRadius(int radius)
{
    this.radius=radius;
}
public int getHeight()
{
    return height;
}
public void setHeight(int height)
{
    this.height=height;
}
}

public class PS_9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radius of cylinder : ");
        int rad = sc.nextInt();
        System.out.println("Enter the height of cylinder : ");
        int ht = sc.nextInt();
        cylinder a = new cylinder(rad,ht);
        System.out.println("The radius of cylinder is : " + a.getRadius());
        System.out.println("The height of cylinder is : " + a.getHeight());
    }
}
