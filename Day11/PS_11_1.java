import java.util.*;
abstract class Pen
{
    abstract void write();
    abstract void refill();
}
class Uses extends Pen{
    void write(){
    System.out.println("Writing");
    }
    void refill()
    {
        System.out.println("Refilling");
    }

}

public class PS_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Uses a = new Uses();
        a.write();
        a.refill();
    }
}
