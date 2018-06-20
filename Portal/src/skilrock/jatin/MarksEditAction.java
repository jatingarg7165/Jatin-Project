package skilrock.jatin;

import java.util.ArrayList;

public class MarksEditAction 
{
	private int id,physics,chemistry,maths,english,hindi;
	ArrayList<MarksEditAction> list=new ArrayList<MarksEditAction>();
	public ArrayList<MarksEditAction> getList() {
		return list;
	}

	public void setList(ArrayList<MarksEditAction> list) {
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
		System.out.println("phy--"+physics);
		System.out.println("che--"+chemistry);
		System.out.println("Id--"+id);
				 
		int i=MarksEditDB.save(this);
		MarksViewAction m=new MarksViewAction();
		m.execute();
		if(i>0)
		{
			return "success";
		}
		return "error";
	}	

}
