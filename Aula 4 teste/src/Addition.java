// Addition.java
// Addition program that displays the sum of two numbers.
import javax.swing.JOptionPane; 

public class Addition
{
   // main method begins execution of Java application
   public static void main( String[] args )
   {
      
	  String num1 = JOptionPane.showInputDialog("What's number 1?"); 
	  
	  String num2 = JOptionPane.showInputDialog("What's number 2?"); 
	  
	  int numb1 = Integer.parseInt(num1);
	  
	  int numb2 = Integer.parseInt(num2);
	  
	  int sum = numb1 + numb2;
	  
	  String message = 
			  String.format("Soma: %d ",sum);
	  
	  JOptionPane.showMessageDialog(null, message);

     
   } // end method main
} // end class Addition

