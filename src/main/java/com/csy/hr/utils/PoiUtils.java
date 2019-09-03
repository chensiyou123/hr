package com.csy.hr.utils;

import com.csy.hr.domain.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PoiUtils {
    public static List<Employee> importEmp2List(MultipartFile file,
                                                List<Nation> allNations,
                                                List<Politicsstatus> allPolitics,
                                                List<Department> allDeps,
                                                List<Position> allPos,
                                                List<Joblevel> allJobLevels){
        List<Employee> emps = new ArrayList<>();
        try {
            //1.创建工作簿
            HSSFWorkbook workbook = new HSSFWorkbook(new POIFSFileSystem(file.getInputStream()));
            //2.得到工作簿的页数
            int numberOfSheets = workbook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                HSSFSheet sheet = workbook.getSheetAt(i);
                //3.得到每页的行
                int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
                Employee employee;
                for (int j = 0; j < physicalNumberOfRows; j++) {
                    //4.得到每一列
                    if (j == 0) {
                        continue;//标题行
                    }
                    //5得到行
                    HSSFRow row = sheet.getRow(j);
                    if (row == null) {
                        continue;//没数据
                    }
                    //6得到行的单元格数
                    int physicalNumberOfCells = row.getPhysicalNumberOfCells();
                    employee = new Employee();
                    for (int k = 0; k < physicalNumberOfCells; k++) {
                        //7得到单元格
                        HSSFCell cell = row.getCell(k);
                        switch (cell.getCellTypeEnum()) {
                            case STRING:{
                                String cellValue = cell.getStringCellValue();
                                if (cellValue == null) {
                                    cellValue = "";
                                }
                                switch (k) {
                                    case 1:
                                        employee.setName(cellValue);
                                        break;
                                    case 2:
                                        employee.setWorkid(cellValue);
                                        break;
                                    case 3:
                                        employee.setGender(cellValue);
                                    case 5:
                                        employee.setIdcard(cellValue);
                                    case 6:
                                        employee.setWedlock(cellValue);
                                        break;
                                    case 7:
                                        int nationIndex = allNations.indexOf(new Nation(cellValue));
                                        employee.setNationid(allNations.get(nationIndex).getId());
                                        break;
                                    case 8:
                                        employee.setNativeplace(cellValue);
                                        break;
                                    case 9:
                                        int psIndex = allPolitics.indexOf(new Politicsstatus(cellValue));
                                        employee.setPoliticid(allPolitics.get(psIndex).getId());
                                        break;
                                    case 10:
                                        employee.setPhone(cellValue);
                                        break;
                                    case 11:
                                        employee.setAddress(cellValue);
                                        break;
                                    case 12:
                                        int depIndex = allDeps.indexOf(new Department(cellValue));
                                        employee.setDepartmentid(allDeps.get(depIndex).getId());
                                        break;
                                    case 13:
                                        int jlIndex = allJobLevels.indexOf(new Joblevel(cellValue));
                                        employee.setJoblevelid(allJobLevels.get(jlIndex).getId());
                                        break;
                                    case 14:
                                        int posIndex = allPos.indexOf(new Position(cellValue));
                                        employee.setPosid(allPos.get(posIndex).getId());
                                        break;
                                    case 15:
                                        employee.setEngageform(cellValue);
                                        break;
                                    case 16:
                                        employee.setTiptopdegree(cellValue);
                                        break;
                                    case 17:
                                        employee.setSpecialty(cellValue);
                                        break;
                                    case 18:
                                        employee.setSchool(cellValue);
                                        break;
                                    case 19:
                                    case 20:
                                        employee.setWorkstate(cellValue);
                                        break;
                                    case 21:
                                        employee.setEmail(cellValue);
                                        break;
                                }
                            }
                            break;
                            default: {
                                switch (k) {
                                    case 4:
                                        employee.setBirthday(cell.getDateCellValue());
                                        break;
                                    case 19:
                                        employee.setBegindate(cell.getDateCellValue());
                                        break;
                                    case 22:
                                        employee.setContractterm(cell.getNumericCellValue());
                                        break;
                                    case 23:
                                        employee.setBegincontract(cell.getDateCellValue());
                                        break;
                                    case 24:
                                        employee.setEndcontract(cell.getDateCellValue());
                                        break;
                                }
                            }
                            break;
                        }
                    }
                    emps.add(employee);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emps;
    }
}
