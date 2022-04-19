import java.sql.*;
import java.util.Scanner;

class a8q1  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Account Number : ");
		int accno = s.nextInt();
		Class.forName("oracle.jdbc.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		Statement st = c.createStatement();
		try{
			c.setAutoCommit(false);
			st.executeUpdate("UPDATE ACCOUNT SET BALANCE = BALANCE - 500 WHERE ACCNO = "+accno);
			c.commit();
			System.out.println("Funds transferred successfully.");
		}
		catch (Exception e) {
			c.rollback();
			System.out.println("Funds transfer failed.");
		}
		st.close();
		c.close();
	}
}
