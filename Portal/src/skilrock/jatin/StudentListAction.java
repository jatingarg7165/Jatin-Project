package skilrock.jatin;
import java.sql.*;  
import java.util.ArrayList;  
  
class User 
{  
	private int id;  
	private String name;  
  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}



public class StudentListAction 
{  
	ArrayList<User> list=new ArrayList<User>();  
	  
	public ArrayList<User> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<User> list) {  
	    this.list = list;  
	}  
	public String execute()
	{  
	 try
	 {  
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
		 PreparedStatement ps=con.prepareStatement("select id,name from demo.register");  
		 ResultSet rs=ps.executeQuery();  
	  
	  while(rs.next())
	  {  
	   User user=new User();  
	   user.setId(rs.getInt(1));  
	   user.setName(rs.getString(2));    
	   list.add(user);  
	  }  
	  
	  con.close();  
	 }catch(Exception e){e.printStackTrace();}  
	          
	 return "success";  
	}  
}  
