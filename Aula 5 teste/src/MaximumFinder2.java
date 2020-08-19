import javax.swing.JOptionPane;

public class MaximumFinder2 {
	
	private int num1,num2,num3;
	
	public void setNumbers() {
		
		//sets number 1
		String message = JOptionPane.showInputDialog("Number 1: ");
		num1 = Integer.parseInt(message);
		
		//sets Number 2
		message = JOptionPane.showInputDialog("Number 2: ");
		num2 = Integer.parseInt(message);
		
		//sets Number 3
		message = JOptionPane.showInputDialog("Number 3: ");
		num3 = Integer.parseInt(message);
		
	}
	
	public void Maximum() {
		int maximumNumber=num1;
		
		if(num2>maximumNumber)
			maximumNumber = num2;
		else
			if(num3>maximumNumber)
				maximumNumber = num3;
		
		String message = 
				String.format("Maximum Number is: %d", maximumNumber);
		JOptionPane.showMessageDialog(null, message);
	}
}
