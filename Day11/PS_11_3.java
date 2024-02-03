import java.util.Scanner;
interface basicanimals
{
    void eat();
    void sleep();
}
class Monkey
{
    void jump()
    {
        System.out.println("Jumping");
    }
    void bite()
    {
        System.out.println("Biting");
    }
}
class Humans extends Monkey implements basicanimals{
    public void eat()
    {
        System.out.println("Eating");
    }
    public void sleep()
    {
        System.out.println("Sleeping");
    }
}

public class PS_11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Humans a = new Humans();
        a.eat();
        a.sleep();
        a.jump();
        a.bite();


    }
}
