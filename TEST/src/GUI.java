import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
	

	private JPanel p;
	private JButton ib;
	private JButton db;
	private JTextArea ta;
	private Font componentsFont, textFont;
	private JCheckBox checkB;
	private JComboBox comboB;
	private String[] Fonts = {"Serif","SansSerif","Monospaced"};
	
	public GUI() {
	
		setSize(680, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Teste");
		
		p = new JPanel();
		p.setBackground(new Color(175, 175, 175));
		p.setLayout(null);
		
		componentsFont = new Font("serif", Font.BOLD, 20);
		
		ib = new JButton("+");
		ib.setFont(componentsFont);
		ib.addActionListener(this);
		db = new JButton("-");
		db.setFont(componentsFont);
		db.addActionListener(this);
		
		textFont = new Font ("Serif", Font.ROMAN_BASELINE, 18);
		
		ta = new JTextArea("Default",10, 20);
		ta.setFont(textFont);
		ta.setLineWrap(true);
		
		
		checkB = new JCheckBox("Negrito");
		checkB.addActionListener(this);
		
		comboB = new JComboBox(Fonts);
		comboB.addActionListener(this);
		
		
		p.add(ta);
		ta.setBounds(30,50,600,300);
		p.add(ib);
		ib.setBounds(30, 360, 50, 30);
		p.add(db);
		db.setBounds(80, 360, 50, 30);
		p.add(checkB);
		checkB.setBounds(150, 360, 70, 30);
		add(p);
		p.add(comboB);
		comboB.setBounds(240, 360, 70, 30);
	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ib) {
			
			Font f = ta.getFont();
			Font f2 = new Font(f.getFontName(), f.getStyle(), f.getSize()+1);
			ta.setFont(f2);

		}
		else if(e.getSource() == db) {
			
			Font f = ta.getFont();
			Font f2 = new Font(f.getFontName(), f.getStyle(), f.getSize()-1);
			ta.setFont(f2);
			
		} 
		if(e.getSource()==checkB) {
			if(checkB.isSelected()) {
			
				Font f = ta.getFont();
				Font f2 = new Font(f.getFontName(), Font.BOLD, f.getSize());
				ta.setFont(f2);
			
			}else {
			
				Font f = ta.getFont();
				Font f2 = new Font(f.getFontName(), Font.CENTER_BASELINE, f.getSize());
				ta.setFont(f2);
			
			}
		}
		
		if(e.getSource()==comboB) {
			
			String combo=(String)comboB.getSelectedItem();
			
			if(combo == "Serif") {
	
				Font f = ta.getFont();
				Font f2 = new Font("Serif", f.getStyle(), f.getSize());
				ta.setFont(f2);
				
			}
			else if(combo == "SansSerif") {
				
				Font f = ta.getFont();
				Font f2 = new Font("SansSerif", f.getStyle(), f.getSize());
				ta.setFont(f2);
				
			}
			else {
				
				Font f = ta.getFont();
				Font f2 = new Font("Monospaced", f.getStyle(), f.getSize());
				ta.setFont(f2);
				
			}
				
			
		}
		
		
	}
}
	
