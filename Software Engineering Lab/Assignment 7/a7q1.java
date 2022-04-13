import java.sql.*;
import java.util.Scanner;
class a7q1  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException {
		Scanner s = new Scanner(System.in);
		System.out.println ("Enter the A/C number : ");
		int accno = s.nextInt();
		Class.forName("oracle.jdbc.OracleDriver");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery ("SELECT * FROM ACCOUNT WHERE ACCNO = " + accno);
		if (rs.next()){
			String name = rs.getString(2);
			int balance = rs.getInt(3);
			System.out.println ("Account holder's name : " + name);
			System.out.println ("Account Balance : Rs. " + balance);
		}
		else {
			System.out.println ("Not a valid information");
		}
		rs.close();
		st.close();
		c.close();
	}
}
