import java.util.Scanner;

class Gang
{
	public static void main(String [] args)
	{

	   int age;

	   Scanner scan=new Scanner(System.in);	
           System.out.println("Enter a age: ");
	   age=scan.nextInt();
       	   
	
	  if(age>17)
	  {
	     System.out.println("You are eligible for vote");
	  }
	  else
	  {
             System.out.println("Ypu are not eligible for vote");
	  }
	  
	
	
	}
}