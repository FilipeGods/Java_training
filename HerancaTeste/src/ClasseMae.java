
public class ClasseMae {
	
	private String fName,lName;
	private int age;
	
	public ClasseMae(String first, String last, int a) {
		
		fName = first;
		lName = last;
		setAge(a);
		
	}//fim construtor
	
	public void setFirstName (String f) {
		fName = f;
	}
	
	public String getFirstName () {
		return fName;
	}
	
	public void setLastName(String l) {
		lName = l;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
}
