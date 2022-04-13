import java.sql.*;
import java.util.Scanner;
class a7q3  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		PreparedStatement ps = c.prepareStatement("INSERT INTO ACCOUNT VALUES(?,?,?)");
		ps.setInt(1,1009);
		ps.setString(2,"SURESH");
		ps.setInt(3,6800);
		int n = ps.executeUpdate();
		
		ps.setInt(1,1010);
		ps.setString(2,"RAKESH");
		ps.setInt(3,9800);
		n = ps.executeUpdate();
		
		System.out.println("\nInformation stored.");
		ps.close();
		c.close();
	}
}
