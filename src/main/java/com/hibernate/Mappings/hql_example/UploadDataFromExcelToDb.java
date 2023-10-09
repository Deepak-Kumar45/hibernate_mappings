package com.hibernate.Mappings.hql_example;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;

import com.hibernate.Mappings.factory.Factory;

public class UploadDataFromExcelToDb {

	private static void uploadDataFromExcelToDb() throws Exception {
		
	
		FileInputStream inputstream = new FileInputStream(
				new File("E:\\Complete Hibernate\\Employee Sample Data.xlsx"));
		System.out.println("File is uploaded");

		String empid = "", name = "", dept = "", desg = "", gender = "";
		int age = 0;
		Date date=null;
		String finalDate="";
		Workbook workbook = new XSSFWorkbook(inputstream);
		Sheet sheet = workbook.getSheet("Data2");
		Iterator<Row> rows = sheet.rowIterator();

		int ctr = 1;
		while (rows.hasNext()) {
			Row row = rows.next();
			Iterator<Cell> cells = row.cellIterator();
			int cellIndex = 0;
			while (cells.hasNext()) {
				Cell cell = cells.next();
				
				switch (cellIndex) {
				case 0:
					empid = cell.getStringCellValue();
					break;
				case 1:
					name = cell.getStringCellValue();
					break;
				case 2:
					desg = cell.getStringCellValue();
					break;
				case 3:
					dept = cell.getStringCellValue();
					break;
				case 4:
					gender = cell.getStringCellValue();
					break;
				case 5:
					age = (int) cell.getNumericCellValue();
					break;
				case 6:
					date = cell.getDateCellValue();
					finalDate=new SimpleDateFormat("dd/MM/yyyy").format(date);
					break;

				default:
					break;
				}
				cellIndex++;
			}
			System.out.println(
					ctr + " | " + empid + " | " + name + " | " + dept + " | " + desg + " | " + gender + " | " + age+ " | " +finalDate);
			Session session=Factory.getSession();
			Transaction tx=session.beginTransaction();
			SampleDataEntity data=new SampleDataEntity();
			data.setAge(age);
			data.setDate(date);
			data.setDept(dept);
			data.setDesg(desg);
			data.setEmpid(empid);
			data.setGender(gender);
			data.setName(name);
			data.setLastupdated(new Date());
			session.save(data);
			tx.commit();
		
			System.out.println("Data has been saved..");
			ctr++;

		}

	}

	public static void main(String[] args) {
		try {
			uploadDataFromExcelToDb();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
