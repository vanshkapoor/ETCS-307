import java.util.*;


class Outer
{
int ox = 10;

Outer()
{
	System.out.println("Outer constr");
}

void test()
{
	Inner in = new Inner();
	in.display();
}

class Inner
{
	Inner(){
		System.out.println("Inner constr");
	}

	void display()
	{
		System.out.println("inner with ox =" + ox);
	}
}

}




class nested
{
public static void main(String args[])
{
Outer ob = new Outer();
ob.test();
}

}
