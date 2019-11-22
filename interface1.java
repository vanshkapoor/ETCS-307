import java.util.*;

interface test
{
    final int a = 10;
    // static void display(){
    //     System.out.println("display ----");
    // }
    void display();
}

class interface1 implements test{
    public void display()
    {
        System.out.println("display");
    }
    public static void main(String[] args) {
        interface1 ob = new interface1();
        // test.display();    
        ob.display();
    }
}