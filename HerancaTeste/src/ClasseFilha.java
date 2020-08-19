
public class ClasseFilha extends ClasseMae {
	
	private String prof;
	
	public ClasseFilha (String f, String l, int a, String p) {
		
		super(f,l,a);
		setProf(p);
		
	}//fim construtor
	
	public void setProf(String p) {
		prof = p;
	}
	
	public String getProf() {
		return prof;
	}
	
	@Override
	public String getFirstName() {
		return "Ola";
	}

}
