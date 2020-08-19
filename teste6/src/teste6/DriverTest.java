package teste6;
import javax.swing.*;
import java.awt.*;

public class DriverTest {
	
	public DriverTest() {
		gui();
	}
	
	public void gui() {
		JFrame f = new JFrame();
		f.setSize(680,480);
		f.setTitle("This is a TEST");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		JPanel p = new JPanel();
		p.setBackground(Color.DARK_GRAY);
		
		JButton ifs = new JButton("<");
		JButton dfs = new JButton(">");
		
		JTextArea ta = new JTextArea("Default", 5, 20);
		
		p.add(ta);
		p.add(ifs);
		p.add(dfs);
		
		f.add(p);
	}
	
	public static void main(String[]args) {
		
		new DriverTest();

	} 
}
