import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TicTac extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private static boolean turno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		turno = false;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTac frame = new TicTac();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	JButton btnNewButton = new JButton("");
	JButton btnNewButton_1 = new JButton("");

	public void botones() {
	
	btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(btnNewButton.getText().equals("")) {
					
					JButton command = (JButton)e.getSource();
					if(turno) {
						btnNewButton.setText("0");
						turno =  false;
					}else if(turno = false) {
						btnNewButton.setText("X");
						turno = true;
					}
					
					btnNewButton.setEnabled(false);
					
					
				}
			}
		});
	panel.add(btnNewButton);
	};

	/**
	 * Create the frame.
	 */
	public TicTac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		panel.add(btnNewButton);
		
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		panel.add(btnNewButton_8);
		
		botones();
		
	}

}
