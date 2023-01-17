package gov.iti.jets;

import java.sql.*;

public class App2 {
    Connection conn;

    App2() {
        try {

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3307/sakila";
            conn = DriverManager.getConnection(url, "root", "123456789");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deleterow() {
        try{
        PreparedStatement pstmt = conn.prepareStatement("delete from actor where actor_id=?");
        pstmt.setInt(1, 206);
        int r = pstmt.executeUpdate();
        if (r == 1) {
            System.out.println("App3 success");
        }
        pstmt.close();
        conn.close();
    }
    catch (SQLException e) {
        System.out.println(e);
    }
    }
    public void insertrow(){
        try{
            PreparedStatement pstmt = conn.prepareStatement("insert into actor (first_name, last_name ) values(?,?)");
            pstmt.setString(1, "Mariam");
            pstmt.setString(2, "Hesham");
            int r = pstmt.executeUpdate();
            if(r==1){System.out.println("success");}
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}