import java.util.*;
interface Student
{

int regno=100;
String name= "Athira",course="MCA";

}

class Sports
{
String item;
float mark;

void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Item");
item=sc.next();
System.out.println("Enter the Mark");
mark=sc.nextFloat();
	
}
}

class Result extends Sports implements Student
{
	void display()
	{
	System.out.println("\nStudent details are\n");
	System.out.print("registerno = " + regno);
	System.out.print("\t");
	System.out.print("name = " + name);
	System.out.print("\t");
	System.out.print("course = " + course);
	System.out.print("\t");
	System.out.print("item = " + item);
	System.out.print("\t");
	System.out.print("mark = " + mark);
	}
	
}

public class StudentDetails
{
	
	public static void main(String args[])
	
	{
		Result res=new Result();
		res.read();
		res.display();
		
	}
}