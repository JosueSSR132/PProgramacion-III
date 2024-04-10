import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;

public class PuzzleNumbers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton botones [][] = new JButton[4][4];
	private JLabel lblNewLabel_1;

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
		panel.setBackground(new Color(0, 0, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Rompecabezas numerico");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
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
	        botones[j][i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 JButton botonPresionado = (JButton) e.getSource();

					    int filaPresionada = -1;
					    int columnaPresionada = -1;
					    for (int i = 0; i < 4; i++) {
					        for (int j = 0; j < 4; j++) {
					            if (botones[i][j] == botonPresionado) {
					                filaPresionada = i;
					                columnaPresionada = j;
					                break;
					            }
					        }
					    }
					    
					    if (filaPresionada > 0 && botones[filaPresionada - 1][columnaPresionada].getText().equals("")) {
					        botones[filaPresionada - 1][columnaPresionada].setText(botonPresionado.getText());
					        botonPresionado.setText("");
					        
					    }

					    if (filaPresionada < 3 && botones[filaPresionada + 1][columnaPresionada].getText().equals("")) {
					        botones[filaPresionada + 1][columnaPresionada].setText(botonPresionado.getText());
					        botonPresionado.setText("");
					        
					    }

					    if (columnaPresionada > 0 && botones[filaPresionada][columnaPresionada - 1].getText().equals("")) {
					        botones[filaPresionada][columnaPresionada - 1].setText(botonPresionado.getText());
					        botonPresionado.setText("");
					        
					    }

					    if (columnaPresionada < 3 && botones[filaPresionada][columnaPresionada + 1].getText().equals("")) {
					        botones[filaPresionada][columnaPresionada + 1].setText(botonPresionado.getText());
					        botonPresionado.setText("");
					        
					    }
					    ganar();
				}
	        	
	        });
	        panel_2.add(botones[j][i]);
	      
	        }
		}
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		panel_3.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_3, BorderLayout.EAST);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1);
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_4, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciarJuego();
            }
        });
		panel_4.add(btnNewButton);
	}
	
		
	
	private void reiniciarJuego() {
	    Random rand = new Random();
	    for (int i = 0; i < 100; i++) {
	        int fila1 = rand.nextInt(4);
	        int columna1 = rand.nextInt(4);
	        int fila2 = rand.nextInt(4);
	        int columna2 = rand.nextInt(4);
	        String texto = botones[fila1][columna1].getText();
	        botones[fila1][columna1].setText(botones[fila2][columna2].getText());
	        botones[fila2][columna2].setText(texto);
	    }
	}
	
	public void ganar() {
		boolean ganar = false;
		
		if (botones[0][0].getText().equals("1") && botones[0][1].getText().equals("2") && botones[0][2].getText().equals("3") && botones[0][3].getText().equals("4") &&
		     botones[1][0].getText().equals("5") && botones[1][1].getText().equals("6") && botones[1][2].getText().equals("7") && botones[1][3].getText().equals("8") &&
		     botones[2][0].getText().equals("9") && botones[2][1].getText().equals("10") && botones[2][2].getText().equals("11") && botones[2][3].getText().equals("12") &&
		     botones[3][0].getText().equals("13") && botones[3][1].getText().equals("14") && botones[3][2].getText().equals("15") && botones[3][3].getText().equals("")) {
		     ganar = true;
		}

		if (ganar) {
		     JOptionPane.showMessageDialog(this, "¡Felicidades, has ganado!");
		     reiniciarJuego();
	    }
	}

}
