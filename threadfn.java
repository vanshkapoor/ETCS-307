import java.util.*;



class check implements Runnable
{
    Thread t;
    int click = 0;
    private boolean runnable = true;
    check(int p)
    {
        t = new Thread(this);
        t.setPriority(p);
    }

    void click()
    {
        click++;
    }

    public void run()
    {
        while(runnable)
        {
            click();
        }
    }

    void start()
    {
        t.start();
    }
}



public class threadfn
{
    public static void main(String[] args) {
        
    }
}