import java.util.*;

interface a
{   
    int a = 10;
    default void display(){
        System.out.println("interface a");
    }
}

interface b
{
    int b = 20;
    default void display(){
        System.out.println("interface a");
    }
}

class interfacecode implements a,b
{
    public void display()
    {
        b.super.display();
        a.super.display();

    }
    public static void main(String[] args) {
    interfacecode obj = new interfacecode();
    obj.display();
    }
}