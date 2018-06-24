package SeleniumLearnings.NewApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata {

	public static void main(String[] args) {
		
		
		
		
					
			
			String[][] arrayExcelData = null;
			try {
				FileInputStream fs = new FileInputStream("C:\\Users\\chand\\git\\Mylearmings\\NewApplication\\TestData.xlsx");
				XSSFWorkbook wb = new XSSFWorkbook(fs);
				 
				XSSFSheet sh = wb.getSheet("sheet1");

				int totalNoOfCols = 2;
				int totalNoOfRows = 3;
				
				arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
				
				for (int i= 1 ; i < totalNoOfRows; i++) {

					for (int j=0; j < totalNoOfCols; j++) {
						
						
						// System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
						
						XSSFCell cell = sh.getRow(i).getCell(j);
						
						arrayExcelData[i-1][j] = cell.getStringCellValue();
						
						System.out.println(arrayExcelData[i-1][j]);
						
					}

				}
				
				System.out.println(arrayExcelData);
			} catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
				
			} 
		
		
		
		
		
	
		


	// TODO Auto-generated method stub

	}

	

}
