package Distribuida;

public class InterfaceRunnable implements Runnable {
	private Thread objThread;
	private String nomeThread;
	private int min = 0; 			// inicio da contagem q essa thread esta responsavel
	private int max = 0; 			// fim da contagem q essa thread esta responsavel
	private int numberOfexacts = 0; 

	public InterfaceRunnable(String nm, int min, int max) {
		nomeThread = nm;
		this.min = min;
		this.max = max;
	}

	@Override
	public void run() {
		System.out.printf("Nome: %s, comeca em: %d, termima em: %d\n", nomeThread, min, max);
		numberOfexacts = SquareRoot.howManyExacts(min, max);
	}

	
	public int returnExacts() {
		return numberOfexacts;
	}

}
