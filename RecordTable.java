import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RecordTable {
    public static void main(String... args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/infinite";
        String user = "root";
        String password = "india@123";
        Scanner s = new Scanner(System.in);

    for(int i=0;i<2;i++) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("enter the name");
            String name = s.next();
            System.out.println("enter the password");
            String passWord = s.next();
            String query = "insert into candidate (name,password)" + "values(?,?)";
            PreparedStatement pt = con.prepareStatement(query);
            pt.setString(1, name);
            pt.setString(2, passWord);

            pt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        }
    }
    //Use PreparedStatement to insert 2 records in your table. Get the values from user