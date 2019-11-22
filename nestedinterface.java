// INDIRECT IMPLEMENTATION OF INTERFACE

import java.util.*;

class a 
{
    interface ai
    {
        void disp();
    }
}

// class aderived extends a
// {

// }
// or

class deriveda implements a.ai{
    public void disp()
    {
	    System.out.println("deriveda disp");
    }
}


class nestedinterface
{
    public static void main(String[] args) {
        deriveda ob = new deriveda();
        ob.disp();
        // OR
    	System.out.println("\n");
        //
        a.ai obj;
        deriveda t = new deriveda();
        obj = t;
        obj.disp();

    }
}

