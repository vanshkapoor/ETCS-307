import java.util.*;

public class exception
{
    public static void main(String[] args)
    {
        try{
            int a[] = {5,10};
            int b = 5;
            int x = a[1]/0;
        }
        catch(ArithmeticException e){
            System.out.println("exception = " + e);
        }
        finally{
            System.out.println("final executed");
        }
    }
}