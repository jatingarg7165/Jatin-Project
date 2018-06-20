package skilrock.jatin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class AttendanceAbsentAction  
{
	int id,present,absent;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPresent() {
		return present;
	}
	public void setPresent(int present) {
		this.present = present;
	}
	public int getAbsent() {
		return absent;
	}
	public void setAbsent(int absent) {
		this.absent = absent;
	}
	public String execute()
	{
		int i=0;
		try
		 {  
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
			 PreparedStatement ps=con.prepareStatement("UPDATE demo.attendance SET absent=absent+1 WHERE id=?");
			 ps.setInt(1, getId());
			 i=ps.executeUpdate();  
		  
		    
		  
		  con.close();  
		  
		 }catch(Exception e){e.printStackTrace();}  
		  if(i>0)
		  {
			  return "success";
		  }
		  else
		  {
			  return "error";
		  }
		
	}
}
