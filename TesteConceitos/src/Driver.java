import java.lang.*;
public class Driver {
	public static void main( String[]args ) {
		AcessoPrivate teste = new AcessoPrivate("Joao","333");
		System.out.println(teste.getName());
		
		
		teste.setName("Pedro", "Henrique");
		System.out.println(teste.getName());
		
		teste.setName("Tiago");
		System.out.println(teste.getName());
		
		Acesso teste2 = new AcessoPrivate("jorge","444");
			
		if(teste2 instanceof Acesso)
			teste2 = teste;
		
		System.out.println(teste2.getName());
	}
}