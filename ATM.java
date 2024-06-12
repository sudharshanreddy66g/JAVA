import java.util.Scanner;

class ATM
{
	public static void main(String [] args)
	{
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Generate 4 digit pin");
	   int pin=scan.nextInt();
	   System.out.println("----SBI ATM-----");
	   
	   int balance=0;
	   while(true)
	   {
	        System.out.println("-------------------------");
		System.out.println("1.A/C deatils\n2.Deposite\n3.Withdrawn\n4.CheckBalance\n5.Exit");
	   	System.out.println("Enter choice");
		int choice=scan.nextInt();
		
		switch(choice)
		{
		   case 1:
			System.out.println("A/C Holder Name: Smith");
			System.out.println("A/C No:12345678789876\nIFSC Code:SBI00Y12\nBranch Name:XYZ");
			break;
		
		   case 2:System.out.println("enter money to deposite");
			int deposite=scan.nextInt();
			balance=balance+deposite;
			System.out.println("Deposite Successfull...");
			break;
			
		   case 3:System.out.println("enter money to withdrawn");
			int withdrawn=scan.nextInt();
			System.out.println("enter pin");
			int p=scan.nextInt();
			if(withdrawn<=balance) {
				if(pin==p) {
				balance=balance-withdrawn;
				System.out.println("Withdrawn successfull..");
				}
				else {
					System.out.println("Incorrect pin..try once");
				}
			}
			else {
				System.out.println("Insufficient balance");
			}
			break;
			
		    case 4:System.out.println("Balance is: "+balance);
			break;
			
		    case 5:System.out.println("Thank you...");
		    System.exit(0);
			
		    default :System.out.println("Invalid choice");
		}
	     }

		     
	   
	
	}
}