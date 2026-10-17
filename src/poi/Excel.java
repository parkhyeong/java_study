package poi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel {

    public static void main(String[] args) throws FileNotFoundException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("회원 목록");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);

        cell.setCellValue("회원 목록");

        // 저장 위치 지정
        String path = "D:/workspace/java/java-study/java-mid1/members.xlsx";

        try (FileOutputStream out = new FileOutputStream(path)) {
            workbook.write(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
