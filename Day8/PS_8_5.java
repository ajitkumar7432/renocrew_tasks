import java.util.Scanner;
class TommyVecetti
{
    public void hitting()
    {
        System.out.println("Hitting...");
    }
    public void running()
    {
        System.out.println("Running...");
    }
    public void firing()
    {
        System.out.println("Firing...");
    }
}
public class PS_8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        TommyVecetti a = new TommyVecetti();
        a.hitting();
        a.running();
        a.firing();

    }
}
