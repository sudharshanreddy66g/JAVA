class String06
{
	public static void main(String [] args)
	{
	   String s = "java";
	   char[] ch = s.toCharArray();
	   int i=0,j=s.length()-1;
           while(i < j)
	  {	     

	    char temp = ch[i];
	    ch[i] = ch[j];
	    ch[j] = temp;
	    i++;
	    j--;

	  }
	   System.out.println(ch);
	
	}
}