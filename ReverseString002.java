class ReverseString002
{
	public static void main(String [] args)
	{
	
	   String str="Hello Java Programming";
	   // StringBuilder reverse=new StringBuilder();
	   String reverse="";
	
	   for(int i=str.length()-1;i>=0;i--)
	   {
		// reverse.append(str.charAt(i));

		reverse +=str.charAt(i);
	   }

	    // System.out.println("Reversed String is: "+ reverse);
	    
	    System.out.println(reverse.toString());
	
	
	}
}