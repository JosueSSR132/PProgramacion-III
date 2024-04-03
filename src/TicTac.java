import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JButton btnNewButton;
	private JButton btnNewButton1;
    private JButton btnNewButton_2;
    private JButton btnNewButton_3;
    private JButton btnNewButton_4;
    private JButton btnNewButton_5;
    private JButton btnNewButton_6;
    private JButton btnNewButton_7;
    private JButton btnNewButton_8;

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

	public void botones(JButton Btn) {
		
	JButton botonPresionado = new JButton("");
	
	botonPresionado.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton botonPresionado = (JButton)e.getSource();
				
				if(botonPresionado.getText().equals("")) {
					if(turno) {
						botonPresionado.setText("0");
						turno =  false;
					}else if(turno = false) {
						botonPresionado.setText("X");
						turno = true;
					}
					
					botonPresionado.setEnabled(false);
					
					
				}
			}
		});
	};
	
	private void handleButtonClick(JButton clickedButton) {
        if (clickedButton.getText().equals("")) { // Verifica si el botón está vacío
            if (turno) {
                clickedButton.setText("O"); // Establece "O" en el botón
                turno = false; // Cambia el turno
            } else {
                clickedButton.setText("X"); // Establece "X" en el botón
                turno = true; // Cambia el turno
            }
            
            clickedButton.setEnabled(false);
            checkWinner();
        }
    }

	/**
	 * Create the frame.
	 */
	public TicTac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelN = new JPanel();
		panelN.setBackground(new Color(0, 128, 255));
		contentPane.add(panelN, BorderLayout.NORTH);
		panelN.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 128, 255));
		panelN.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("X:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		panel_3.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 128, 255));
		panelN.add(panel_4);
		
		JLabel lblNewLabel_1 = new JLabel("O:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		panel_4.add(lblNewLabel_1);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 10, 10));
		
		
		btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(btnNewButton);
            }
        });
        panel.add(btnNewButton);
		
		
        btnNewButton1 = new JButton("");
		btnNewButton1.setBackground(new Color(255, 255, 255));
        btnNewButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(btnNewButton1);
            }
        });
        panel.add(btnNewButton1);
		
        btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(btnNewButton_2);
            }
        });
        panel.add(btnNewButton_2);
		
        btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(btnNewButton_3);
            }
        });
        panel.add(btnNewButton_3);
		
        btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(btnNewButton_4);
            }
        });
        panel.add(btnNewButton_4);
		
        btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(btnNewButton_5);
            }
        });
        panel.add(btnNewButton_5);
		
        btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(btnNewButton_6);
            }
        });
        panel.add(btnNewButton_6);
		
        btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(btnNewButton_7);
            }
        });
        panel.add(btnNewButton_7);
		
        btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(btnNewButton_8);
            }
        });
        panel.add(btnNewButton_8);
        
        JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 0));
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setFont(new Font("Arial", Font.BOLD, 15));
		btnReiniciar.setBackground(new Color(255, 255, 255));
		panel_2.add(btnReiniciar);
		
		
		
		
		/*for (int i = 0; i < 9; i++) { // Inicializa y agrega botones al panel
            buttons[i] = new JButton("");
            buttons[i].addActionListener(new ButtonListener()); // Agrega el mismo ActionListener a cada botón
            panel.add(buttons[i]);
        }*/
		
		
		
		
		
		
	}
	
	
	private void checkWinner() {
        //String winner = "";
        boolean ganar = false;

        if (btnNewButton.getText().equals(btnNewButton1.getText()) && 
                btnNewButton.getText().equals(btnNewButton_2.getText()) && 
                !btnNewButton.getText().equals("")) {
                //winner = btnNewButton.getText();
        	    ganar = true;
            } else if (btnNewButton_3.getText().equals(btnNewButton_4.getText()) && 
                       btnNewButton_3.getText().equals(btnNewButton_5.getText()) && 
                       !btnNewButton_3.getText().equals("")) {
                //winner = btnNewButton_3.getText();
            	ganar = true;
            } else if (btnNewButton_6.getText().equals(btnNewButton_7.getText()) && 
                       btnNewButton_6.getText().equals(btnNewButton_8.getText()) && 
                       !btnNewButton_6.getText().equals("")) {
                //winner = btnNewButton_6.getText();
            	ganar = true;
            }

            // Check columns
            if (btnNewButton.getText().equals(btnNewButton_3.getText()) && 
                btnNewButton.getText().equals(btnNewButton_6.getText()) && 
                !btnNewButton.getText().equals("")) {
                //winner = btnNewButton.getText();
            	ganar = true;
            } else if (btnNewButton1.getText().equals(btnNewButton_4.getText()) && 
                       btnNewButton1.getText().equals(btnNewButton_7.getText()) && 
                       !btnNewButton1.getText().equals("")) {
               // winner = btnNewButton1.getText();
            	ganar = true;
            } else if (btnNewButton_2.getText().equals(btnNewButton_5.getText()) && 
                       btnNewButton_2.getText().equals(btnNewButton_8.getText()) && 
                       !btnNewButton_2.getText().equals("")) {
                //winner = btnNewButton_2.getText();
            	ganar = true;
            }

            // Check diagonals
            if (btnNewButton.getText().equals(btnNewButton_4.getText()) && 
                btnNewButton.getText().equals(btnNewButton_8.getText()) && 
                !btnNewButton.getText().equals("")) {
                //winner = btnNewButton.getText();
            	ganar = true;
            } else if (btnNewButton_2.getText().equals(btnNewButton_4.getText()) && 
                       btnNewButton_2.getText().equals(btnNewButton_6.getText()) && 
                       !btnNewButton_2.getText().equals("")) {
                //winner = btnNewButton_2.getText();
            	ganar = true;
            }

        /*if (!winner.equals("")) {
            if (winner.equals("X")) {
                JOptionPane.showMessageDialog(this, "¡Jugador 1 ha ganado!");
            } else {
                JOptionPane.showMessageDialog(this, "¡Jugador 2 ha ganado!");
            }
        }*/
            
            if (ganar) {
                if (turno) {
                    JOptionPane.showMessageDialog(this, "¡Jugador X ha ganado!");
                } else {
                    JOptionPane.showMessageDialog(this, "¡Jugador O ha ganado!");
                }
            }
        
	}
	
	
	
	
	/*private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource(); // Obtiene el botón que ha desencadenado el evento
            if (clickedButton.getText().equals("")) { // Verifica si el botón está vacío
                if (turno) {
                    clickedButton.setText("O"); // Establece "O" en el botón
                    turno = false; // Cambia el turno
                } else {
                    clickedButton.setText("X"); // Establece "X" en el botón
                    turno = true; // Cambia el turno
                }
            }
        }
    }*/

	
	
	
	//null, null, true set icon, text, enable
}
