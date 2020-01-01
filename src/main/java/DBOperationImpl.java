import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperationImpl implements DBOperation {
    Connection con=null;
    Statement st=null;
    public void conectDB() {
        try {
             con = DriverManager.getConnection(URL_CONNECTION_DB, USER_DB, PASSWORD_DB);
          st = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertDB(String values) {
        try {
System.out.println(INSERT_QUERY+  values + ";");
            st.executeUpdate(INSERT_QUERY+  values + ";");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
