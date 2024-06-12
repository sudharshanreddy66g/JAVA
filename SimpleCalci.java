import java.util.Scanner;

class SimpleCalci
{
	public static void main(String [] args)
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.println("------SimpleCalci-----");
	    System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
	    System.out.println("----------------");
 
	    System.out.println("Enter a choice");
	    int choice=scan.nextInt();
	    int a=0,b=0;
	    
	    switch(choice)
	    {
	       case 1: 
	       System.out.println("Enter 2 values");
	       a=scan.nextInt();
	       b=scan.nextInt();
	       System.out.println("Addition: " + (a+b));
	       break;

	       case 2:
		System.out.println("Enter 2 values");
	        a=scan.nextInt();
	        b=scan.nextInt();
	        System.out.println("Substraction: " + (a-b));
	        break;
	
	       case 3:
	         System.out.println("Enter 2 values");
	  	 a=scan.nextInt();
		 b=scan.nextInt();
		 System.out.println("Multiplication: " + (a*b));
		 break;
		
	        case 4:
		  System.out.println("Enter 2 values");
	          a=scan.nextInt();
		  b=scan.nextInt();
		  System.out.println("Division: " + (a/b));
		  break;
	
		 default :
	           System.out.println("Invalid choice");
	     }

	       
	
	
	}
}