package skilrock.jatin;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport
{
	private static final long serialVersionUID = 6973465299446114035L;

private String name,email,gender,password,con_password,fname,mname,branch,address,number;
private int id;

public String getName() {
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
public String getCon_password() {
	return con_password;
}

public void setCon_password(String con_password) {
	this.con_password = con_password;
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

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}
public String execute()
{
	System.out.println("No--"+number);
	System.out.println("Name--"+name);
	System.out.println("Id--"+id);
	System.out.println("e"+email);
	System.out.println("g"+gender);
	System.out.println("p"+password);
	System.out.println("c"+con_password);
	int j=RegisterAttendDB.add(this);
	System.out.println("j---"+j);
	int i=RegisterDB.save(this);
	if(i>0)
	{
		return "success";
	}
	return "error";
}

public void validate() 
{
    if (name == null || name.trim().equals("")) 
    {
       addFieldError("name","Name is required");
    }
    if (fname == null || fname.trim().equals("")) 
    {
       addFieldError("fname","Father's Name is required");
    }
    if (mname == null || mname.trim().equals("")) 
    {
       addFieldError("mname","Mother's Name is required");
    }
    if (id==0) 
    {
       addFieldError("id"," Enter Valid Student Id");
    }
    if (!(number.matches("\\d{10}"))) 
    {
       addFieldError("number"," Enter Valid Mobile Number");
    }
    if(!(email.endsWith(".com"))) 
    {
       addFieldError("email"," Enter Valid Email Id");
    }
    if (branch.contentEquals("Select")) 
    {
       addFieldError("branch","Select Branch");
    }
    if (gender == null || gender.trim().equals("")) 
    {
       addFieldError("gender","Gender is required");
    }
    if (password == null || password.trim().equals("")) 
    {
       addFieldError("password","Password is required");
    }
    if (con_password == null || con_password.trim().equals("")) 
    {
       addFieldError("con_password","this is required");
    }
    if (!(password.contentEquals(con_password))) 
    {
       addFieldError("con_password","Password must be same");
    }
 }


}
