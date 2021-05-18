import java.util.*;
class Product
{
    
    int pcode;
    String pname;
    float price;
void read()
    {
      Scanner sc= new Scanner(System.in); 
System.out.println("Enter the product number"); 
pcode=sc.nextInt(); 
System.out.println("Enter the product name"); 
pname=sc.next(); 
System.out.println("Enter the product price"); 
price=sc.nextFloat(); 
    }
public static void main (String args[]) 
    
    {
      Product p1=new Product(); 
	Product p2=new Product(); 
	Product p3=new Product(); 
	p1.read(); 
	p2.read(); 
	p3.read(); 
         System.out.println("Product code : " +p1.pcode);
        System.out.println("product name      : " + p1.pname);
        System.out.println("price  : " + p1.price);

 	System.out.println("Product code : " +p2.pcode);
        System.out.println("product name      : " + p2.pname);
        System.out.println("price  : " + p2.price);

 	System.out.println("Product code : " +p3.pcode);
        System.out.println("product name      : " + p3.pname);
        System.out.println("price  : " + p3.price+"\n");

	if(p1.price<p2.price && p1.price<p3.price) 
{ 
System.out.print("Lowest price product is:"+p1.pname); 
} else if(p2.price<p3.price) 
{ 
System.out.print("Lowest price product is:"+p2.pname);
}
else
{
System.out.print("Lowest price product is:"+p3.pname);
}
}
}

********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************

/*OUTPUT

Enter the product number
1
Enter the product name
watch
Enter the product price
1200
Enter the product number
2
Enter the product name
bag
Enter the product price
600
Enter the product number
3
Enter the product name
headset
Enter the product price
1500
Product code : 1
product name      : watch
price  : 1200.0
Product code : 2
product name      : bag
price  : 600.0
Product code : 3
product name      : headset
price  : 1500.0

Lowest price product is:bag */   















































































































































        