import java.util.*;

class Threadimp extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("i = " + i + "first");
        }
    }
}

class Threadimp1 extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("i = " + i + "second");
        }
    }
}


class threadclass
{
    public static void main(String[] args) {
        Threadimp obj = new Threadimp();
        obj.start();
        Threadimp1 obj1 = new Threadimp1();
        obj1.start();
    }
}