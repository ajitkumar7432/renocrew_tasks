import java.util.Scanner;
class rectangle 
{
    private double length;
    private double breath;
    public rectangle(double length,double breath)
    {
        this.length=length;
        this.breath=breath;
    }
    public double getLength()
    {
        return length;
    }
    public void setVolume(double length)
    {
        this.length=length;
    }
    public double getBreath()
    {
        return breath;
    }
    public void setBreath(double breath)
    {
        this.breath=breath;
    }
}
public class PS_9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length of rectanle : ");
        double n = sc.nextInt();
        System.out.print("Enter the breath of rectagle : ");
        double b = sc.nextInt();
        rectangle a = new rectangle(n,b);
        System.out.println("The length of the rectangle is : " + a.getLength());
        System.out.println("The breath of the rectangle is : " + a.getBreath());
    }
}
