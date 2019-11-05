import java.util.*;


class A
{
	A()
	{
		System.out.println("A constructor");
	}
}

class B extends A
{
	B()
	{
		System.out.println("B constructor");
	}
}


class C extends B
{
	C()
	{
		System.out.println("C constructor");
	}
}


class constructor1
{
	public static void main(String args[])
	{
		C ob = new C();		
	}

}
