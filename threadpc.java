import java.util.*;

// main performance function
class food
{   int i;
    boolean valueset = false;
    
    synchronized void get()
    {
        if(!valueset){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("exception");
            }
        }

        valueset = false;
        System.out.println("get:"+i);
        notify();

    }
    synchronized void put(int i)
    {
        if(valueset)
        {
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("exception");
            }
        }

        this.i = i;
        valueset = true;
        System.out.println("put:"+i);
        notify();

    }
}



class cook implements Runnable
{
    food ob;
    cook(food f)
    {
        this.ob = f;
        new Thread(this,"cook").start();
    }

    public void run()
    {
        int i=0;

        while(true)
        {
            ob.put(i++);
        }
    }

}
class customer implements Runnable
{
    food ob;
    customer(food f)
    {
        this.ob = f;
        new Thread(this,"customer").start();
    }
    public void run(){

        while(true)
        {
            ob.get();
        }

    }
}



class threadpc{
    public static void main(String[] args) {
        food f = new food();
        new cook(f);
        new customer(f);
        
        System.out.println("main press ^c to exit");

    }
}