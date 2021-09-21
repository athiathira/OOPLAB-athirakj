import java.util.*;

class Circle extends Thread
	{
int a;
	
	public void run()
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
		a = sc.nextInt();
		System.out.println("The area of Cricle is: " + 3.14f * a * a);


	}
}

class Triangle extends Thread 
	{
int a,b;
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Base And Height: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("The area of Triangle is: " + (a * b) / 2);
	}
}
class Rectangle implements Runnable 
	{
int a,b;
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width and height ");
		a = sc.nextInt();
		b = sc.nextInt();
	
		System.out.println("The area of square is: " + a * b);

	}
}
class Square implements Runnable{
int a;
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side:");
        a = sc.nextInt();
        System.out.println("Area of square:" + a * a);
    }

}



public class MyClass {
   public static void main(String[] args)  throws Exception{
        Scanner sc = new Scanner(System.in);
         Circle t1 = new Circle();
       Triangle t2 = new Triangle();
        Rectangle r1 = new Rectangle();
        Square r2 = new Square();
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);
        int c;
        do{
            System.out.println("\n1.Area of Circle\n2.Area of Triangle\n3.Area of Rectangle\n4.Area of Square\n5.Exit\noption:");
            c = sc.nextInt();
            switch (c){
                case 1:t1.start();
                t1.join();
                break;
                case 2:t2.start();
                t2.join();
                break;
                case 3:t3.start();
                t3.join();
                break;
                case 4:t4.start();
                t4.join();
                break;
                case 5:System.exit(0);
                break;
                default:System.out.println("Invalid");
                break;
            }
        }while (c!=5);
    }
}