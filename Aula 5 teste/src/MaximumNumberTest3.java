import javax.swing.JOptionPane;

public class MaximumNumberTest3 {

	public static void main (String[]args) {
		
		/*String message = JOptionPane.showInputDialog("Number 1: ");
		num1 = Integer.parseInt(message);
		
		message = JOptionPane.showInputDialog("Number 2: ");
		num2 = Integer.parseInt(message);
		
		message = JOptionPane.showInputDialog("Number 3: ");
		num3 = Integer.parseInt(message);*/
		
		MaximumNumber3 teste = new MaximumNumber3(7,5,6);
		teste.maximum();
		MaximumNumber3 teste1 = new MaximumNumber3(12,6,89);
		teste1.maximum();
		MaximumNumber3 teste2 = new MaximumNumber3(13,100,6);
		teste2.maximum();
		MaximumNumber3 teste3 = new MaximumNumber3(0,0,0);
		teste3.maximum();
		
	}
}
