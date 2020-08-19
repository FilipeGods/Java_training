import java.util.Scanner;

public class MaximumFinderTest{

	public static void main(String[]args) {
	
		MaximumFinder teste = new MaximumFinder();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Number 1: ");
		int x = input.nextInt();
		teste.setNumber1(x);
		
		System.out.println("Number 2: ");
		x = input.nextInt();
		teste.setNumber2(x);
		
		System.out.println("Number 3: ");
		x = input.nextInt();
		teste.setNumber3(x);
		
		System.out.printf("Maior numero: %d",teste.maximum());
	
	}
}