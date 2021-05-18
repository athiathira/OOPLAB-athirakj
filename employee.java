import java.util.Scanner;

class employee {
	int eno,esalary;
	String ename;

	public static void main(String[] args) {
		 int n,x,i;
		Scanner sc=new Scanner(System.in);
		employee[] emp=new employee[100];
		System.out.println("Enter the no of employees");
		 n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Employee No:");
			emp[i]=new employee();
			emp[i].eno=sc.nextInt();
			System.out.println("Enter Employee Salary:");
			emp[i].esalary=sc.nextInt();
			System.out.println("Enter Employee Name:");
		    emp[i].ename=sc.next();
		}
		System.out.println("Enter the employee No  :");
		 x=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(emp[i].eno==x)
			{
			System.out.println("Employee found at postion"  + (i + 1));	 
                break;
			
			 
            
            }
        }
        if(i==n)
				
        
        {
            System.out.println("employee not found");
        }
    }
	}

*************************************************************************************************************************************************************************************************************************************

/*OUTPUT

Enter the no of employees
4
Enter Employee No:
1
Enter Employee Salary:
30000
Enter Employee Name:
Bablu
Enter Employee No:
2
Enter Employee Salary:
35000
Enter Employee Name:
arsha
Enter Employee No:
3
Enter Employee Salary:
40000
Enter Employee Name:
vishnu
Enter Employee No:
4
Enter Employee Salary:
45000
Enter Employee Name:
kichu
Enter the employee id you want to find :
3
Employee found at postion3 */
