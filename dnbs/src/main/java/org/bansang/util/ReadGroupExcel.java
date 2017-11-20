package org.bansang.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bansang.dto.GroupDTO;

public class ReadGroupExcel {

	// excel 파일로부터 그룹 정보를 읽는다.
	public List<GroupDTO> readGroupFromExcelFile(String excelFilePath) throws IOException {
	    List<GroupDTO> listGroup = new ArrayList<GroupDTO>();
	    FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	 
	    Workbook workbook = getWorkbook(inputStream, "C:\\zzz\\excel\\MyFirstExcel.xls");
	    Sheet firstSheet = workbook.getSheetAt(0);
	    Iterator<Row> iterator = firstSheet.iterator();
	 
	    while (iterator.hasNext()) {
	        Row nextRow = iterator.next();
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        GroupDTO dto = new GroupDTO();
	 
	        while (cellIterator.hasNext()) {
	            Cell nextCell = cellIterator.next();
	            int columnIndex = nextCell.getColumnIndex();
	 
	            switch (columnIndex) {
	            case 1:
	                dto.setName((String) getCellValue(nextCell));
	                break;
	            case 2:
	                dto.setEmail((String) getCellValue(nextCell));
	                break;
	            }
	        }
	        listGroup.add(dto);
	    }
	 
	    workbook.close();
	    inputStream.close();
	 
	    return listGroup;
	}
	
	// cell 값의 형식을 모두 string으로
	@SuppressWarnings("deprecation")
	private Object getCellValue(Cell cell) {
	    switch (cell.getCellType()) {
	    case Cell.CELL_TYPE_STRING:
	        return cell.getStringCellValue();
	 
	    case Cell.CELL_TYPE_BOOLEAN:
	        return cell.getBooleanCellValue();
	 
	    case Cell.CELL_TYPE_NUMERIC:
	        return cell.getNumericCellValue();
	    }
	    return null;
	}
	
	// xlsx파일인지 xls파일인지 판별
	private Workbook getWorkbook(FileInputStream inputStream, String excelFilePath)
	        throws IOException {
	    Workbook workbook = null;
	 
	    if (excelFilePath.endsWith("xlsx")) {
	        workbook = new XSSFWorkbook(inputStream);
	    } else if (excelFilePath.endsWith("xls")) {
	        workbook = new HSSFWorkbook(inputStream);
	    } else {
	        throw new IllegalArgumentException("The specified file is not Excel file");
	    }
	 
	    return workbook;
	}
}