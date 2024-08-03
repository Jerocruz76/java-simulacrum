package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    private String URL="jdbc:mysql://localhost:3306/riwi_simulacrum";
    private String USERNAME="root";
    private String PASSWORD="Rlwl2023.";
    Connection connection = null;

    public Connection getConnection(){
        try{
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

    public void closeConnection(){
        try{
            if(connection!=null && !connection.isClosed()){
                connection.close();
                System.out.println("Connection closed");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
