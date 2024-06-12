import java.util.Scanner;

class ATM2
{
	public static void main(String [] args)
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Generate 4 digit pin");
	  int pin=scan.nextInt();
	  System.out.println("-----SBI ATM-------");
	  int balance=0;
	  while(true)
	  {
		System.out.println("----------------------");
	        System.out.println("1.A/C details\n2.Deposite\n3.Withdrawn\n4.Check Balance\n5.Exit");
		System.out.println("Enter a choice");
	        int choice=scan.nextInt();
	        
		switch(choice)
		{
		   case 1:
		      System.out.println("A/C  Holder Name:Smith");
	              System.out.println("A/C No:12345678789876\nIFSC Code:SBI00Y12\nBranch Name:XYZ");
		      break;
	
	           case 2:
			System.out.println("Enter a money to deposite");
			int deposite=scan.nextInt();
		        balance=balance+deposite;
			System.out.println("Deposite sucessfully...");
			break;
		
		   case 3:
			System.out.println("Enter withdrawn money");
			int withdrawn=scan.nextInt();
			System.out.println("Enter a pin");
			int p=scan.nextInt();
			if(withdrawn<=balance)	
			{
				if(pin==p)
				{
				    System.out.println("Withdrawn successfully");
				}
				else
				{
				    System.out.println("Invalid pin..try once");
				}
			}
			else
			{
				System.out.println("Insufficient balance");
			}
			break;
			
			case 4:
		 	   System.out.println("Balance is: "+ balance);
			   break;
			
			case 5:
			    System.out.println("Thank You ");
			    System.exit(0);
			
			default :
			    System.out.println("Invalid choice");
	

		   }
		}			
	
	  
	
	}
}