import java.util.Scanner;

class Rama2
{
	public static void main(String [] args)
	{
	
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Simple for loop");
	   System.out.println("Enter a number: ");
	   int number=scan.nextInt();
	   System.out.println("The multiplication of "+number+" is: ");
	   for(int i=1;i<=100;i++)
	   {
		
		System.out.println(number +" + "+i+" = "+(number+i));
		
	   }
	
	}
}