package skilrock.jatin;
import java.sql.*;  
import java.util.ArrayList;  
  
class Stud 
{  
	private int id,physics,chemistry,maths,english,hindi;
	
	
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

public class AllStudentMarksAction 
{  
	ArrayList<Stud> list=new ArrayList<Stud>();  
	  
	public ArrayList<Stud> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<Stud> list) {  
	    this.list = list;  
	}  
	public String execute()
	{  
	 try
	 {  
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
		 PreparedStatement ps=con.prepareStatement("select * from demo.marks");  
		 ResultSet rs=ps.executeQuery();  
	  
	  while(rs.next())
	  {  
	   Stud st=new Stud();  
	   st.setId(rs.getInt(1));    
	   st.setPhysics(rs.getInt(2));
	   st.setChemistry(rs.getInt(3));
	   st.setMaths(rs.getInt(4));
	   st.setEnglish(rs.getInt(5));
	   st.setHindi(rs.getInt(6));
	   
	   list.add(st);  
	  }  
	  
	  con.close();  
	 }catch(Exception e){e.printStackTrace();}  
	          
	 return "success";  
	}  
}  
