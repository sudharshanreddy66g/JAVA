// Reverse a String:

class ReverseaString
{
	public static void main(String [] args)
	{
	
	    String str="Hello Java Progamming";
	    // String reverse="";
	    StringBuilder reverse=new StringBuilder();
	    for(int i=str.length()-1;i>=0;i--)
	    {
	          reverse.append(str.charAt(i));
	          // reverse +=str.charAt(i);
	          
	    }
	     // System.out.println("Reversed string: " + reverse);
	      System.out.println(reverse.toString());
	
	
	
	}
}