import java.sql.*;
class a6q4  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		Statement st=c.createStatement();
		int n=st.executeUpdate("DELETE FROM ACCOUNT WHERE BALANCE<10000");
		System.out.println("updated");
		st.close();
		c.close();
	}
}
