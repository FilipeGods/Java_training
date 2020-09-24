package Distribuida;

public class Main {
		public static void main(String[] args) {
			System.out.println("---OPERACAO UTLIZANDO THREADS---\n");
			
			Stopwatch timer_01 = new Stopwatch(); 
			int totalExacts = 0;
			InterfaceRunnable thread_01 = new InterfaceRunnable("Thread_01", 0, 3000000);
			thread_01.run();
			totalExacts += thread_01.returnExacts();
			
			InterfaceRunnable thread_02 = new InterfaceRunnable("Thread_02", 3000000, 6000000);
			thread_02.run();
			totalExacts += thread_02.returnExacts();
				

			System.out.printf("Numero de raiz quadradas exatas entre 0 e 20000: %d\n", totalExacts);
			System.out.printf("Tempo consumido: %.5f segundos\n", timer_01.elapsedTime());
			
			System.out.println("\n\n---OPERACAO SEM UTILIZACAO DE THREADS---\n");
			
			Stopwatch timer_02 = new Stopwatch(); 
			
			System.out.printf("Numero de raiz quadradas exatas entre 0 e 20000: %d\n", SquareRoot.howManyExacts(0, 6000000));
			System.out.printf("Tempo consumido: %.5f segundos\n", timer_02.elapsedTime());
			
			
			
		}
}
