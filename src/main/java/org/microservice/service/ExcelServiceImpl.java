package org.microservice.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.microservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("application.properties")
public class ExcelServiceImpl implements ExcelService {

	@Value("${user.file.path}")
	private String userFilePath;

	public User readData(String id) throws FileNotFoundException, IOException {
		User user = new User();
		user.setFirstName("Sumit");
	
		return user;

	}

	private static String getCellValueAsString(Cell cell) {
		String cellValue = null;
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_STRING:
			cellValue = cell.getStringCellValue();
			break;
		case Cell.CELL_TYPE_NUMERIC:
			double numericvalue = cell.getNumericCellValue();
			cellValue = String.valueOf((int) numericvalue);
			break;
		default:
			cellValue = "";
			break;
		}

		return cellValue;

	}

}
