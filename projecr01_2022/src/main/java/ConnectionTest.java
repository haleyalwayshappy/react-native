//import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConnectionTest {

	@Test
	public void testConnection() throws Exception{
		Class.forName("org.mariadb.jdbc.Driver");
		
		Connection connection =DriverManager.getConnection(
				"jdbc:mariadb://127.0.0.1:3306/webdb",
				"root",
				"1234"
				);
		Assertions.assertNotNull(connection);
		connection.close();
		
	}

}
