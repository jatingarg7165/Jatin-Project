package skilrock.jatin;
import java.sql.*;  
import java.util.ArrayList;  
  
class Student 
{  
	private int id;
	private String name,fname,mname,branch,add,email,gender,number,password;;
	
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



public class AllStudentDetailsAction 
{  
	ArrayList<Student> list=new ArrayList<Student>();  
	  
	public ArrayList<Student> getList() {  
	    return list;  
	}  
	public void setList(ArrayList<Student> list) {  
	    this.list = list;  
	}  
	public String execute()
	{  
	 try
	 {  
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","jatin","jatin");
		 PreparedStatement ps=con.prepareStatement("select * from demo.register");  
		 ResultSet rs=ps.executeQuery();  
	  
	  while(rs.next())
	  {  
	   Student st=new Student();  
	   st.setId(rs.getInt(1));  
	   st.setName(rs.getString(2));  
	   st.setFname(rs.getString(3));
	   st.setMname(rs.getString(4));
	   st.setBranch(rs.getString(5));
	   st.setAdd(rs.getString(6));
	   st.setNumber(rs.getString(7));
	   st.setEmail(rs.getString(8));
	   st.setGender(rs.getString(9));
	   st.setPassword(rs.getString(10));  
	 
	   list.add(st);  
	  }  
	  
	  con.close();  
	 }catch(Exception e){e.printStackTrace();}  
	          
	 return "success";  
	}  
}  
