package skilrock.jatin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class AttendanceViewAction  
{
	private int id,present,absent;
	
	ArrayList<AttendanceViewAction> list=new ArrayList<AttendanceViewAction>();  
	
	public ArrayList<AttendanceViewAction> getList() {
		return list;
	}
	public void setList(ArrayList<AttendanceViewAction> list) {
		this.list = list;
	}
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
		try
		{
			AttendanceViewAction d= new AttendanceViewAction();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
			PreparedStatement ps=con.prepareStatement("select * from demo.attendance where id=?");
			ps.setInt(1, getId());
	
			System.out.println("Id--"+id);		
			
			ResultSet rs=ps.executeQuery(); 
			while(rs.next())
			{  
					     
				   d.setId(rs.getInt(1));
				   d.setPresent(rs.getInt(2));
				   d.setAbsent(rs.getInt(3));
				   list.add(d);  
			}  
			con.close();
			
		}
		catch(Exception e){e.printStackTrace();} 
		return "success";
	}
	
	
}

