import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;

public class TableroDeDibujo extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JPanel panel = new JPanel();
	 Jugador jugador, obstaculo1, obstaculo2, obstaculo3;
	 Jugador obstaculo [] = {
			 				new Jugador(5, 0, 25, 752, "#010101"),
			 				new Jugador(20, 30, 775, 25, "#010101"),
			 				new Jugador(20, 725, 775, 27, "#010101"),
			 				new Jugador(770, 0, 25, 752, "#010101"),
			 				new Jugador(20, 75, 70, 20, "#010101"),
			 				new Jugador(130, 55, 20, 100, "#010101"),
			 				new Jugador(90, 75, 20, 120, "#010101"),
			 				new Jugador(30, 115, 40, 20, "#010101"),
			 				new Jugador(170, 75, 90, 20, "#010101"),
			 				new Jugador(170, 115, 90, 20, "#010101"),
			 				new Jugador(260, 55, 20, 40, "#010101"),
			 				new Jugador(50, 155, 20, 70, "#010101"),
			 				new Jugador(90, 215, 20, 60, "#010101"),
			 				new Jugador(50, 235, 40, 20, "#010101"),
			 				new Jugador(90, 205, 40, 20, "#010101"),
			 				new Jugador(130, 185, 20, 80, "#010101"),
			 				new Jugador(110, 255, 20, 20, "#010101"),
			 				new Jugador(130, 155, 40, 20, "#010101"),
			 				//new Jugador(110, 55, 20, 70, "#010101")
			 				};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroDeDibujo frame = new TableroDeDibujo();
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
	public TableroDeDibujo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setFocusable(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		this.addKeyListener(this);
		tablero(this);
		
		 jugador = new Jugador(210, 185, 20, 20, "#035ab9");
		 
	}
	
	public void tablero(JFrame frame) {
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 0));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		panel_1.add(btnNewButton);
		
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D graficos2d = (Graphics2D) g;
		
		jugador.dibujar(graficos2d);
		
		for(Jugador obstaculo : obstaculo) {
			
	        graficos2d.setColor(Color.decode(obstaculo.color));
	        graficos2d.fillRect(obstaculo.x, obstaculo.y, obstaculo.largo, obstaculo.altura);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 //System.out.println("Código de tecla presionada: " + e.getKeyCode());
		int der = 0;
		 
		 switch(e.getKeyCode()) {
			 case 87:
				 jugador.y-=10;
				 der = 1;
				 break;
			 case 83:
				 jugador.y+=10;
				 der = 2;
				 break;
			 case 68:
				 jugador.x+=10;
				 der = 3;
				 break;
			 case 65:
				 jugador.x-=10;
				 der = 4;
				 break;
			 default:
				 break;
		 }
		 
		 for(Jugador obstaculo : this.obstaculo) {
			 
		 
		 if (jugador.colisiona(obstaculo)) {
		        System.out.println("Colisión detectada");
		        
		        if(der == 1) {
		        	jugador.y+=10;
		        }
		        
		        if(der == 2) {
		        	jugador.y-=10;
		        }
		        
		        if(der == 3) {
		        	jugador.x-=10;
		        }
		        
		        if(der == 4) {
		        	jugador.x+=10;
		        }

		    }
		 
		 }
		 
		 this.update(getGraphics());
		 //getContentPane().repaint();
		 //getContentPane().revalidated();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
