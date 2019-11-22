import java.util.*;

class baseclass
{
    int att1;
    int att2;

    baseclass(int att1, int att2)
    {
        this.att1 = att1;
        this.att2 = att2;
    }

    void display(int a)
    {
        // super(display(3);)
        System.out.println("displaying = " + a + "and = " + this.att1);
        // System.out.println("bse display");
    }

}

class subclass extends baseclass
{
    int att3;


    subclass(int att1,int att2,int att3)
    {
        super(att1,att2);
        this.att3 = att3;
    }

    void display()
    {
        super.display(2);
        System.out.println("subclass display = " + att3 + "att1 = " + att1);
    }
}

class test{
    int a;
    int b;

    test()
    {
        this(3,511);
        System.out.print("inheritence---");

    }

    test(int a,int b)
    {
        this.a = a;
        this.b = b;
    }

    // void display1()
    // {
    //     System.out.println("test ----- a = " + a + "b = " + b);
    // }
}


public class inheritence
{
    public static void main(String[] args) {
        subclass obj = new subclass(1, 2, 3);
        obj.display();

        test ob = new test();
        // ob.display1();
    }
}