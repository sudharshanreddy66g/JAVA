writeDataIntoExcel:-
-------------------
public void writeDataIntoExcel(String sheetName, int row, int cell, String value)
{

	FileInputStream fis=new FileInputStream(FilePath);
	WorkBook wb=workBookFactory.create(fis);
	wb.getSheet(sheetName).createRow(row).createCell(cell).setCellValue(value);
	FileoutPutStream fos=new FileOutPutStream(filePath);
	wb.write(fos);		
	wb.close();

}


// ReadDataFromExcel file

public void ReadDataFromExcel(String sheetName, int row, int cell)
{

	FileInputStream fis=new FileInputStream(filepath);
	WorkBook wb=WorkBookFactory.create(fis);
	wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	FileOutPutStream fos=new FileOutPutStream(filepath);
	wb.write(fos);
	wb.close();



}







