package org.example;

import java.sql.*;

import static java.lang.Class.forName;

public class Database {
    private static String url = "jdbc:postgresql://localhost:5432/";
    private static String user = "postgres";
    private static final String password = "9111215gabi";

    private Database(){

    }

    public static Connection getConnection() throws SQLException
    {
        Connection connection = null;
        connection=DriverManager.getConnection(url, user, password);
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

    public static void closeStatement(Statement statement) throws SQLException {
        statement.close();
    }

    public static void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    public static void closeResultSet(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }

   /* Connection connection = null;


    public Connection connection(String dbname, String user, String pass){
        try{
            Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" +dbname, user, pass);
        if(connection != null){
            System.out.println("conexiune reusita");
        }
            if(connection == null){
                System.out.println("conexiune esuata");
            }}catch (Exception e){
            System.out.println(e);
        }
        return connection;
    }

    */
}
