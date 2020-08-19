import javax.swing.JOptionPane;

public class GradeBookTest1 {
	
	public static void main (String[]args) {
		
		GradeBook1 gradeBook = new GradeBook1();
		
		String message = 
				String.format("%s",gradeBook.getMessege());
		
		JOptionPane.showMessageDialog(null,message);
		
	}

}
