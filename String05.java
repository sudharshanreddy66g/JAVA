class String05
{
	public static void main(String [] args)
	{
	   String s ="Programming";
	   String rev = "";
	   for(int i=s.length()-1;i>=0;i--)
	   {
		  rev +=s.charAt(i);
                
	
	   }	
	   System.out.println(rev);


	}
}