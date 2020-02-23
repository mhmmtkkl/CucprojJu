package utilities;

import java.sql.*;

public class dataBaseConnection {

    private Statement statement;
    private Connection connection;

    public Statement connectToDataBase(String URL , String userName , String passwordInput) throws Exception{
        String url = ReadPropertiesFile.getData(URL);
        String user = ReadPropertiesFile.getData(userName);
        String password = ReadPropertiesFile.getData(passwordInput);

            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            return statement;
    }

    public void disconnect() throws SQLException {
            connection.close();
    }

    public static void main(String[] args) throws Exception {
        dataBaseConnection d1 = new dataBaseConnection();

        d1.connectToDataBase("DBURL" , "user" , "password");


            ResultSet resultSet = d1.statement.executeQuery( "select " +
                    "* " +
                    "from students" );
            resultSet.last();
            int numberOfRow = resultSet.getRow();
            Object[][] resultData = new Object[numberOfRow][6];
            resultSet.beforeFirst();
            int i = 0;
            while(resultSet.next()) {
                String first_name = resultSet.getString( "first_name" );
                String last_name = resultSet.getString( "last_name" );
                String email = resultSet.getString( "email" );
                String gender = resultSet.getString( "gender" );
                String country = resultSet.getString( "country" );
                Double fee = resultSet.getDouble( "fee" );
                resultData[i][0] = first_name;
                resultData[i][1] = last_name;
                resultData[i][2] = email;
                resultData[i][3] = gender;
                resultData[i][4] = country;
                resultData[i][5] = fee;
                i++;
            }

            for(int j = 0 ; j< resultData.length ; j++){

                for(int k = 0 ; k <resultData[j].length ; k++){

                    System.out.println(resultData[j][k]);
                }

            }

        d1.disconnect();

    }
}
