import java.util.Scanner;
interface Tvremote
{
    void volume();
    void switchon();
    void switchoff();
}
interface Smarttvremote extends  Tvremote{
    void youtube();
    void netflix();
}

class Tv implements Tvremote
{
    public void volume()
    {
        System.out.println("Volume up and down");
    }
    public void switchon()
    {
        System.out.println("TV switched ON");
    }
    public void switchoff()
    {
        System.out.println("TV switched OFF");
    }
}
class Smarttv  implements Smarttvremote{
    public void youtube()
    {
        System.out.println("Opening Youtube");
    }
    public void netflix()
    {
        System.out.println("Opening Netflix");
    }
    public void volume()
    {
        System.out.println("SmartTV Volume up and down");
    }
    public void switchon()
    {
        System.out.println("SmartTV Switched ON");
    }
    public void switchoff()
    {
        System.out.println("SmartTV switched OFF");
    }

}

public class PS_11_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Properties of TV are :");
        Tv a = new Tv();
        a.volume();
        a.switchoff();
        a.switchon();
        System.out.println("The Properties of SmartTV are : ");
        Smarttv b = new Smarttv();
        b.youtube();
        b.netflix();
        b.volume();
        b.switchon();
        b.switchoff();
    }
}
