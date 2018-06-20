package skilrock.jatin;

import java.sql.*;

public class MarksEditDB 
{
	public static int save(MarksEditAction r)
	{
		int status=0;  
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
				PreparedStatement ps=con.prepareStatement("update demo.marks set physics=?, chemistry=?, math=?, english=?, hindi=? where id =?");
				ps.setInt(1,r.getPhysics());
				ps.setInt(2,r.getChemistry());
				ps.setInt(3,r.getMaths());
				ps.setInt(4,r.getEnglish());
				ps.setInt(5,r.getHindi());
				ps.setInt(6,r.getId());
				
				status =ps.executeUpdate();
				  
				
			
			}catch(Exception e){e.printStackTrace();}
			
			System.out.println("statrus----"+status);
			return status;
		}
}

	


