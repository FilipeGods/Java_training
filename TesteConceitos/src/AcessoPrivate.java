
public class AcessoPrivate extends Acesso{
	
	String ssn;

	public AcessoPrivate(String n, String x) {
		super(n,3);
		setSSN(x);
	}
	
	void setSSN(String x) {
		ssn=x;
	}
	
	@Override
	void teste() {}

}


