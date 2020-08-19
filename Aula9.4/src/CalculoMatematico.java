
public class CalculoMatematico {
	
	public int divisao(int n, int d) throws DivisorZeroException{
		if(d==0)
			throw new DivisorZeroException();
		return n/d;
	}//end metodo divisao

}
