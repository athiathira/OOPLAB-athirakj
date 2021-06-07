import java.util.Scanner;
class Matrix
{
int a[][]=new int[5][5];
int row,col;
Matrix(int row,int col)
{
this.row=row;
this.col=col;
}
void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements");
for(int i=0;i<row;i++)
for(int j=0;j<col;j++)
a[i][j]=sc.nextInt();
}

Matrix addition(Matrix b)
{
Matrix M3=new Matrix(row,b.col);
for(int i=0;i<row;i++)
for(int j=0;j<b.col;j++)
{
M3.a[i][j]=0;
for(int k=0;k<col;k++)
	M3.a[i][j]=a[i][j]+b.a[i][j];
}
return M3;
}
void display()
{
	System.out.println("Sum of two matrix is");
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	
		System.out.print(a[i][j]+" ");
		System.out.println();		
}
System.out.println();
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of rows of first matrix");
int row=sc.nextInt();
System.out.println("Enter no. of columns of first matrix");
int col=sc.nextInt();
Matrix M1=new Matrix(row,col);
M1.read();
System.out.println("Enter no. of rows of second matrix");
row=sc.nextInt();
System.out.println("Enter no. of columns of second matrix");
col=sc.nextInt();
Matrix M2=new Matrix(row,col);
M2.read();
Matrix M3=M1.addition(M2);
M3.display();
	
}
}



******************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
OUTPUT

Enter no. of rows of first matrix
3
Enter no. of columns of first matrix
3
Enter the elements
2 4 5
6 7 8
1 7 4
Enter no. of rows of second matrix
3
Enter no. of columns of second matrix
3
Enter the elements
7 8 5
2 4 1
9 2 7
Sum of two matrix is
9 12 10
8 11 9
10 9 11




