package skilrock.jatin;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class ALoginAction extends ActionSupport implements SessionAware 
{

	private static final long serialVersionUID = 1L;
	private String password;
	private int id;
	SessionMap<String, String> sessionmap;  
	
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

	
	public String execute()
	{  
	    if(ALoginDB.validate(id, password))
	    {  
	        return "success";  
	    }  
	    else
	    {  
	        return "error";  
	    }  
	}

	@Override
	public void setSession(Map map) 
	{
		sessionmap=(SessionMap)map;
		sessionmap.put("login", "true");
		
	}
	
	public String logout()
	{  
	    sessionmap.invalidate();  
	    return "success";  
	}  
	
	public void validate() 
	{
	    if (id == 0) 
	    {
	       addFieldError("id","Id is required");
	    }
	    if (password == null || password.trim().equals("")) 
	    {
	       addFieldError("password","Password is required");
	    }
	}
}
