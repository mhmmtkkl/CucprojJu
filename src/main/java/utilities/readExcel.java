package utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class readExcel {

    public static String getData(String pathOfTheExcel , String sheetName ,String whichRow, int whichColumn){

        String path = ReadPropertiesFile.getData( pathOfTheExcel );

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

        Row row;

        Cell cell = null;


        int maxRow = sheet.getPhysicalNumberOfRows();

        System.out.println(maxRow);

        for(int i = 0 ; i<maxRow ; i++ ){

            row = sheet.getRow( i );

//                int cellCount = sheet.getRow( i ).getLastCellNum();
//                System.out.println(cellCount);

            cell = row.getCell( 0 );

            System.out.println(cell.toString() + " <---------");

            if(cell.toString().equals( whichRow )){

                System.out.println("I am in the if statemetn ");
                cell = row.getCell( whichColumn );
                System.out.println(cell.toString() + "<-------  cell ");
                break;
            }
        }

        return cell.toString();
    }
}
