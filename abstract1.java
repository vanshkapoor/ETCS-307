import java.util.*;


abstract class base{
    base(){
        System.out.println("base");
    }
    abstract void dips();
}


class derived extends base{

    derived()
    {
        System.out.println("display derived constr");
    }
    void dips(){
        System.out.println("derived");
    }
}


class abstract1 
{
    public static void main(String args[]) {
        derived d = new derived();
        d.dips();

        // or
        System.out.println("\n");
        System.out.println("------OR-------");
        System.out.println("\n");
        //or 
        base b = new derived();
        b.dips();
    }
}