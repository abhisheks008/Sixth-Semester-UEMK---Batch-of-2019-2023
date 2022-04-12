import java.sql.*;
class a6q1  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		System.out.println("connection established");
	}
}
