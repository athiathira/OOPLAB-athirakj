import java.util.*;

abstract class Shape {
	int a,b;

	Scanner input = new Scanner(System.in);

	abstract void printArea();

}
 

class Circle extends Shape
	{
	void printArea()
		{
		System.out.println("\n Find the Area of Cricle");
		System.out.print("Enter Radius: ");
		a = input.nextInt();
		System.out.println("The area of Cricle is: " + 3.14f * a * a);


	}
}

class Triangle extends Shape 
	{
	void printArea() {
		System.out.println("\nFind the Area of Triangle");
		System.out.print("Enter Base And Height: ");
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("The area of Triangle is: " + (a * b) / 2);
	}
}
class Rectangle extends Shape 
	{
	void printArea() {
		System.out.println("Find the Area of rectangle ");
		System.out.print("Enter width and height ");
		a = input.nextInt();
		b = input.nextInt();
	
		System.out.println("The area of square is: " + a * b);

	}
}

public class AbstractClass {
	public static void main(String[] args) 
		{
		Circle c = new Circle();
		c.printArea();

		Triangle t = new Triangle();
		t.printArea();
		
		Rectangle r = new Rectangle();
		r.printArea();
	}
}
