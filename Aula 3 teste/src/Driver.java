import java.util.Scanner;


public class Driver {
	
	public static void main ( String[] args ) {
		
		Scanner input = new Scanner (System.in);
		
		int num1,num2;
		
		System.out.println("Primeiro Numero: ");
		num1 = input.nextInt();
		
		System.out.println("Segundo Numero: ");
		num2 = input.nextInt();
		
		System.out.printf("Soma: %d",num1+num2);
	}

}

