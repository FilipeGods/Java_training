package Distribuida;

public class SquareRoot {
	static public int howManyExacts(int min, int max) {
		int numberOfExacts = 0; // contador de numeros que possuem raiz quadrada exata
		for (int i = min; i < max; i++) {
			if (SquareRoot.isSquareRootExact(i)) // se for verdadeiro incrementa o total de numeros com raiz exata encontrados
				numberOfExacts++;
		}
		return numberOfExacts;
	}
	
	
	static public boolean isSquareRootExact(int i) {
		if (Math.sqrt(i) % 1 == 0) // determina se o numero possui casas decimais ou nao
			return true; // caso nao possua casas decimais, i e um numero q possui raiz quadrada exata
		else 
			return false; // caso possua casas decimais, i nao possui raiz quadrada exata

	}
}
