import java.util.Scanner;
interface Tvremote
{
    void volume();
    void switchon();
    void switchoff();
}
class Tv implements Tvremote
{
    
    public void volume(){
        System.out.println("Volume up and down");
    }
    public void switchon(){
        System.out.println("TV switched ON");
    }
    public void switchoff()
    {
        System.out.println("TV switched OFF");
    }
}
public class PS_11_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("The Properties of TV are :");
        Tv a = new Tv();
        a.volume();
        a.switchoff();
        a.switchon();
    }
}
