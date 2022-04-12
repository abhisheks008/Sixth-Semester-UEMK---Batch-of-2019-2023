import java.sql.*;
class temp  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		Statement st = c.createStatement();
		int n = st.executeUpdate("UPDATE ACCOUNT SET BALANCE = BALANCE + 500");
		st.close();
		c.close();
		System.out.println ("Balance Updated!");
	}
}
