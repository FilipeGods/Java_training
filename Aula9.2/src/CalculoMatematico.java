
public class CalculoMatematico {
	
	public int divisao(int n, int d) {
		try {
			return n/d;
		}
		catch(ArithmeticException e){
			System.out.print("A opera��o n pode ser executada\n");
			return 0;
		}
	}//end metodo divisao

}
