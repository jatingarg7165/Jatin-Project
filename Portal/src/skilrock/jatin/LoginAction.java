package skilrock.jatin;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;


public class LoginAction implements SessionAware 
{

	
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
	    if(LoginDB.validate(id, password))
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
	
	
}
