import java.util.Scanner;
abstract class Telephone
{
    abstract void ring();
    abstract  void lift();
    abstract void disconnect();
}
class Smartphone extends Telephone
{
    void ring(){
    System.out.println("Ringing");
    }
    void lift()
    {
        System.out.println("Lifting");
    }
    void disconnect()
    {
        System.out.println("Disconnecting");
    }
    void camera()
    {
        System.out.println("It has Camera also");
    }
}
public class PS_11_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Telephone a = new Smartphone();
        a.ring();
        a.lift();
        a.disconnect();
        
        
    }
}
