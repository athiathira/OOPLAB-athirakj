import java.util.*; 
class Complex 
{ 
int a,b; 
void read() 
{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the num1"); 
a=sc.nextInt(); 
System.out.println("Enter the num2"); 
b=sc.nextInt(); 
} 
void add(Complex x) 
{ 
int r,i; 
r=a+x.a; 
i=b+x.b; 
System.out.println("Sum is:"+r+"+"+i+"i"); 
} 
public static void main(String args[]) 
{ 
Complex c1=new Complex(); 
Complex c2=new Complex(); 
c1.read(); 
c2.read(); 
System.out.println("Numbers are:"+c1.a+"+"+c1.b+"i"+" and "+c2.a+"+"+c2.b+"i"); 
c1.add(c2);
 }
 }


**************************************************************************************************************************************************************************

/*OUTPUT

Enter the num1
2
Enter the num2
3
Enter the num1
4
Enter the num2
7
Numbers are:2+3i and 4+7i
Sum is:6+10i */
