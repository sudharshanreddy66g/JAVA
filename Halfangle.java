class Halfangle
{
	public static void main(String [] args)
	{
	      int n=3;
	      for(int i=1;i<=n;i++)
	      {
	          for(int j=1;j<=n;j++)
		  {
		     if(i>=j)
		     {
			System.out.print("*");
		     }
		     else
	             {
		        System.out.println(" ");
		     }
		      System.out.println();
	           }
		}
	}
}