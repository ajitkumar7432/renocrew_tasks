class MyThread extends Thread{
    public void run()
    {
        int i =0;
       while(i<10)
       {
        System.out.println("Good Morning"+ i);
        i++;
       }
       
       
    }


}
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
public class PS_13_2 {
    public static void main(String args[])
    {
       MyThread a = new MyThread();
       a.start();
       Thread b = new Thread(new MyRunnable());
       b.start(); 

    }
}
