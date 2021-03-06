package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserManager {

	static String jdbcURL = "jdbc:mysql://localhost:3306/testdb";
	static String dbUsername = "root";
	static String dbPassword = "password";

	static String username = "Eyad";
	static String email = "eyad@gmail.com";
	static String password = "321";

	public static void main(String[] args) {

		// Insert();
		Select();
		//Update();
		//Delete();

	}

	public static void Insert() {
		try {
			Connection con = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
			/*
			 * if (con != null) { System.out.println("Connected to database"); con.close();
			 * }
			 */
			// String sql = "INSERT INTO USERS (username,email,password) VALUES
			// ('Moayad','moayad@gmail.com','123')";
			String sql = "INSERT INTO USERS (username,email,password) VALUES (?,?,?)";
			// Statement stmt = con.createStatement();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, username);
			stmt.setString(2, email);
			stmt.setString(3, password);

			// int rows = stmt.executeUpdate(sql);
			int rows = stmt.executeUpdate();
			if (rows > 0)
				System.out.println("A new user has been inserted successfully.");

			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public static void Select() {
		try {
			Connection con = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);

			String sql = "SELECT * FROM users";
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(sql);
			while (result.next()) {
				System.out.println("Username: " + result.getString("username"));
				System.out.println("Email: " + result.getString("email"));
				System.out.println("Password: " + result.getString("password"));
				/*
				 * System.out.println("Username: " + result.getString(2));
				 * System.out.println("Email: " + result.getString(3));
				 * System.out.println("Password: " + result.getString(4));
				 */
			}

			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void Update() {
		try {
			Connection con = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);

			String sql = "UPDATE users SET password = ? WHERE username = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "54321");
			stmt.setString(2, "Moayad000");
			
			int rows = stmt.executeUpdate();
			if(rows>0)
				System.out.println("User's information updated.");
			
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void Delete() {
		try {
			Connection con = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);

			String sql = "DELETE FROM users WHERE username = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "Moayad000");
			
			int rows = stmt.executeUpdate();
			if(rows>0)
				System.out.println("User's information has been deleted.");
			
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
