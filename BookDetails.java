import java.util.*;
abstract class Publisher
{
static int pid;
static String name;

void Publisher()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Publisher id");
pid=sc.nextInt();
System.out.println("Enter the Publisher name");
name=sc.next();
}
}

class Book extends Publisher
{
String bname;
int bid;

void Book()
{
super.Publisher();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Book id");
bid=sc.nextInt();
System.out.println("Enter the Book name");
bname=sc.next();
}
}

class Liter extends Book
{
String chapname;
int chapno;

void Liter()
{
super.Book();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Chapter number");
chapno=sc.nextInt();
System.out.println("Enter the Chapter name");
chapname=sc.next();

}
}

class Fiction extends Liter
{
String topic;
Fiction()
{
super.Liter();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Topic");
topic=sc.next();
}
void display()
{

System.out.println("\nBook details are\n");
	System.out.print("\t");
	System.out.print("publisherid = " + pid);
	System.out.print("\t");
	System.out.print("name = " + name);
	System.out.print("\t");
	System.out.print("bookid = " + bid);
	System.out.print("\t");
	System.out.print("bookname = " + bname);
	System.out.print("\t");
	System.out.print("chapterno = " + chapno);
	System.out.print("\t");
	System.out.print("chaptername = " + chapname);
	System.out.print("\t");
	System.out.print("topic = " + topic);
	System.out.print("\t");
}
}

public class BookDetails
{

public static void main(String args[])
{
int choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of details to be entered");
		int n=sc.nextInt();
		Fiction fn[]=new Fiction[n];
	  
	   	do
	{
		System.out.println("\nBook Details \n\t");
		System.out.print("\nMenu\n1.Insert\n2.Display\n3.Exit\n");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				for(int i=0;i<n;i++)
				{
				fn[i]=new Fiction();		
				}
		break;
		case 2:for(int i=0;i<n;i++)
				{
				fn[i].display();
				}		
		break;
		case 3:System.exit(0);
		break;
		default:System.out.println("Invalid Choice");
		}
	}
	while(choice!=4);
	}
}

/*
**************************************************************************************************************************************************************************************


OUTPUT

Enter the Chapter name
POINTER
Enter the Topic
Baisc pointer operations

Book Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:2

Book details are

        publisherid = 102       name = AMEER    bookid = 7      bookname = PYTHON       chapterno = 9   chaptername = CONSTRUCTOR       topic = Constructor
Book details are

        publisherid = 102       name = AMEER    bookid = 5      bookname = C    chapterno = 10  chaptername = POINTER   topic = Baisc
Book Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:4
Invalid Choice 
*\