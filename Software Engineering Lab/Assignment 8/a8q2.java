import java.sql.*;
import java.util.Scanner;

class a8q2  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException
	{
		Scanner s = new Scanner(System.in);
		Class.forName("oracle.jdbc.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		
		while (true){
			System.out.println("\n-- Welcome to ABC Banking System -- \nHere are the options : \n1. Store accounts' information.\n2. Closing an Account.\n3. Increase Account Balance.\n4. Retrieve Date.\n5. Exit.\n");
			System.out.println("Enter your choice : ");
			int choice = s.nextInt();
			
			switch(choice){
				case 1:
					Statement st = c.createStatement();
					System.out.println ("\n-- Store Accounts Informations --");
					System.out.println ("\nEnter Account number : ");
					int accno = s.nextInt();
					System.out.println ("Enter Account holder's name : ");
					String name = s.next();
					System.out.println ("Enter the Balance : ");
					int balance = s.nextInt();
					int n = st.executeUpdate("INSERT INTO ACCOUNT VALUES(" +accno + ",'" +name + "'," +balance +")");
					System.out.println ("\n" + n + " Account stored successfully!");
					st.close();
					break;
				
				case 2:
					System.out.println ("\n-- Closing an Account --");
					System.out.println ("\nEnter Account number : ");
					int accno1 = s.nextInt();
					Statement st1 = c.createStatement();
					n = st1.executeUpdate ("DELETE FROM ACCOUNT WHERE ACCNO = " + accno1 );
					System.out.println ("\n" + n + " Account has been deleted.");
					st1.close();
					break;
					
				case 3:
					System.out.println ("\n-- Increase Account Balance --");
					System.out.println ("\nEnter Account number : ");
					int accno2 = s.nextInt();
					System.out.println ("Enter balance : ");
					int balance1 = s.nextInt();
					Statement st2 = c.createStatement();
					n = st2.executeUpdate ("UPDATE ACCOUNT SET BALANCE = BALANCE + " + balance1 + " WHERE ACCNO = " + accno2);
					System.out.println ("\nBalance updated for A/C number " + accno2);
					st2.close();
					break;
					
				case 4:
					System.out.println ("\n-- Retrieve Data --");
					System.out.println ("\nEnter Account number : ");
					int accno3 = s.nextInt();
					Statement st3 = c.createStatement();
					ResultSet rs = st3.executeQuery ("SELECT * FROM ACCOUNT WHERE ACCNO = " + accno3);
					if (rs.next()){
						String name1 = rs.getString(2);
						int balance2 = rs.getInt(3);
						System.out.println ("Account holder's name : " + name1);
						System.out.println ("Account Balance : Rs. " + balance2);
					}
					else {
						System.out.println ("Not a valid information");
					}
					rs.close();
					st3.close();
					break;
					
				case 5:
					System.exit(0);
					
				default:
					System.out.println ("Not a valid choice. Try again.");
			}
		}
	}
}
