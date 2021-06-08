import java.util.*;
class Employee
{
int empid;
String name;
String address;
float salary;

void Employee()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee id");
	empid=sc.nextInt();
	System.out.println("Enter the Employee name");
	name=sc.next();
	System.out.println("Enter the Employee address");
	address=sc.next();
	System.out.println("Enter the Employee salary");
	salary=sc.nextFloat();
}

}

class Teacher extends Employee
{
String dept,sub;

Teacher()
{
	super.Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the department");
	dept=sc.next();
	System.out.println("Enter the subject");
	sub=sc.next();
}
void display()
{
	System.out.println("\nEmployee details are\n");

	System.out.print("Employeeid = " + empid );
	System.out.print("\t");

	System.out.print("name = " + name );
	System.out.print("\t");

	System.out.print("address = " + address );
	System.out.print("\t");
	
	System.out.print(" salaryy = " + salary );
	System.out.print("\t");
	
	System.out.print("department = " + dept );
	System.out.print("\t");
	
	System.out.print("subject = " + sub );
	
}
}
class Main
{
	public static void main(String args[])
	{
		int choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of details to be entered");
		int n=sc.nextInt();
		Teacher t[]=new Teacher[n];
	  
	   	do
	{
		System.out.println("\nEmployee Details\n");
		System.out.print("\nMenu\n1.Insert\n2.Display\n3.Exit\n");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				for(int i=0;i<n;i++)
				{
				t[i]=new Teacher();		
				}
		break;
		case 2:for(int i=0;i<n;i++)
				{
				t[i].display();
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
****************************************************************************************************************************************

OUTPUT
Enter the number of details to be entered
2

Employee Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:1
Enter the Employee id
101
Enter the Employee name
Shivani
Enter the Employee address
kasargodu
Enter the Employee salary
40000
Enter the department
MCA
Enter the subject
maths
Enter the Employee id
102
Enter the Employee name
Anandhu
Enter the Employee address
Adimali
Enter the Employee salary
60000
Enter the department
MSC
Enter the subject
Maths

Employee Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:2

Employee details are

Employeeid = 101        name = Shivani  address = kasargodu      salaryy = 40000.0      department = MAC        subject = maths
Employee details are

Employeeid = 102        name = Anandhu  address = Adimali        salaryy = 60000.0      department = MSC        subject = Maths
Employee Details


Menu
1.Insert
2.Display
3.Exit
Enter your choice:3
*/