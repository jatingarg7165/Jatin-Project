package skilrock.jatin;

import java.sql.*;  
import java.util.ArrayList;  
  
class StudentAtt 
{  
	private int id,present,absent;
	
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
}



public class AttendanceAction 
{  
	ArrayList<StudentAtt> list=new ArrayList<StudentAtt>();  
	  
	public ArrayList<StudentAtt> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<StudentAtt> list) {  
	    this.list = list;  
	}  
	public String execute()
	{  
	 try
	 {  
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
		 PreparedStatement ps=con.prepareStatement("select * from demo.attendance");  
		 ResultSet rs=ps.executeQuery();  
	  
	  while(rs.next())
	  {  
	   StudentAtt st=new StudentAtt();  
	   st.setId(rs.getInt(1));
	   st.setPresent(rs.getInt(2));
	   st.setAbsent(rs.getInt(3));
	   list.add(st);  
	  }  
	  
	  con.close();  
	 }catch(Exception e){e.printStackTrace();}  
	          
	 return "success";  
	}  
}  
