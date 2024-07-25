

package JDBC;

import java.sql.*;

public class Student {

    public void createDatabase(){

    }

    public void createTable() {

    }

    public void createData() {

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "code";
            String username = "root";
            String password = "BangBang@1234";

            //conn establish
            Connection conn = DriverManager.getConnection(url+db,username,password);

            //create statement

            //execute - query
            String query = "INSERT into student(sid, sname, semail) VALUES(?,?,?)";

            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1,9);
            pstm.setString(2,"shiva");
            pstm.setString(3,"shivagupta@gmail.com");

            pstm.execute();

            System.out.println("Data inserted Successfully");
            conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void readData() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "code";
            String username = "root";
            String password = "BangBang@1234";

            //conn establish
            Connection conn = DriverManager.getConnection(url+db,username,password);

            //create statement

            //execute - query
            String query = "Select * from student";

            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                System.out.println("id = " + rs.getInt(1));
                System.out.println("name = " + rs.getString(2));
                System.out.println("email = " + rs.getString(3));
            }
            System.out.println("Read Successfully");
            conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

