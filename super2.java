import java.util.*;

class Person
{
void message()
{
System.out.println("person message");
}
}

class Student extends Person
{
void message(){
System.out.println("student message");
}

void display()
{
message();
super.message();	
}


}


class super2
{
public static void main(String args[])
{
Student s = new Student();
s.display();
}
}
