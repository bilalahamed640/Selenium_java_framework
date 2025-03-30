package Utils;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    private static Workbook workbook;
    private static Sheet sheet;

    //Load Excel
    public static void LoadExcel(String filepath, String sheetname) throws IOException {
        FileInputStream file = new FileInputStream(filepath);
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetname);
    }

    public static String getcelldata(int row, int col) {
        Cell cell = sheet.getRow(row).getCell(col);
        if (cell.getCellType() == CellType.STRING) {
            return cell.getStringCellValue();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            return String.valueOf((int) cell.getNumericCellValue());

        }
        return "";
    }

    public static int getRowcount() {
        return sheet.getPhysicalNumberOfRows();
    }

    public static void closeexcel() throws IOException {
        workbook.close();
    }
}
