package com.qa.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.poifs.nio.FileBackedDataSource;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.google.common.collect.Table.Cell;

public class WriteExcel{
	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("regdetails");
		
		ArrayList< Object[]> fbdata = new ArrayList<Object[]>();
		fbdata.add(new Object[] {"cusname", "gen" ,"date","month","year","address","city","state","pin","mobile","email","pwds"});
		fbdata.add(new Object[] {"jim", "male","15","09","1993","lbnagar","Hyd","Telangana","500060","845673234","jim24@gmail.com","456"});
		fbdata.add(new Object[] {"john", "male","14","11","1996","rosesnagar","Chennai","Tamilnadu","500061","985643210","john45@gmail.com","789"});
		fbdata.add(new Object[] {"claire", "female","05","12","1993","telephonenagar","Kochi","Kerala","500062","9849272107","claire36@gmail.com","0412"});
		
		int rowNum=0;
		for (Object[] data : fbdata) {
			XSSFRow row=sheet.createRow(rowNum++);
			int cellNum=0;
			for (Object value : data) {
				XSSFCell cell =row.createCell(cellNum++);
				
				if(value instanceof String) {
					cell.setCellValue((String)value);
				}
				
				if(value instanceof Integer) {
					cell.setCellValue((Integer)value);
				}
				
				if(value instanceof Boolean) {
					cell.setCellValue((Boolean)value);
				}
				
				
			}
			
		}
		File file = new File("C:\\Users\\Annangi\\eclipse-workspace\\Guru99Bank\\src\\main\\java\\com\\qa\\testdata\\NewCustomerReg.xlsx");
		FileOutputStream fOutputStream = new FileOutputStream(file);
		workbook.write(fOutputStream);
		fOutputStream.close();
		workbook.close();
		
		
	}
	

}
