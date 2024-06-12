<!DOCTYPE html>
<html>
<head>
<titel>Page Title</title>
</head>
<body>
<h1> This is a Heading</h1>
<p> This is a paragraph.</p>

</body>
</html>


+91 89519 65092. 8951965086 Apr 4, 12:38 PM
Trainer Name: Rashi Agarwal Start Date: 6th April 2024 Timing: 8:00AM to 12:00PM Subject: ISTQB Batch Code: QCO-IQBIQE-M2 Link to join: https://student.qspiders.com/classroom/QCO-IQBIQE-M2


WebDriverWait
FluentWait

Take screen shot as:-
--------------------

File sf=driver.getScreenshotAs(OutputType.FILE);
File dsf=new File("/.s/img1.jpg");
FileUtils.copyFile(sf, dsf);
System.out.println("Screenshot saved successfully");

JavascriptExcecutor:-
--------------------

JavascriptExecutor js=(JavascriptExcecutor) driver;
js.excuteScript(script, args);


Actions act=new Actions(driver);
act.moveToElement(element).click().perform();

Mouse Actions in selenium:-
--------------------------

doubleClick():
clickAndHold():
dragAndDrop():
moveToElement():
contextCClick():

Keyboard Actions in Selenium:
----------------------------

sendKeys():
keyUp():
keyDown():


How to Handle dropdown using selenium:-
----------------------------------------

Select s=new Select(WebElement);

selectByVisibleText():
selectByValue(): 
selectByIndex():
getOptions():
deselectAll():

How to handle multiple windows in selenium ?
--------------------------------------------

driver.getWindowHandle():
driver.getWindowHandles():
driver.switchTo.window():





How to Handle Alerts in selenium ?



driver.switchTo.alert().dismiss();
driver.switchTo.alert().accept();
driver.switchTo.alert().getText();
driver.switchTo.alert().sendKeys();





