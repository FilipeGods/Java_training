
public class DriverTest {
	
	public static void main(String[]args) {
		
		CalculoMatematico teste = new CalculoMatematico();
		try {
			System.out.println(teste.divisao(4,0));
		}
		catch(DivisorZeroException e) {
			System.out.println(e.getMessage());
		}
	}//end main

}
