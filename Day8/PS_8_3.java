import java.util.Scanner;
class square
{
    int side;
    int perimeter;
    int area;
    public square(int side)
    {
        this.side = side;

    }
    public int area()
    {
        area = side * side;
        return area;
    }
    public int perimeter()
    {
        perimeter = 4 * side;
        return perimeter;
    }
}
public class PS_8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sides of the Square : ");
        int n = sc.nextInt();
        square a = new square(n);
        System.out.println("The area of the Square is : " + a.area());
        System.out.println("The perimeter of Square is : " + a.perimeter());
    }
}
