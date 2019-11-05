import java.util.*;


class ABC
{
    synchronized void display(int n)
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(n * i);
            try{
            Thread.sleep(400);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}


class Mythread extends Thread
{
    ABC t;
    Mythread(ABC t)
    {
        this.t = t;
    }
    public void run()
    {
        t.display(5);
    }
}

class Mythread2 extends Thread
{
    ABC t;
    Mythread2(ABC t)
    {
        this.t = t;
    }
    public void run()
    {
        t.display(100);
    }
}



public class threadcode
{
    public static void main(String args[])
    {
        ABC obj = new ABC();
        Mythread t1 = new Mythread(obj);
        Mythread2 t2 = new Mythread2(obj);

        t1.start();
        t2.start();
    }
}