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
public class PS_13_3 {
    public static void main(String args[]){
        Mythread a = new Mythread("Sir");
        
        a.setPriority(5);
        System.out.println(a.getPriority());
        a.start();
        Thread b = new Thread(new MyRunnable());
        b.setPriority(9);
        System.out.println(b.getPriority());
        b.start();


    }

}

