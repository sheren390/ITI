package gov.iti.jets;

import java.sql.*;
// import java.math.*;

public class App {

    App() {
        try {

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3307/sakila";
            Connection conn = DriverManager.getConnection(url, "root", "123456789");
            Statement stmt = conn.createStatement();
            String queryString = new String("select * from actor");
            ResultSet rslt = stmt.executeQuery(queryString);
            while (rslt.next()) {
                System.out.println(rslt.getString(2));
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        // App myapp = new App();
        App2 myapp3 = new App2();
        myapp3.deleterow();
        // myapp3.insertrow();
    }
}
