import java.util.*;


class threadcheck implements Runnable
{   
    Thread t;
    threadcheck()
    {
        t = new Thread(this,"vansh thread");
        t.start();
    }

    public void run()
    {
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println(" ->" + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("exception caught");
        }
        System.out.println("exiting");
    }

    public static void main(String[] args) {
     threadcheck th = new threadcheck();   
    }
}