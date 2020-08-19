import java.util.Random;
import javax.swing.JOptionPane;

public class RandomIntegers1 {
	
	public static void main(String[] args) {
		
		Random dice = new Random();
		
		 int face=0;
		
		String message = 
				String.format("%d  ", face);
		
		for(int counter=1; counter == 15;counter++) {
			
			face= 1+dice.nextInt(6);
			
			JOptionPane.showMessageDialog(null, message);
		
		}
		
	}
}
