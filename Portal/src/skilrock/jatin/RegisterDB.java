package skilrock.jatin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDB {

	public static int save(RegisterAction r){
		int status=0;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
			PreparedStatement ps=con.prepareStatement("insert into demo.register values(?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,r.getId());
			ps.setString(2,r.getName());
			ps.setString(3,r.getFname());
			ps.setString(4,r.getMname());
			ps.setString(5,r.getBranch());
			ps.setString(6,r.getAddress());
			ps.setString(7,r.getNumber());
			ps.setString(8,r.getEmail());
			ps.setString(9,r.getGender());
			ps.setString(10,r.getPassword());
			status=ps.executeUpdate();
		}catch(Exception e){e.printStackTrace();}
		return status;
	}
}


