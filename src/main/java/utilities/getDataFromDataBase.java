package utilities;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class getDataFromDataBase {

    dataBaseConnection d1 = new dataBaseConnection();

    public String getStringFromDataBase(String whichDatabase , String whichUsername ,String whichPassword , String query , String whichColumn) throws Exception {

        Statement s1 = d1.connectToDataBase(whichDatabase , whichUsername , whichPassword);

        ResultSet resultSet = s1.executeQuery(query);

        resultSet.last();

        String result = resultSet.getString(whichColumn);

        return result;
    }

    public List<String> getMultipleDataFromDataBase(String whichDatabase , String whichUsername , String whichPassword , String query ,String whichColumn) throws Exception {

        Statement s1 = d1.connectToDataBase(whichDatabase , whichUsername , whichPassword);

        ResultSet resultSet = s1.executeQuery(query);


        List<String> data = new ArrayList<>();

        while(resultSet.next()) {

            data.add(resultSet.getString(whichColumn));

        }

    return data;
    }

    public static void main(String[] args) throws Exception {
        getDataFromDataBase d2 = new getDataFromDataBase();

        System.out.println(d2.getStringFromDataBase("DBURL" , "user" , "password" ,"select first_name from students where last_name like 'Wheway';" , "first_name"));

        System.out.println(d2.getMultipleDataFromDataBase("DBURL" , "user" , "password" ,"select * from students;" , "first_name"));

    }

}
