import java.util.*;

class customer{
    String name,bank;
    int accno,amount;
    customer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        name = sc.next();
        System.out.println("Enter Bank:");
        bank = sc.next();
        System.out.println("Accno:");
        accno = sc.nextInt();
        System.out.println("Enter Amount:");
        amount = sc.nextInt();
    }
}

class Investment {


  static void intrest(customer c)
	{
	  switch (c.bank)
		  {
		case "federal":
		System.out.println("Intrest amount in Federal : "+(c.amount*(8.4/100)));	
		break;
		
		 case "karur":
			 
		System.out.println("Intrest amount in Karur :"+(c.amount*(7.3/100)));
		break;
		 case "boi":
			 System.out.println("Intrest amount in Boi: "+(c.amount*(9.7/100)));	
	break;
	default:System.exit(0);
                break;
	}
}
}
    
		


public class CustomerDemo {
    public static void main(String args[])
{
        customer c = new customer();
        Investment.intrest(c);
    }
}
