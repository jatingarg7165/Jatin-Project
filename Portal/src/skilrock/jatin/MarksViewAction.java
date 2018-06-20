package skilrock.jatin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class MarksViewAction 
{
	private int id,physics,chemistry,maths,english,hindi;
	
	ArrayList<MarksViewAction> list=new ArrayList<MarksViewAction>();  
	
	public ArrayList<MarksViewAction> getList() {
		return list;
	}
	public void setList(ArrayList<MarksViewAction> list) {
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
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
	public String execute()
	{
		try
		{
			MarksViewAction d= new MarksViewAction();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
			PreparedStatement ps=con.prepareStatement("select * from demo.marks where id=?");
			ps.setInt(1, getId());
	
			System.out.println("Id--"+id);		
			
			ResultSet rs=ps.executeQuery(); 
			while(rs.next())
			{  
					     
				   d.setId(rs.getInt(1));
				   d.setPhysics(rs.getInt(2));  
				   d.setChemistry(rs.getInt(3));  
				   d.setMaths(rs.getInt(4));  
				   d.setEnglish(rs.getInt(5));
				   d.setHindi(rs.getInt(1));  
				   
				   list.add(d);  
			}  
			con.close();
			
		}
		catch(Exception e){e.printStackTrace();} 
		return "success";
	}
	
	
}

