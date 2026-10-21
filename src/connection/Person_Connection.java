package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Person_Connection {
    private static final String url="jdbc:mysql://localhost:3306/jdbc_project";
    private static final String username="root";
    private static final String password="root";
    public Connection getPersonConnection(){
        try {
            //1 load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2 get connection
            Connection connection =  DriverManager.getConnection(url,username,password);
            if(connection!=null) {
                return connection;
            }
            else{
                System.out.println("something is wrong in url,username or password");
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return null;

    }
}

