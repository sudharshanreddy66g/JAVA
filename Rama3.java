import java.util.Scanner;

class Rama3
{
	public static void main(String [] args)
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter a number: ");
	  int number=scan.nextInt();
	  System.out.println("The division of table : "+ number+" is: ");
	  
	  for(int i=1;i<=10;i++)
	  {
		System.out.println(number +"/"+i+" = "+ (number/i));
	  }
	
	}
}