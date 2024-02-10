class Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }
    public void run()
    {
    while(true){
        System.out.println(getName() +" Good Morning");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
}
class MyRunnable implements Runnable{
   
    
    public void run()
    {
        while(true)
        {
            System.out.println("Welcome");
            try{
                Thread.sleep(1500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class PS_13_1 {
    public static void main(String args[]){
        Mythread a = new Mythread("Sir");
        a.start();
        Thread b = new Thread(new MyRunnable());
        b.start();


    }

}
