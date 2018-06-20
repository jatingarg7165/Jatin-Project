package skilrock.jatin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterAttendDB 
{
	public static int add(RegisterAction r){
		int status=0;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
			PreparedStatement p=con.prepareStatement("insert into demo.attendance values(?,?,?)");
			
			p.setInt(1,r.getId());
			p.setInt(2,0);
			p.setInt(3,0);
					
			status=p.executeUpdate();
		}catch(Exception e){e.printStackTrace();}
		return status;
	}
	
	
	
	
}
