package skilrock.jatin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ARegisterDB 
{

	public static int save(ARegisterAction r){
		int status=0;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
			PreparedStatement ps=con.prepareStatement("insert into demo.adminregister values(?,?,?,?,?,?,?,?,?,?)");
			
			ps.setInt(1,r.getId());
			ps.setString(2,r.getName());
			ps.setString(3,r.getFname());
			ps.setString(4,r.getMname());
			ps.setString(5,r.getAddress());
			ps.setString(6,r.getNumber());
			ps.setString(7,r.getEmail());
			ps.setString(8,r.getGender());
			ps.setString(9,r.getPassword());
			ps.setString(10,"inactive");
			status=ps.executeUpdate();
		
		}catch(Exception e){e.printStackTrace();}
		return status;
	}
}


