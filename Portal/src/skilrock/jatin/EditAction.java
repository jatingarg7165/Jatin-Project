package skilrock.jatin;


public class EditAction 
{
	private String name,email,gender,password,fname,mname,branch,address,mobile;
	private int id;

	public String getName() 
	{
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String number) {
		this.mobile = number;
	}
	
	
	public String execute()
	{
		System.out.println("No--"+mobile);
		System.out.println("Name--"+name);
		System.out.println("Id--"+id);
		System.out.println("e"+email);
		System.out.println("g"+gender);
		System.out.println("p"+password);
		
		 
		int i=EditDB.save(this);
		DetailsAction detail=new DetailsAction();
		detail.execute();
		if(i>0)
		{
			return "success";
		}
		return "error";
	}	

}
