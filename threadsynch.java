import java.io.Console;
import java.util.*;

class call
{
    synchronized void callme(String mssg)
    {
        System.out.println("[" + mssg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            System.out.print(e);
        }
        System.out.println("]");
    }
}


class threadob implements Runnable
{
    Thread t;
    String s;
    call c;
    threadob(call ob,String name)
    {
        s = name;
        this.c = ob;
        t = new Thread(this);
        t.start();
    }

    public void run()
    {
        c.callme(s);
    }

    
}


public class threadsynch
{
    public static void main(String[] args) {
    call ab = new call();
    threadob ob1 = new threadob(ab, "vansh");
    threadob ob2 = new threadob(ab, "kapoor");
    threadob ob3 = new threadob(ab, "again");

    try{
        ob1.t.join();
        ob2.t.join();
        ob3.t.join();
    }catch(InterruptedException e)
    {
        System.out.println("caught exception");
    }
    System.out.println("Ending main thread");
    }
}