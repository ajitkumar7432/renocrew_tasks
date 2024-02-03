import java.util.Scanner;
import java.util.*;
abstract class Pen
{
    abstract void write();
    abstract void refill();
}
class Fondation extends Pen{
    void write(){
    System.out.println("Writing");
    }
    void refill()
    {
        System.out.println("Refilling");
    }
    void changenib()
    {
        System.out.println("Changing the nib");
    }

}



public class PS_11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fondation a = new Fondation();
        a.write();
        a.refill();
        a.changenib();

    }
}
