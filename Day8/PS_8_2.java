import java.util.Scanner;
class cellphone
{
    public void ringing()
    {
        System.out.println("Ringing....");
    }
    public void vibrating()
    {
        System.out.println("Vibrating...");
    }
}
public class PS_8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        cellphone a = new cellphone();
        a.ringing();
        a.vibrating();

    }
}
