
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection {

	public static void main (String[]args) throws ClassNotFoundException, SQLException{
		String url = "jdbc:mariadb://127.0.0.1:3306/WEBDB";
		String sql = "SELECT * FROM user";
		
		Class.forName("org.mariadb.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, "root","1234");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			String ex1 = rs.getString("columnName");
			System.out.println(ex1);
		}
		rs.close();
		st.close();
		con.close();
	}
}
