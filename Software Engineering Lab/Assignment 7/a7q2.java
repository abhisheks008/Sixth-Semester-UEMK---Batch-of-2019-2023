import java.sql.*;
import java.util.Scanner;
class a7q2  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery ("SELECT * FROM ACCOUNT WHERE BALANCE>5000");
		while (rs.next()){
			int accountNo = rs.getInt(1);
			String name = rs.getString(2);
			int balance = rs.getInt(3);
			System.out.println ("\nAccount Number : " + accountNo);
			System.out.println ("Account holder's name : " + name);
			System.out.println ("Account Balance : Rs. " + balance);
			System.out.println ("\n");
		}
		rs.close();
		st.close();
		c.close();
	}
}
