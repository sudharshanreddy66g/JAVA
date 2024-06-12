
driver.manage().timeOuts().implictWaily(duration, TimeInUnits.SECONDS);
driver.manage().timeOuts().explictWaity();

FILE sourceFile=driver.getScreenshotAS(OutputType.FILE);
File DestnationFile=new File(".ScreenShot/img1.jpg");
FileUtils.copyFile(sourceFile, DestnationFile);
System.out.println("Screenshot saved successfully");


class String 
{
	
	

	public static void main(Strinhg [] args)
	{
	    String s="ABCD";
	
	    
	    System.out.prinln(s.toStringRevrse());
	    
	
	}
}