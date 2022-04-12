import java.sql.*;
class a6q2  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		Statement st=c.createStatement();
		int n=st.executeUpdate("INSERT INTO ACCOUNT VALUES(6,'KRISHNA',50000)");
		n=st.executeUpdate("INSERT INTO ACCOUNT VALUES(7,'AMRINDER',1500)");
		System.out.println ("Two new values have been inserted successfully!");
		st.close();
		c.close();
	}
}
