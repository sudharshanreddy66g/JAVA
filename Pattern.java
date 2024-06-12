import java.util.Scanner;

class Pattern
{
	public static void main(String [] args)
	{
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter a number....");
	     int num = scan.nextInt();
	     for(int row=1;row<=num;row++)
	     {
	         for(int col=1;col<=num;col++)
		 {
	            if(row==1)
	            {
		      System.out.print("*" + " ");
		    }
	            else
	            {
		       System.out.print("_" + " ");
		    }		
		     System.out.println();
	          }
	    }
		
	}
}