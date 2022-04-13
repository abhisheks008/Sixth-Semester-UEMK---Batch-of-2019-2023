import java.sql.*;
import java.util.Scanner;
class a7q5  {
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
		System.out.println ("Are you wanted to terminate your account? [Y/N]\n");
		char check = s.next().charAt(0);
		if (check == 'Y'){
			int n = st.executeUpdate("DELETE FROM ACCOUNT WHERE ACCNO = " + accno);
			System.out.println("Your account has been terminated.");
		}
		else {
			System.out.println("Thank you.");
		}
		rs.close();
		st.close();
		c.close();
	}
}
