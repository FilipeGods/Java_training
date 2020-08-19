
public abstract class Acesso {
	String name;
	
	public Acesso () {
		System.out.println("teste");
	}
	
	public Acesso(String n) {
		setName(n);
	}	
	String getName() {
		return name;
	}
	
	final void setName(String n) {
		name= n;
	}
	
	final void setName(String f, String l) {
		name= f+" "+l;
	}
	
	abstract void teste();
	
	
}
