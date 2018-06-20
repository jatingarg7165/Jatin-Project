package skilrock.jatin;
import com.opensymphony.xwork2.ActionSupport;

public class AddStudentMarksAction extends ActionSupport
{
	private static final long serialVersionUID = 6973465299446114035L;

	
	private int id,physics,chemistry,maths,english,hindi;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) 
	{
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
		
		
		System.out.println("Id--"+id);
		
		int i=AddStudentMarksDB.save(this);
		if(i>0)
		{
			return "success";
		}
		return "error";
	}

public void validate() 
{
    
    if (id==0) 
    {
       addFieldError("id"," Enter Valid Student Id");
    }
 }


}

