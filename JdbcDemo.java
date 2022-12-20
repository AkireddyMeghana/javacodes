import java.sql.*;
import java.util.Scanner;

public class JdbcDemo {
    public static void main(String... args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/infinite";
        String user = "root";
        String password = "india@123";
        Connection con = DriverManager.getConnection(url, user, password);

       /*  if (con !=null) {
             System.out.println("connected successfully");
         }
         else{
             System.out.println("unable to connect");
        }*/
        Statement stat = con.createStatement();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the name");
        String name = s.nextLine();
        System.out.println("enter the password");
        String pass = s.next();
        ResultSet rs = stat.executeQuery(" select * from candidate");
        int flag = 0;
        while (rs.next()) {
            if (rs.getString(1).equals(name) && rs.getString(2).equals(pass)) {
                flag = 1;
                System.out.println("login successfully");
            }
        }
        if (flag == 0) {
            System.out.println("incorrect credentials");
        }
    }
}
       /*   ResultSet rs = stat.executeQuery("select * from product1");
        while(rs.next()){
            System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getInt(4));
        }


        */