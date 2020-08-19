import javax.swing.JOptionPane;

public class GradeBookTest2 {
	
	public static void main (String[] args ) {
		
		GradeBook2 gradebook2 = new GradeBook2("Course: Computer Science");
		
		String message = 
				String.format("%s",gradebook2.getCourseName());
		
		JOptionPane.showMessageDialog(null,message);
		
		String courseName = JOptionPane.showInputDialog("Qual seu curso?");
		
		gradebook2.setCourseName(courseName);
		
		message = 
				String.format("%s", gradebook2.getCourseName());
		
		JOptionPane.showMessageDialog(null,message);
		
	}
	
}
