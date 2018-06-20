package skilrock.jatin;

import java.sql.*;

public class ALoginDB 
{
	public static boolean validate(int id,String password)
	{  
		 boolean status=false;  
		  try
		  {  
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
				
			  PreparedStatement ps=con.prepareStatement("select * from demo.adminregister where id=? and password=?");  
		   ps.setInt(1,id);  
		   ps.setString(2,password);  
		   ResultSet rs=ps.executeQuery();  
		   status=rs.next();  
		   System.out.println("rs--"+rs);
		   System.out.println("status--"+status);
		  }
		  catch(Exception e){e.printStackTrace();}  
		 return status;  
		}  
}
