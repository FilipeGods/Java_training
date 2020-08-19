import javax.swing.JOptionPane;

public class MaximumNumber3 {
	
	private int num1,num2,num3;
	
	public MaximumNumber3(int num1,int num2,int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public void maximum() {
		int maximumNumber = num1;
		
		if(num2>maximumNumber)
			maximumNumber = num2;
		else
			if(num3>maximumNumber)
				maximumNumber = num3;
		
		String message = 
				String.format("Maximum number is: %d", maximumNumber);
		JOptionPane.showMessageDialog(null, message);
	}
}
