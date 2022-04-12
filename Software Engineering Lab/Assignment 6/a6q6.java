import java.sql.*;
import java.util.Scanner;

class a6q6  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the account number");
		int acno=s.nextInt();
		System.out.println("Enter the balance to be deposited Rs");
		int bal=s.nextInt();
 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		Statement st=c.createStatement();
		int n=st.executeUpdate("UPDATE ACCOUNT SET BALANCE = BALANCE + " +bal+ " WHERE ACCNO = " +acno);
		System.out.println("Money deposited successfully");
		st.close();
		c.close();
	}
}
