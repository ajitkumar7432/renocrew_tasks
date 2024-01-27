import java.util.Scanner;
class rectangle
{
    float length;
    float breath;
    float perimeter;
    float area;
    public rectangle(float length,float breath)
    {
        this.length = length;
        this.breath = breath;
    }
    public float perimeter()
    {
        perimeter = (2 * (length+breath));
        return perimeter;
    }
    public float area()
    {
        area = length * breath;
        return area;
    }

}

public class PS_8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of rectangle : ");
        float a = sc.nextFloat();
        System.out.println("Enter the Breath of rectangle : ");
        float b = sc.nextFloat();
        rectangle hi = new rectangle(a,b);
        System.out.println("The perimeter of rectangle is : " + hi.perimeter());
        System.out.println("The area of rectangle is : " + hi.area());

    }
}
