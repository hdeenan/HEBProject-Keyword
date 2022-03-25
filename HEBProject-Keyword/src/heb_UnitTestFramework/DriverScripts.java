package heb_UnitTestFramework;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import heb_UtilityPackage.UtilityMethods;

public class DriverScripts {
	
	public static String testdata;

		public static void main(String[] args) throws BiffException, IOException, InterruptedException
		{
			
			String filepath=".//src//heb_ScenarioKeyword//Scenarioflows.xls";
			File f = new File(filepath); 
			Workbook w = Workbook.getWorkbook(f);
			Sheet s = w.getSheet("Sheet1");
			int rows = s.getRows(); 
			int columns = s.getColumns();
			
			for (int i=1; i<rows; i++)
			{  
				for(int j=1;j<(columns-1);j++)
				{   
					String keyword = s.getCell(j, i).getContents(); 
					testdata=s.getCell(++j,i).getContents();
					System.out.println(keyword); 
					System.out.println(testdata);
					
					UtilityMethods.actioncall(keyword);;
					
				} 
			 
			}
		


		}
	}


