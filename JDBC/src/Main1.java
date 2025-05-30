import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
	public static void main(String[] args) {
	Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
	Statement statement = con.createStatement();
	ResultSet set = statement.executeQuery("select * from info3");
		while (set.next()) {
		System.out.println(set.getString(1));
			System.out.println(set.getInt(2));
		System.out.println(set.getInt(3));
	}


//		TYPE 2

		Class.forName("com.mysql.jdbc.Driver");
		ResultSet set = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "").createStatement().executeQuery("select * from info3");
		while (set.next()) {
			System.out.println(set.getString(1));
			System.out.println(set.getInt(2));
	System.out.println(set.getInt(3));
	}

		
//		    TYPE 3
		
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (ResultSet set = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "")			
				.createStatement().executeQuery("select * from info3");) {			while (set.next()) {
				System.out.println(set.getString(1));			System.out.println(set.getInt(2));
			System.out.println(set.getInt(3));
		}		} catch (SQLException e) {
		
		}
		}

//		TYPE 4

	Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;

	}
}
