package ch.fhnw.mas.PHTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 
 * @author Philipp und Tobias
 * MASAM A-SWE
 */
public class Gui extends JFrame {
	/**
	 * variable declarations
	 */
	private JTextField input = new JTextField(5);
	private JTextField output = new JTextField(5);
	private JButton calculateButton = new JButton("Calculate");
	
	public Gui() {
		super("Faculty Calculator");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel();
		pane.add(input);
		pane.add(calculateButton);
		pane.add(output);
		this.getContentPane().add(pane);
		
		calculateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int inputValue = Integer.parseInt(input.getText());
				long result = MathUtil.faculty(inputValue);
				output.setText(Long.toString(result));
			}
		});
	/**
	 * size of the frame	
	 */
		this.setSize(300, 80);
		this.setVisible(true);
	}
	
	public static void main(String [] args) {
		new Gui();
	}
	
}
