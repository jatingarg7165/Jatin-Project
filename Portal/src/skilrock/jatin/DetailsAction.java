package skilrock.jatin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DetailsAction 
{
	private int id;
	private String name,fname,mname,branch,add,email,gender,number,password;;
	ArrayList<DetailsAction> list=new ArrayList<DetailsAction>();  
	
	public ArrayList<DetailsAction> getList() {
		return list;
	}
	public void setList(ArrayList<DetailsAction> list) {
		this.list = list;
	}
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String execute()
	{
		try
		{
			DetailsAction d= new DetailsAction();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
			PreparedStatement ps=con.prepareStatement("select * from demo.register where id=?");
			ps.setInt(1, getId());
			System.out.println("Id--"+getId());
			System.out.println("Name--"+d.name);
			System.out.println("Id--"+id);
			System.out.println("e"+email);
			System.out.println("g"+gender);
			
			
			ResultSet rs=ps.executeQuery(); 
			while(rs.next())
			{  
					setId(rs.getInt(1));  
				   setName(rs.getString(2));
				   setFname(rs.getString(3));
				   setMname(rs.getString(4));
				   setBranch(rs.getString(5));
				   setAdd(rs.getString(6));
				   setNumber(rs.getString(7));
				   setEmail(rs.getString(8));
				   setGender(rs.getString(9));
				   setPassword(rs.getString(10));  
				     
				   d.setId(rs.getInt(1));  
				   d.setName(rs.getString(2));
				   d.setFname(rs.getString(3));
				   d.setMname(rs.getString(4));
				   d.setBranch(rs.getString(5));
				   d.setAdd(rs.getString(6));
				   d.setNumber(rs.getString(7));
				   d.setEmail(rs.getString(8));
				   d.setGender(rs.getString(9));
				   d.setPassword(rs.getString(10));  
				   list.add(d);  
			}  
			con.close();
			
		}
		catch(Exception e){e.printStackTrace();} 
		return "success";
	}
	
	
}