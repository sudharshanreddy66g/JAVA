// Number Programs

import java.util.Scanner;

class EvenNumber
{
	public static void main(String [] args)
	{
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter a Number..");
	  int num = scan.nextInt();
	
	  if(num%2==0)
	  {
	     System.out.println("Given Number is Even...");
	  }
	  else
	  {
	     System.out.println("Given Number is Odd...");
	  }
	
	}
}