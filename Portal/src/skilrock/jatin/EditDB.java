package skilrock.jatin;

import java.sql.*;

public class EditDB 
{
	public static int save(EditAction r)
	{
		int status=0;  
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
				PreparedStatement ps=con.prepareStatement("update demo.register set name=?, fname=?, mname=?, branch=?, address=?, mobile=?, email=?, gender=?,password=? where id =?");
				ps.setString(1,r.getName());
				ps.setString(2,r.getFname());
				ps.setString(3,r.getMname());
				ps.setString(4,r.getBranch());
				ps.setString(5,r.getAddress());
				ps.setString(6,r.getMobile());
				ps.setString(7,r.getEmail());
				ps.setString(8,r.getGender());
				ps.setString(9,r.getPassword());
				ps.setInt(10,r.getId());
				
				status =ps.executeUpdate();
				  
				
			
			}catch(Exception e){e.printStackTrace();}
			
			System.out.println("statrus----"+status);
			return status;
		}
}

	


