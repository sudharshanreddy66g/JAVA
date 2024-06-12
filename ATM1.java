class ATM1
{
	public static void main(String [] args)
	{
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Generate 4 digit pin");
	   int pin=scan.nextInt();
	   System.out.println("--- SBI ATM-----");
           int balance=0;

	   while(true)
	   {
		System.out.println("------------");
		System.out.println("1.A/C detalis\n2.Deposite\n3.Withdrawn\n4.Check Balance\n5.Exit");
		int choice=scan.nextInt();
		switch(choice)
		{
		    case 1: 
			System.out.println("A/C Holder Name: Smith");
			System.out.println("AC No:12345678789876\nIFSC Code:SBIN 000YN\nBranch Name:XYZ");
		        break;
		    case 2:
			System.out.println("Enter money to deposite");
			int deposite=scan.nexrInt();
			balance=balance+deposite;
			System.out.println("Deposite successfully");
			

		    case 3:
			System.out.println("Enter a money to withdrawn");
			int withdrawn=scan.nextInt();
			System.out.println("Enter a pin");
			int p=scan.nextInt();
			if(withdrawn<=balance)
			{
				if(pin==p)
				{

					System.out.println("Withdrawn successfull");
				}
				else
				{
					System.out.println("Incorrect pin... try once");
				}
			}
			else
			{
				System.out.println("Insuccifient balance");
			}
			break;
	
		case 4:
		    System.out.println("Balance is: " + balance);
		    break;

	
		case 5:
		     System.out.println("Thank You");
		     System.exit(0);
		
		default :
		   System.out.println("Invalid Choice...");
	    }
	
	  }
	}


}

				
	  

	
	
