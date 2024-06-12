class String04
{
	public static void main(String [] args)
	{
	  String s ="ProGraMming";
	  String s1 ="";
	  // System.out.println(s.toUpperCase());
	
	  for(int i=0;i<s.length();i++)
	  {
	    		
		Char ch=s.charAt(i);
	      	if(ch>='a' && ch<='z')
	              s1 +=(char)(ch-32);
	        else
	              s1+=ch;
	  }
	  System.out.println(s1);
	
	}
}