import java.util.*;

class multiplethread implements Runnable
{
    public void run()
    {
        try{
            System.out.println(Thread.currentThread().getId() + "is running");            

        }catch(Exception e)
        {
            System.out.println("exception caught");
        }
    }
}


class newThread implements Runnable
{
    Thread t;
    String name;

    newThread(String Threadname)
    {
        name = Threadname;
        t = new Thread(this,name);
        System.out.println("NEW THREAD =  " + t);
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
            System.out.println("exception caught" + name);
        }
        System.out.println(name + "exiting");
    }
    
}


class runnablethread {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++)
        {
            Thread obj = new Thread(new multiplethread());
            obj.start();
        }

        System.out.println("\n");
        newThread ob1 = new newThread("one");
        newThread ob2 = new newThread("two");
        newThread ob3 = new newThread("three");

        // System.out.println()

    }
}