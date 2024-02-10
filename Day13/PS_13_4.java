import java.util.Scanner;
    class MyRunnable implements Runnable{
        public void run()
        {
            int i=0;
            while(i<20){
                System.out.println("Welcome");
            try{
                Thread.sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            i++;
           
        }
    }
    }
public class PS_13_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread a = new Thread(new MyRunnable());    
        a.start();
        Thread.State state = a.getState();
        System.out.println("Initial state of the thread: " + state);
        System.out.println(Thread.currentThread().getState());
    }
}