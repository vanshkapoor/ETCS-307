import  java.util.*;

class test
{
int ob = 10;
}


class testin extends test
{
int ob = 20;
void display()
{
  System.out.println("testin = " + ob);

  System.out.println("test = " + super.ob);
}
}



class super1
{
public static void main(String args[])
{
testin ob = new testin();
ob.display();
}
}

