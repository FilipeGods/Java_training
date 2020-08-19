
import javax.swing.*;
import java.awt.*;

public class Test {

	public Test(){
		JFrame f = new JFrame("TEST");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setSize(640, 480);
		
		JPanel p = new JPanel();
		p.setBackground(Color.GRAY);
		
		JTextArea ta = new JTextArea("Default", 5, 20);
		ta.setEditable(true);
		
		JButton increaseB = new JButton();
		JButton decreaseB = new JButton();
		
		//JComboBox font = new JComboBox();
		
		//JCheckBox neg = JCheckBox();
		
		p.add(ta);
		p.add(decreaseB);
		p.add(increaseB);
		//p.add(font);
		//p.add(neg);
		
		f.add(p);
		
	}
	
	public void gui() {
		
		JFrame f = new JFrame("TEST");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setSize(640, 480);
		
		JPanel p = new JPanel();
		p.setBackground(Color.GRAY);
		
		JTextArea ta = new JTextArea("Default", 5, 20);
		ta.setEditable(true);
		
		JButton increaseB = new JButton();
		JButton decreaseB = new JButton();
		
		//JComboBox font = new JComboBox();
		
		//JCheckBox neg = JCheckBox();
		
		p.add(ta);
		p.add(decreaseB);
		p.add(increaseB);
		//p.add(font);
		//p.add(neg);
		
		f.add(p);
		
	}
	
	public static void main(String[]args) {
		 
		new Test();
		
	}
	
}
