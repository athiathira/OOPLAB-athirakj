import java.util.Scanner;
class Symmetric
{
int rows,cols;
int matrix[][]=new int[5][5];
void read(int rows,int cols)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements");
for(int i=0;i<rows;i++)
for(int j=0;j<cols;j++)
matrix[i][j]=sc.nextInt();
}
void compare(int rows,int cols)
{
boolean symmetric = false;
if (rows!=cols)
{
System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
}
else
{
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
if(matrix[i][j]==matrix[j][i])
{
	symmetric=true;
	break;
}
}
}
}
if(symmetric)
{
	System.out.println("The given matrix is symmetric");
}
else
{
	System.out.println("The given matrix is not symmetric");
	
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of rows");
int rows=sc.nextInt();
System.out.println("Enter the no. of columns");
int cols=sc.nextInt();
Symmetric s=new Symmetric();
s.read(rows,cols);
s.compare(rows,cols);	
}
}

*****************************************************************************************************************************************************

OUTPUT

Enter the no. of rows
2
Enter the no. of columns
2
Enter the elements
1 2
3 4
The given matrix is symmetric