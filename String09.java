class String09
{
	// Reverse of each word
	public static void main(String [] args)
	{
	   String s1="java is opp lang";
	   String s2="";
	   String[] str=s1.split(" ");
	   for(String s : str)  // for each loop
	   {
	       System.out.println(s);
	            s2 +=rev(s);
	            s2+= " ";
	   }
	   s2=s2.trim();
	    System.out.println(s2);
	
	
	  
	   
	
	}
	private static String rev(String s)
	{
	    // s = Java
	   String s1="";
	   for(int i=s.length()-1;i>=0;i--)
	   {
	
	       s1 +=s.charAt(i);

	   }
	   return s1;
	}
}