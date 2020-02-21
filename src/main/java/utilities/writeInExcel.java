package utilities;

import cucumber.api.Scenario;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;

import java.io.FileOutputStream;


public class writeInExcel {

    static int rowCount = 0;

    public static void excelWriteResults(String pathOfThExcel , String sheetName, Scenario scenario)  {


        String path = ReadPropertiesFile.getData( pathOfThExcel );

        FileInputStream inStream = null;

        try{
            inStream =new FileInputStream( path );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        Workbook workbook = null;

        try{
            workbook = WorkbookFactory.create( inStream );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        Sheet sheet = workbook.getSheet( sheetName );

        Row row = sheet.createRow( rowCount );

        System.out.println("writing the scenario name" + scenario.getId() );
//            you need to create the each cell to write data in the excel
        Cell cell = row.createCell( 0 );
        cell.setCellValue( scenario.getId() );

        System.out.println("cell.setCellValue" + scenario.getStatus() );
//            you need to create the each cell to write data in the excel
        cell = row.createCell( 1 );
        cell.setCellValue(String.valueOf(scenario.getStatus()));

//            save the changes
        FileOutputStream outStream= null;
        try{
            outStream = new FileOutputStream( path );
            workbook.write( outStream );

            outStream.close();
            workbook.close();
            inStream.close();

        }catch(Exception e ){
            System.out.println(e.getMessage());
        }

        rowCount++;
    }
}
