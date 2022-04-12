import java.sql.*;
import java.util.Scanner;

class a6q5  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the A/C holder name");
		String nm=s.next();
		System.out.println("Enter the account number");
		int acno=s.nextInt();
		System.out.println("Enter the balance Rs");
		int bal=s.nextInt();
 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		Statement st=c.createStatement();
		int n=st.executeUpdate("INSERT INTO ACCOUNT VALUES(" +acno + ",'" +nm + "'," +bal +")");
		System.out.println(n+" account stored successfully");
		st.close();
		c.close();
	}
}
