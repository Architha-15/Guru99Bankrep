package com.qa.utils;
	
import java.io.Reader;
import java.util.ArrayList;

public class DataProviderUtils {
	static Xls_Reader reader;
	 
	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try {
			reader=new Xls_Reader("C:\\Users\\Annangi\\eclipse-workspace\\Guru99Bank\\src\\main\\java\\com\\qa\\testdata\\NewCustomerReg.xlsx");
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		for(int rowNum=2;rowNum<=reader.getRowCount("regdetails");rowNum++) {
			String cname=reader.getCellData("regdetails", "cusname", rowNum);
			String gender=reader.getCellData("regdetails", "gen", rowNum);
			String date=reader.getCellData("regdetails", "date", rowNum);
			String month=reader.getCellData("regdetails", "month", rowNum);
			String year=reader.getCellData("regdetails", "year", rowNum);
			String address=reader.getCellData("regdetails", "address", rowNum);
			String city=reader.getCellData("regdetails", "city", rowNum);
			String state=reader.getCellData("regdetails", "state", rowNum);
			String pin=reader.getCellData("regdetails", "pin", rowNum);
			String mobile=reader.getCellData("regdetails", "mobile", rowNum);
			String emailid=reader.getCellData("regdetails", "email", rowNum);
			String passwords=reader.getCellData("regdetails", "pwds", rowNum);
			
			
			
			Object ob[]= { cname,gender,date, month, year, address, city, state,  pin, mobile,  emailid, passwords};
			myData.add(ob);
		}
		return myData;
		
		
		
	}

}

