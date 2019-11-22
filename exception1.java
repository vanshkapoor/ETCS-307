import java.util.*;

//exception class
class myException extends Exception{
    private int ag;
    myException(int a)
    {
        ag = a;
    }

    public String toString(){
        return("Myexception" + ag);
    }
}

//main class
public class exception1{

    static void compute(int a) throws myException{
        System.out.println("called compute -" + a);
        if(a > 10)
        {
            throw new myException(a);
        }
        System.out.println("normal execution");
    }

    public static void main(String[] args)
    {
        try{
            compute(1);
            compute(100);
        }
        catch(myException e)
        {
            System.out.println(e);
        }
    }
}