import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;


public class Clayout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clayout window = new Clayout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Clayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnItem = new JRadioButton("item1");
		rdbtnItem.setBounds(19, 19, 109, 23);
		frame.getContentPane().add(rdbtnItem);
		
		JRadioButton rdbtnItem_1 = new JRadioButton("item2");
		rdbtnItem_1.setBounds(19, 60, 109, 23);
		frame.getContentPane().add(rdbtnItem_1);
		
		JRadioButton rdbtnItem_2 = new JRadioButton("item3");
		rdbtnItem_2.setBounds(19, 98, 109, 23);
		frame.getContentPane().add(rdbtnItem_2);
	}
}
