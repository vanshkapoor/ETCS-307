import java.util.*;

class Box
{
int h;
int w;
int d;

void vol()
{
  System.out.println(h + "--" + w + "--" + d);
}

int volume()
{
  return h*d*w;
}

int area(int l,int b)
{
  return l*b;
}

}



//class -2
class circle
{
int r;
double pi;

circle()
{
  System.out.println("constructing");
  r = 5;
  pi = 3.14;
}

void area()
{
  System.out.println(pi * r * r);
}
}



//class -3
class square
{
int b;
int l;

square(int len,int bred)
{
 l = len;
 b = bred;
}

void area()
{
  System.out.println("square" + (l*b));
}
}



class class1
{
 public static void main(String args[])
 {
   Box b = new Box();
   b.h = 10;
   b.w = 20;
   b.d = 30;
   int vol;
   vol = b.h * b.w * b.d;
   System.out.println(vol); 

   Box b1 = new Box();
   b1.h = 11;
   b1.w = 22;
   b1.d = 33;
   int vol1;
   vol1 = b1.h * b1.w * b1.d;
   System.out.println(vol1); 
 
   Box b3 = b1;
   System.out.println(b3.h);  
   b1.h = b1.h + 2;
   System.out.println("b3 h = " + b3.h);  
   System.out.println("b1 h = " + b1.h);  


//----calling methods now
   b1.vol();
   b.vol();
//----calling method now returning
   int m;
   m = b.volume();
   System.out.println(m);  
//---calling method now with params
   m = b.area(2,4);
   System.out.println(m);  

//new class
   circle c = new circle();
   c.area();
  
//new class
   square s = new square(5,5);
   s.area();

 }

}






