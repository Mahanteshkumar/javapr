
import java.sql.*;
public class Jdbctest 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection mycon=null;
		Statement myst=null;
		ResultSet myrst=null;
		mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306//demo", "studen", "student@123");
		System.out.println("data base connected");
		myst=mycon.createStatement();
		myrst=myst.executeQuery("select * from employees");
		while(myrst.next())
		{
			System.out.println(myrst.getString("first_name")+"  ,  "+myrst.getString("last_name"));
		}
	}
}