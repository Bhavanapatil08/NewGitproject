package Excelsheetoperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexceldata
{

	public static void main(String[] args) throws IOException 
	{
		File f =new File("D:\\New folder\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		
		//get workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//getting specific sheet
		XSSFSheet sheet=book.getSheet("Sheet1");
		
		//getting row1
		XSSFRow row1=sheet.getRow(1);
		XSSFRow row2=sheet.getRow(2);
		XSSFRow row3=sheet.getRow(3);
		
		//getting col1
		XSSFCell col1=row1.getCell(0);
		String s1=col1.toString();
		System.out.println(s1);
		
		//getting col2
		XSSFCell col2=row1.getCell(1);
		String s2=col2.toString();
		System.out.println(s2);
		
		//getting col3
		XSSFCell col3=row1.getCell(2);
		String s3=col3.toString();
		System.out.println(s3);
		
		//getting col4
		XSSFCell col4=row1.getCell(3);
		String s4=col4.toString();
		System.out.println(s4);
		System.out.println();
		
		//
		
		//getting col2
				XSSFCell col11=row2.getCell(0);
				String s11=col11.toString();
				System.out.println(s11);
				
				//getting col2
				XSSFCell col22=row2.getCell(1);
				String s22=col22.toString();
				System.out.println(s22);
				
				//getting col3
				XSSFCell col33=row2.getCell(2);
				String s33=col33.toString();
				System.out.println(s33);
				
				//getting col4
				XSSFCell col44=row2.getCell(3);
				String s44=col44.toString();
				System.out.println(s44);
				System.out.println();
		
				
					//getting col3
					XSSFCell col111=row3.getCell(0);
					String s111=col111.toString();
					System.out.println(s111);
					
					//getting col2
					XSSFCell col222=row3.getCell(1);
					String s222=col222.toString();
					System.out.println(s222);
					
					//getting col3
					XSSFCell col333=row3.getCell(2);
					String s333=col333.toString();
					System.out.println(s333);
					
					//getting col4
					XSSFCell col444=row3.getCell(3);
					String s444=col444.toString();
					System.out.println(s444);
					
//		for(int i=0;i<7;i++)
//		{
//					XSSFCell col=row1.getCell(i);
//					String s=col.toString();
//					System.out.println(s);
//		}

	}

}
