class Palindrome3
{
	public static void main(String [] args)
	{
	
	     String str="madam";
	     String reverse= "";
	     for(int i=str.length()-1;i>=0;i--)
	     {
	         reverse +=str.charAt(i);
	     }
	     if(str.equals(reverse))
	         System.out.println(str +" is a plaindrome .");
	     else
	         System.out.println(str + " is not a plaindrome.");
	}
}