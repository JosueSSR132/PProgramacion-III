import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;

public class PuzzleNumbers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton botones [][] = new JButton[4][4];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PuzzleNumbers frame = new PuzzleNumbers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PuzzleNumbers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		contentPane.add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 0));
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(4, 4, 10, 10));
		
		String botonesTexto[][] = {{"", "8", "9", "6"},
				   {"5", "7", "14", "12"}, 
				   {"4", "1", "11", "2"},
				   {"15", "10", "13", "3"}};
		
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
	        botones[j][i] = new JButton(botonesTexto[j][i]);
	        panel_2.add(botones[j][i]);
	        }
		}
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 0));
		contentPane.add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 0));
		contentPane.add(panel_4, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 255, 255));
		panel_4.add(btnNewButton);
	}

}
