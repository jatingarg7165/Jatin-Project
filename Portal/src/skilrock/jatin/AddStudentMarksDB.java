package skilrock.jatin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddStudentMarksDB 
{

	public static int save(AddStudentMarksAction r){
		int status=0;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
			PreparedStatement ps=con.prepareStatement("insert into demo.marks values(?,?,?,?,?,?)");
			
			ps.setInt(1,r.getId());
			ps.setInt(2,r.getPhysics());
			ps.setInt(3,r.getChemistry());
			ps.setInt(4,r.getMaths());
			ps.setInt(5,r.getEnglish());
			ps.setInt(6,r.getHindi());
			status=ps.executeUpdate();
		
		}catch(Exception e){e.printStackTrace();}
		return status;
	}
}


