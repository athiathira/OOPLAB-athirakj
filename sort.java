import java.util.*;
class get
{
    Scanner sc=new Scanner(System.in);
    private static int c;
    private String str[];

    get() {
       System.out.print("Enter number of strings you would like to enter:");
        c = sc.nextInt();
       str = new String[c];
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < c; i++)
        {
        
		str[i] = sc.next();
    }
	}
    void sorts()
    {
        for (int i = 0; i < c-1; i++) 
        {
            for (int j = i + 1; j < c; j++)
				{ 
                if (str[i].compareTo(str[j])>0) 
                {
                   String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
         System.out.print("Strings in Sorted Order:");
		  for (int i = 0; i <= c - 1; i++) 
        {
            System.out.print(str[i] + ", ");
	}
    }
}
public class sort {
    public static void main(String [] args )
    {
        get g=new get();
        g.sorts();
    }
}
	