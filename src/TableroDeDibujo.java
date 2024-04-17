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
	int x = 210, y= 185;

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
		setBounds(100, 100, 450, 400);
		setFocusable(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		this.addKeyListener(this);
		tablero(this);
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
		
		dibujar(g);
	}
	
	public void dibujar(Graphics g) {
		Graphics2D graficos2d = (Graphics2D) g;
		
		graficos2d.setColor(Color.decode("#035ab9"));
		graficos2d.fillRect(x, y, 30, 30);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 //System.out.println("Código de tecla presionada: " + e.getKeyCode());
		 
		 switch(e.getKeyCode()) {
			 case 87:
				 y-=10;
				 break;
			 case 83:
				 y+=10;
				 break;
			 case 68:
				 x+=10;
				 break;
			 case 65:
				 x-=10;
				 break;
			 default:
				 break;
		 }
		 this.update(getGraphics());
		 //getContentPane().repaint();
		 //getContentPane().revalidate();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
