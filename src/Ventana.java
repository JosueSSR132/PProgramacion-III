import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame implements MouseListener{
	
	JPanel botones;
	public Ventana() {
		
		this.setVisible(true);
		this.setSize(1000, 750);
		this.setLocation(200, 200);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("Mi ventana");
		
		this.setMinimumSize(new Dimension(250, 250));
		this.setMaximumSize(new Dimension(1000, 750));
		this.setResizable(true);
		
		this.setLayout(null);
		
		this.iniciarComponentes();
		
		this.addMouseListener(this);
		
	}
	
public void iniciarComponentes() {
	
	//this.loginVersion2();
	
	//this.login();
	
	//this.registro();
	
	//this.admin();
	
	//this.Calculadora();
	
	//this.calculadoraVersion2();
	
	//this.CalcularInteres();
	
	this.botones();
	
	this.repaint();
	this.validate();
}

public void botones() {
	this.setSize(500, 750);
	botones = new JPanel();
	botones.setSize(this.getWidth(), this.getHeight());
	botones.setLocation(0, 0);
	botones.setBackground(Color.decode("#47CBEC"));
	botones.setLayout(null);
	
	JButton superBoton = new JButton("Click me");
	superBoton.setFont(new Font("Agency FB", Font.BOLD, 24));
	superBoton.setBounds(150,  570,  200, 40);
	botones.add(superBoton);
	
	superBoton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int x = (int)Math.floor(Math.random()*450+1);
			int y = (int)Math.floor(Math.random()*650+1);

			int w = (int)Math.floor(Math.random()*120+1);
			int h = (int)Math.floor(Math.random()*120+1);
			
			Random rand = new Random();
			float r = rand.nextFloat();
			float g = rand.nextFloat();
			float b = rand.nextFloat();
			
			String colorTexto = "" + r + g + b;
			JButton otroBoton = new JButton(colorTexto);
			otroBoton.setOpaque(true);
			otroBoton.setBackground(new Color(r, g, b));
			otroBoton.setBounds(x, y, w, h);
			botones.add(otroBoton);
			
			otroBoton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton btn = (JButton) e.getSource();
					String btnTexto = btn.getText();
					
					botones.remove(btn);
					getContentPane().repaint();
					getContentPane().revalidate();
					
					//JOptionPane.showMessageDialog(null, btnTexto);
					
				}
				
				
				
			});
			botones.add(otroBoton);
			getContentPane().repaint();
			getContentPane().revalidate();
		}
		
	});
	
	this.add(botones);
}


@Override
public void paint(Graphics g) {
	super.paint(g);
	
	//dibujarElementos(g);
	//dibujarCasa(g);
	//dibujarImagen(g);
	//dibujarImagenMario(g);
}

public void dibujarImagenMario(Graphics g) {
this.setSize(1080, 750);
	
	Graphics2D graficos2d = (Graphics2D) g;
	
	graficos2d.setStroke(new BasicStroke(5));
	
	graficos2d.setColor(Color.decode("#035ab9"));
	graficos2d.fillRect(0, 0, 1080, 750);
	
	
	graficos2d.setColor(Color.decode("#b2d3d6"));
	graficos2d.fillRoundRect(280, 497, 200, 50, 90, 90);
	
	graficos2d.setColor(Color.decode("#eaf0fe"));
	graficos2d.fillRoundRect(280, 497, 200, 45, 90, 90);
	
	graficos2d.setColor(Color.decode("#b2d3d6"));
	graficos2d.fillRoundRect(185, 547, 200, 50, 90, 90);
	
	graficos2d.setColor(Color.decode("#eaf0fe"));
	graficos2d.fillRoundRect(185, 547, 200, 45, 90, 90);
	
	graficos2d.setColor(Color.decode("#b2d3d6"));
	graficos2d.fillRoundRect(300, 597, 200, 50, 90, 90);
	
	graficos2d.setColor(Color.decode("#eaf0fe"));
	graficos2d.fillRoundRect(300, 597, 200, 45, 90, 90);
	
	
	
	graficos2d.setColor(Color.decode("#b2d3d6"));
	graficos2d.fillRoundRect(740, 210, 200, 50, 90, 90);
	
	graficos2d.setColor(Color.decode("#eaf0fe"));
	graficos2d.fillRoundRect(740, 210, 200, 45, 90, 90);
	
	
	graficos2d.setColor(Color.decode("#95c1c7"));
	graficos2d.fillRoundRect(30, 200, 190, 600, 200, 200);
	
	graficos2d.setColor(Color.decode("#bedfe3"));
	graficos2d.fillRoundRect(30, 200, 170, 600, 200, 200);
	
	graficos2d.setColor(Color.decode("#95c1c7"));
	graficos2d.fillRoundRect(390, 180, 210, 620, 200, 200);
	
	graficos2d.setColor(Color.decode("#bedfe3"));
	graficos2d.fillRoundRect(390, 180, 190, 620, 200, 200);
	
	graficos2d.setColor(Color.decode("#95c1c7"));
	graficos2d.fillRoundRect(600, 80, 210, 670, 200, 200);
	
	graficos2d.setColor(Color.decode("#bedfe3"));
	graficos2d.fillRoundRect(600, 80, 190, 670, 200, 200);
	
	
	graficos2d.setColor(Color.decode("#125175"));
	graficos2d.fillRoundRect(685, 270, 270, 600, 240, 240);
	
	graficos2d.setColor(Color.decode("#6aa9d2"));
	graficos2d.fillRoundRect(685, 270, 250, 600, 240, 240);
	
	graficos2d.setColor(Color.decode("#125175"));
	graficos2d.fillRoundRect(415, 450, 270, 300, 240, 240);
	
	graficos2d.setColor(Color.decode("#6aa9d2"));
	graficos2d.fillRoundRect(415, 450, 250, 300, 240, 240);
	
	graficos2d.setColor(Color.decode("#125175"));
	graficos2d.fillRoundRect(-150, 450, 270, 600, 200, 200);
	
	graficos2d.setColor(Color.decode("#6aa9d2"));
	graficos2d.fillRoundRect(-150, 450, 250, 600, 200, 200);
	
	graficos2d.setColor(Color.decode("#6aa9d2"));
	graficos2d.fillRoundRect(1050, 360, 250, 600, 240, 240);
	
	

	
	graficos2d.setColor(Color.decode("#ecf3fe"));
	graficos2d.fillRoundRect(850, 580, 270, 600, 200, 200);
	
	
	
	graficos2d.setColor(Color.decode("#0b2c43"));
	graficos2d.fillRect(996, 512, 156, 200);
	
	graficos2d.setColor(Color.decode("#6e6bb7"));
	graficos2d.fillRect(1000, 512, 150, 200);
	
	graficos2d.setColor(Color.decode("#6e6bb7"));
	graficos2d.fillRoundRect(990, 512, 170, 65,  10, 10);
	
	graficos2d.setColor(Color.decode("#d7e1fb"));
	graficos2d.fillRect(1040, 577, 20, 135);
	
	graficos2d.setColor(Color.decode("#d7e1fb"));
	graficos2d.fillRect(1026, 512, 20, 65);
	
	graficos2d.setColor(Color.decode("#09d405"));
	graficos2d.drawOval(242, 589, 80, 80);
	
	graficos2d.setColor(Color.decode("#0cf706"));
	graficos2d.fillOval(210, 580, 80, 80);
	
	graficos2d.setColor(Color.decode("#09d405"));
	graficos2d.drawOval(210, 578, 80, 80);
	
	graficos2d.setColor(Color.decode("#0b2c43"));
	graficos2d.drawRoundRect(988, 510, 172, 67,  10, 10);
	
	graficos2d.setColor(Color.decode("#09d405"));
	graficos2d.drawOval(179, 587, 80, 80);
	
	graficos2d.setColor(Color.decode("#0cf706"));
	graficos2d.fillOval(180, 590, 80, 80);
	
	graficos2d.setColor(Color.decode("#0cf706"));
	graficos2d.fillOval(240, 590, 80, 80);
	
	graficos2d.setColor(Color.decode("#09d405"));
	graficos2d.drawOval(267, 620, 80, 80);
	
	graficos2d.setColor(Color.decode("#09d405"));
	graficos2d.drawOval(155, 618, 80, 80);
	
	graficos2d.setColor(Color.decode("#0cf706"));
	graficos2d.fillOval(160, 610, 180, 70);;
	
	graficos2d.setColor(Color.decode("#b2d3d6"));
	graficos2d.fillRoundRect(220, 340, 240, 50, 90, 90);
	
	graficos2d.setColor(Color.decode("#eaf0fe"));
	graficos2d.fillRoundRect(220, 340, 240, 45, 90, 90);
	
	graficos2d.setColor(Color.decode("#b2d3d6"));
	graficos2d.fillRoundRect(815, 150, 200, 50, 90, 90);
	
	graficos2d.setColor(Color.decode("#eaf0fe"));
	graficos2d.fillRoundRect(815, 150, 200, 45, 90, 90);
	
	graficos2d.setColor(Color.decode("#b2d3d6"));
	graficos2d.fillRoundRect(-40, 290, 200, 50, 90, 90);
	
	graficos2d.setColor(Color.decode("#eaf0fe"));
	graficos2d.fillRoundRect(-40, 290, 200, 45, 90, 90);
	
	graficos2d.setColor(Color.decode("#c99259"));
	graficos2d.fillRect(0, 683, 1080, 60);
	
	graficos2d.setColor(Color.decode("#85651e"));
	graficos2d.fillRect(0, 683, 1080, 10);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.fillRect(0, 682, 1080, 3);
	
	graficos2d.setColor(Color.decode("#18c118"));
	graficos2d.fillRect(0, 650, 1080, 32);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.fillRect(0, 647, 1080, 3);
	
	graficos2d.setColor(Color.decode("#0b2c43"));
	graficos2d.fillRect(496, 447, 158, 200);
	
	graficos2d.setColor(Color.decode("#6e6bb7"));
	graficos2d.fillRect(500, 447, 150, 200);
	
	graficos2d.setColor(Color.decode("#6e6bb7"));
	graficos2d.fillRoundRect(490, 447, 170, 65,  10, 10);
	
	graficos2d.setColor(Color.decode("#d7e1fb"));
	graficos2d.fillRect(540, 512, 20, 135);
	
	graficos2d.setColor(Color.decode("#d7e1fb"));
	graficos2d.fillRect(526, 447, 20, 65);
	
	graficos2d.setColor(Color.decode("#0b2c43"));
	graficos2d.drawRoundRect(487, 447, 175, 65,  10, 10);
	
	
	
	
	
	graficos2d.setColor(Color.decode("#0b2c43"));
	graficos2d.drawRoundRect(918, 581, 69, 64,  20, 20);
	
	graficos2d.setColor(Color.decode("#737071"));
	graficos2d.fillRoundRect(920, 583, 65, 60,  12, 12);
	
	graficos2d.setColor(Color.decode("#c6c5cc"));
	graficos2d.fillRoundRect(920, 583, 60, 55,  12, 12);
	
	graficos2d.setColor(Color.decode("#0b2c43"));
	graficos2d.drawRoundRect(918, 517, 69, 64,  20, 20);
	
	graficos2d.setColor(Color.decode("#737071"));
	graficos2d.fillRoundRect(920, 519, 65, 60,  12, 12);
	
	graficos2d.setColor(Color.decode("#c6c5cc"));
	graficos2d.fillRoundRect(920, 519, 60, 55,  12, 12);
	
	graficos2d.setColor(Color.decode("#0b2c43"));
	graficos2d.drawRoundRect(918, 452, 69, 64,  20, 20);
	
	graficos2d.setColor(Color.decode("#737071"));
	graficos2d.fillRoundRect(920, 454, 65, 60,  12, 12);
	
	graficos2d.setColor(Color.decode("#c6c5cc"));
	graficos2d.fillRoundRect(920, 454, 60, 55,  12, 12);
	
	graficos2d.setColor(Color.decode("#0b2c43"));
	graficos2d.drawRoundRect(918, 387, 69, 64,  20, 20);
	
	graficos2d.setColor(Color.decode("#737071"));
	graficos2d.fillRoundRect(920, 389, 65, 60,  12, 12);
	
	graficos2d.setColor(Color.decode("#c6c5cc"));
	graficos2d.fillRoundRect(920, 389, 60, 55,  12, 12);
	
	graficos2d.setColor(Color.decode("#0b2c43"));
	graficos2d.drawRoundRect(987, 387, 69, 64,  20, 20);
	
	graficos2d.setColor(Color.decode("#dd9f3e"));
	graficos2d.fillRoundRect(989, 389, 65, 60,  12, 12);
	
	graficos2d.setColor(Color.decode("#ffd52e"));
	graficos2d.fillRoundRect(989, 389, 60, 55,  12, 12);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.fillRect(1010, 400, 5, 30);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.fillRect(1030, 400, 5, 30);
	
	graficos2d.setColor(Color.decode("#0b2c43"));
	graficos2d.drawRoundRect(1057, 387, 69, 64,  10, 10);
	
	graficos2d.setColor(Color.decode("#dd9f3e"));
	graficos2d.fillRoundRect(1059, 389, 65, 60,  10, 10);
	
	graficos2d.setColor(Color.decode("#ffd52e"));
	graficos2d.fillRoundRect(1059, 389, 60, 55,  10, 10);
	
	
	
	
	graficos2d.setColor(Color.decode("#f2f2ff"));
	graficos2d.fillOval(130, 350, 19, 30);
	
	graficos2d.setColor(Color.decode("#f2f2ff"));
	graficos2d.fillOval(65, 425, 19, 30);
	
	graficos2d.setColor(Color.decode("#f2f2ff"));
	graficos2d.fillOval(130, 250, 19, 30);
	
	graficos2d.setColor(Color.decode("#f2f2ff"));
	graficos2d.fillOval(430, 300, 19, 30);
	
	graficos2d.setColor(Color.decode("#f2f2ff"));
	graficos2d.fillOval(430, 400, 19, 30);
	
	graficos2d.setColor(Color.decode("#f2f2ff"));
	graficos2d.fillOval(500, 240, 19, 30);
	
	graficos2d.setColor(Color.decode("#f2f2ff"));
	graficos2d.fillOval(710, 140, 19, 30);
	
	graficos2d.setColor(Color.decode("#f2f2ff"));
	graficos2d.fillOval(640, 240, 19, 30);
	
	graficos2d.setColor(Color.decode("#c8e2e0"));
	graficos2d.fillOval(870, 520, 19, 30);
	
	graficos2d.setColor(Color.decode("#c8e2e0"));
	graficos2d.fillOval(750, 350, 19, 30);
}

public void dibujarImagen(Graphics g) {
	
	this.setSize(1200, 750);
	
	Graphics2D graficos2d = (Graphics2D) g;
	
	graficos2d.setColor(Color.decode("#a2f0ff"));
	graficos2d.fillRect(0, 0, 1200, 750);
	
	graficos2d.setColor(Color.decode("#b16f3b"));
	graficos2d.fillRect(0, 640, 1200, 110);
	
	graficos2d.setColor(Color.decode("#714625"));
	int x = 0;
	int y = 640;
	    
    for (int i = 0; i < 3; i++) {
    	graficos2d.fillRect(x, y, 1200, 5);
	    y += 45;
    }
     
    int x2 = 7;
	int y2 = 640;
	    
    for (int i = 0; i < 24; i++) {
   	graficos2d.fillRect(x2, y2, 5, 110);
	    x2 += 50;
    } 
    
    graficos2d.setStroke(new BasicStroke(5));
    graficos2d.setColor(Color.decode("#000000"));
	graficos2d.drawOval(28, 550, 70, 70);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.drawOval(82, 550, 70, 70);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.drawOval(59, 518, 72, 72);
    
    graficos2d.setColor(Color.decode("#218304"));
	graficos2d.fillOval(30, 550, 70, 70);
	
	graficos2d.setColor(Color.decode("#218304"));
	graficos2d.fillOval(80, 550, 70, 70);
	
	graficos2d.setColor(Color.decode("#218304"));
	graficos2d.fillOval(60, 519, 70, 70);
	
	graficos2d.setColor(Color.decode("#71c2ff"));
	graficos2d.fillRect(305, 335, 210, 270);
	
	graficos2d.setColor(Color.decode("#0096ef"));
	graficos2d.fillRect(305, 600, 210, 5);
	
	graficos2d.setColor(Color.decode("#0096ef"));
	graficos2d.fillRect(506, 335, 5, 270);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.drawRect(303, 332, 210, 275);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.fillRect(400, 440, 30, 165);
	
	
	graficos2d.setColor(Color.decode("#ffc0b5"));
	graficos2d.fillRect(200, 405, 200, 200);
	
	graficos2d.setColor(Color.decode("#eb9472"));
	graficos2d.fillRect(391, 405, 5, 200);
	
	graficos2d.setColor(Color.decode("#eb9472"));
	graficos2d.fillRect(200, 600, 200, 5);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.drawRect(198, 403, 200, 204);
	
	graficos2d.fillRect(515, 380, 30, 225);
	
	graficos2d.setColor(Color.decode("#007c00"));
	graficos2d.fillRect(640, 405, 150, 200);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.drawRect(638, 403, 154, 205);
	
	graficos2d.setColor(Color.decode("#007c00"));
	graficos2d.fillRect(630, 405, 150, 65);
	
	graficos2d.setColor(Color.decode("#006100"));
	graficos2d.fillRect(715, 405, 85, 65);
	
	graficos2d.setColor(Color.decode("#006e00"));
	graficos2d.fillRect(715, 405, 20, 200);
	
	graficos2d.setColor(Color.decode("#006100"));
	graficos2d.fillRect(735, 405, 55, 200);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.drawRect(628, 403, 174, 69);
	
	graficos2d.setColor(Color.decode("#ff8954"));
	graficos2d.fillRect(30, 245, 60, 60);
	
	
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.fillOval(35, 250, 8, 8);
	
	graficos2d.fillOval(74, 250, 8, 8);
	
	graficos2d.fillOval(35, 290, 8, 8);
	
	graficos2d.fillOval(73, 291, 8, 8);
	
	graficos2d.drawRect(28, 243, 60, 62);
	
	graficos2d.setColor(Color.decode("#ff8954"));
	graficos2d.fillRect(150, 70, 120, 60);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.drawRect(148, 68, 120, 62);
	graficos2d.drawRect(207, 68, 1, 62);

	graficos2d.fillOval(155, 75, 8, 8);
	
	graficos2d.fillOval(155, 115, 8, 8);
	
	graficos2d.fillOval(193, 115, 8, 8);
	
	graficos2d.fillOval(193, 75, 8, 8);
	
	graficos2d.drawRect(207, 68, 1, 62);
	
	graficos2d.fillOval(215, 75, 8, 8);
	
	graficos2d.fillOval(215, 115, 8, 8);
	
	graficos2d.fillOval(253, 115, 8, 8);
	
	graficos2d.fillOval(253, 75, 8, 8);
	
	graficos2d.setColor(Color.decode("#00dd5b"));
	graficos2d.fillRect(1030, 405, 170, 200);
	
	graficos2d.setColor(Color.decode("#048933"));
	graficos2d.fillRect(1030, 600, 170, 5);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.drawRect(1028, 403, 170, 210);
	
	graficos2d.setColor(Color.decode("#ff8954"));
	graficos2d.fillRect(1030, 245, 60, 60);
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.drawRect(1028, 245, 60, 62);
	
	graficos2d.fillOval(1035, 252, 8, 8);
	
	graficos2d.fillOval(1074, 252, 8, 8);
	
	graficos2d.fillOval(1035, 292, 8, 8);
	
	graficos2d.fillOval(1074, 292, 8, 8);
	
	graficos2d.setColor(Color.decode("#b3bfc0"));
	graficos2d.fillRect(211, 417, 22, 22);
	graficos2d.fillRect(211, 572, 22, 22);
	graficos2d.fillRect(366, 417, 22, 22);
	graficos2d.fillRect(366, 572, 22, 22);
	graficos2d.fillRect(481, 572, 22, 22);
	graficos2d.fillRect(481, 347, 22, 22);
	graficos2d.fillRect(316, 347, 22, 22);
	graficos2d.fillRect(1041, 417, 22, 22);
	graficos2d.fillRect(1041, 572, 22, 22);
	
	
	graficos2d.setColor(Color.decode("#000000"));
	graficos2d.setStroke(new BasicStroke(5));
	graficos2d.drawRoundRect(210, 415, 25, 25, 15, 15);
	graficos2d.drawRoundRect(210, 570, 25, 25, 15, 15);
	graficos2d.drawRoundRect(365, 415, 25, 25, 15, 15);
	graficos2d.drawRoundRect(365, 570, 25, 25, 15, 15);
	graficos2d.drawRoundRect(480, 570, 25, 25, 15, 15);
	graficos2d.drawRoundRect(480, 345, 25, 25, 15, 15);
	graficos2d.drawRoundRect(315, 345, 25, 25, 15, 15);
	graficos2d.drawRoundRect(1040, 415, 25, 25, 15, 15);
	graficos2d.drawRoundRect(1040, 570, 25, 25, 15, 15);
	
	graficos2d.drawLine(230, 420, 212, 438);
	graficos2d.drawLine(230, 575, 212, 593);
	graficos2d.drawLine(385, 420, 367, 438);
	graficos2d.drawLine(385, 575, 367, 593);
	graficos2d.drawLine(500, 575, 482, 593);
	graficos2d.drawLine(500, 350, 482, 368);
	graficos2d.drawLine(335, 350, 317, 368);
	graficos2d.drawLine(1060, 420, 1042, 438);
	graficos2d.drawLine(1060, 575, 1042, 593);
	
	
	graficos2d.setColor(Color.decode("#fc9559"));
	graficos2d.fillRect(0, 605, 1200, 35);
	
	graficos2d.setColor(Color.decode("#322a1d"));
	graficos2d.fillRect(0, 605, 1200, 5);
	
	try {
		BufferedImage image = ImageIO.read(new File("src/Mario.png"));
		
		graficos2d.drawImage(image, 560, 481, null);
	} catch(IOException e) {
		e.printStackTrace();
	}
}

public void dibujarCasa(Graphics g) {
	Graphics2D graficos2d = (Graphics2D) g;
	
	graficos2d.setColor(Color.decode("#7A5424"));
	graficos2d.fillRect(0, 693, 1000, 50);
	
	graficos2d.setColor(Color.decode("#BAB671"));
	graficos2d.fillRect(0, 643, 1000, 50);
	
	graficos2d.setColor(Color.decode("#58CA56"));
	graficos2d.fillRect(0, 593, 1000, 50);
	
	graficos2d.setColor(Color.decode("#45F5F8"));
	graficos2d.fillRect(0, 30, 1000, 563);
	
	graficos2d.setColor(Color.decode("#D0A02D"));
	graficos2d.fillRect(0, 410, 1000, 100);
	
	graficos2d.setColor(Color.decode("#ffb533"));

	for (int i = 0; i < 9; i++) {
        int[] xPoints = {65 + i * 120, 30 + i * 120, 30 + i * 120, 100 + i * 120, 100 + i * 120};
        int[] yPoints = {275, 350, 593, 593, 350};

        graficos2d.fillPolygon(xPoints, yPoints, 5);
    }
	
	graficos2d.setColor(Color.decode("#636362"));
	graficos2d.fillRect(200, 555, 600, 38);
	
	graficos2d.setColor(Color.decode("#ffd562"));
	graficos2d.fillRect(250, 220, 500, 333);
	
	graficos2d.setColor(Color.decode("#c18f06"));
	
	 int[] xPoints = {250, 750, 750};
     int[] yPoints = {220, 220, 323};

    graficos2d.fillPolygon(xPoints, yPoints, 3);    
    
    int[] xPoints2 = {585, 725, 750, 750};
    int[] yPoints2 = {410, 385, 390, 460};

   graficos2d.fillPolygon(xPoints2, yPoints2, 4);  
    
    graficos2d.setColor(Color.decode("#724f00"));
    
    int x = 250;
    int y = 287;
    
    for (int i = 0; i < 5; i++) {
    	graficos2d.fillRect(x, y, 500, 5);
        y += 66;
    }
    
    graficos2d.setColor(Color.decode("#684a00"));
	graficos2d.fillRect(280, 260, 150, 296);
	
	graficos2d.setColor(Color.decode("#9f6e00"));
	graficos2d.fillRect(290, 270, 130, 276);
	
	graficos2d.setColor(Color.decode("#fefff4"));
	graficos2d.fillOval(400, 400, 20, 20);
    
    graficos2d.setColor(Color.decode("#b30620"));
	graficos2d.fillRect(590, 260, 130, 130);
	
	graficos2d.setColor(Color.decode("#fefefe"));
	graficos2d.fillRect(600, 270, 50, 53);
	
	graficos2d.setColor(Color.decode("#fefefe"));
	graficos2d.fillRect(660, 270, 50, 53);
	
	graficos2d.setColor(Color.decode("#fefefe"));
	graficos2d.fillRect(600, 327, 50, 53);
	
	graficos2d.setColor(Color.decode("#fefefe"));
	graficos2d.fillRect(660, 327, 50, 53);
	
	graficos2d.setColor(Color.decode("#4c4e4d"));
	graficos2d.fillRect(585, 385, 140, 25);
	
	graficos2d.setColor(Color.decode("#808080"));
	graficos2d.fillRect(635, 110, 85, 100);
	
	graficos2d.setColor(Color.decode("#4d4d4d"));
		
	int[] xPoints4 = {635, 720, 720};
	int[] yPoints4 = {110, 110, 130};

    graficos2d.fillPolygon(xPoints4, yPoints4, 3);  
	
	graficos2d.setColor(Color.decode("#b10b1c"));
	
	 int[] xPoints3 = {200, 370, 800};
     int[] yPoints3 = {220, 60, 220};

    graficos2d.fillPolygon(xPoints3, yPoints3, 3);  
    
    graficos2d.setColor(Color.decode("#666666"));
	graficos2d.fillRect(619, 60, 120, 50);
	
}

public void dibujarElementos(Graphics g) {
	Graphics2D g2d = (Graphics2D) g;

	g2d.setColor(Color.blue);
	g2d.fillRect(50, 50, 200, 100);
	g2d.clearRect(100, 100, 100, 100);
	g2d.drawArc(300, 300, 100, 100, 45, 180);
	g2d.setColor(Color.black);
	g2d.drawLine(0, 0, 500, 500);
	g2d.drawOval(400, 400, 50, 80);
	g2d.fillOval(350, 400, 50, 80);
	g2d.fillArc(300, 300, 100, 100, 45, 180);
	g2d.drawArc(320, 280, 100, 100, 45, 180);
	
	int xPoints[] = {100, 250, 300};
	int yPoints[] = {100, 200, 300};
	
	g2d.drawPolyline(xPoints, yPoints, 3);
	
	g2d.setColor(Color.red);
	g2d.fillPolygon(xPoints, yPoints, 3);
	
	g2d.setFont(new Font("Agency FB", Font.BOLD, 40));
	g2d.drawString("Hola", 150, 100);
	
	g2d.setStroke(new BasicStroke(10));
	
	g2d.drawRoundRect(420, 150, 200, 150, 5, 10);
	
	try {
		BufferedImage image = ImageIO.read(new File("src/polluelo.png"));
		
		g2d.drawImage(image, 0, 0, null);
	} catch(IOException e) {
		e.printStackTrace();
	}
}

public void CalcularInteres() {
	
	this.setSize(450, 650);
	
	JPanel Panel_Interes = new JPanel();
	Panel_Interes.setSize(this.getWidth(), this.getHeight());
	Panel_Interes.setBackground(Color.white);
	Panel_Interes.setLayout(new BorderLayout());
	
	JLabel tituloInteres = new JLabel(" Interes", 2);
	tituloInteres.setForeground(Color.red);
	tituloInteres.setFont(new Font("Agency FB", Font.BOLD, 40));
	Panel_Interes.add(tituloInteres, BorderLayout.NORTH);
	
	JPanel centroInteres = new JPanel();
	centroInteres.setBackground(Color.white);
	centroInteres.setLayout(new GridLayout(2, 1, 0, 30));
	Panel_Interes.add(centroInteres, BorderLayout.CENTER);
	
	JPanel seccionSuperior = new JPanel();
	seccionSuperior.setBackground(Color.decode("#7FF962"));
	seccionSuperior.setLayout(new GridLayout(5, 1));

	JLabel etiquetaPrincipal = new JLabel("  Calcular interes");
	etiquetaPrincipal.setForeground(Color.black);
	etiquetaPrincipal.setFont(new Font("Agency FB", Font.BOLD, 25));
	seccionSuperior.add(etiquetaPrincipal);

	JPanel panelCapital = new JPanel();
	panelCapital.setBackground(Color.decode("#7FF962"));
	panelCapital.setLayout(new FlowLayout());
	
	JLabel etiquetaCapital = new JLabel("Capital:          ");
	etiquetaCapital.setForeground(Color.black);
	etiquetaCapital.setFont(new Font("Agency FB", Font.BOLD, 25));
	panelCapital.add(etiquetaCapital);
	seccionSuperior.add(panelCapital);
	
	JTextField textoCapital = new JTextField("1500                                 ");
	textoCapital.setFont(new Font("Agency FB", Font.BOLD, 25));
	panelCapital.add(textoCapital);
	seccionSuperior.add(panelCapital);

	JPanel panelTiempo = new JPanel();
	panelTiempo.setBackground(Color.decode("#7FF962"));
	panelTiempo.setLayout(new FlowLayout());
	
	JLabel etiquetaTiempo = new JLabel("Tiempo:          ");
	etiquetaTiempo.setForeground(Color.black);
	etiquetaTiempo.setFont(new Font("Agency FB", Font.BOLD, 25));
	panelTiempo.add(etiquetaTiempo);
	seccionSuperior.add(panelTiempo);
	
	JTextField textoTiempo = new JTextField("2                                       ");
	textoTiempo.setFont(new Font("Agency FB", Font.BOLD, 25));
	panelTiempo.add(textoTiempo);
	seccionSuperior.add(panelTiempo);

	JPanel panelTasa = new JPanel();
	panelTasa.setBackground(Color.decode("#7FF962"));
	panelTasa.setLayout(new FlowLayout());
	
	JLabel etiquetaTasa = new JLabel("Tasa interes:  ");
	etiquetaTasa.setForeground(Color.black);
	etiquetaTasa.setFont(new Font("Agency FB", Font.BOLD, 25));
	panelTasa.add(etiquetaTasa);
	seccionSuperior.add(panelTasa);
	
	JTextField textoTasa = new JTextField("0.1                                     ");
	textoTasa.setFont(new Font("Agency FB", Font.BOLD, 25));
	panelTasa.add(textoTasa);
	seccionSuperior.add(panelTasa);
	
	JPanel panelBotones = new JPanel();
	panelBotones.setBackground(Color.decode("#7FF962"));
	panelBotones.setLayout(new FlowLayout());
	
	JButton botonCalcular = new JButton("Calcular");
	botonCalcular.setIcon(new ImageIcon(getClass().getResource("Icono_Calcular.png")));
	botonCalcular.setFont(new Font("Agency FB", Font.BOLD, 25));
	botonCalcular.setOpaque(true);
	botonCalcular.setBackground(Color.black);
	botonCalcular.setForeground(Color.white);
	panelBotones.add(botonCalcular);
	seccionSuperior.add(panelBotones);
	
	JButton botonCancelar = new JButton("Cancelar");
	botonCancelar.setIcon(new ImageIcon(getClass().getResource("Icono_Cancelar.png")));
	botonCancelar.setFont(new Font("Agency FB", Font.BOLD, 25));
	botonCancelar.setOpaque(true);
	botonCancelar.setBackground(Color.black);
	botonCancelar.setForeground(Color.white);
	panelBotones.add(botonCancelar);
	seccionSuperior.add(panelBotones);

	centroInteres.add(seccionSuperior);

    JPanel seccionInferior = new JPanel();
    seccionInferior.setBackground(Color.white);
    seccionInferior.setLayout(new GridLayout(3, 1));
    
    JLabel vacio = new JLabel();
    seccionInferior.add(vacio);
	
    JPanel panelInteres = new JPanel();
    panelInteres.setBackground(Color.decode("#F36EA0"));
    panelInteres.setLayout(new FlowLayout());
	
	JLabel etiquetaInteres = new JLabel("Interes:          ");
	etiquetaInteres.setForeground(Color.black);
	etiquetaInteres.setFont(new Font("Agency FB", Font.BOLD, 25));
	panelInteres.add(etiquetaInteres);
	seccionInferior.add(panelInteres);
	
	JTextField textoInteres = new JTextField("315.0000000000002    ");
	textoInteres.setFont(new Font("Agency FB", Font.BOLD, 25));
	panelInteres.add(textoInteres);
	seccionInferior.add(panelInteres);
	
	JPanel panelMonto = new JPanel();
	panelMonto.setBackground(Color.decode("#F36EA0"));
	panelMonto.setLayout(new FlowLayout());
	
	JLabel etiquetaMonto = new JLabel("Monto:           ");
	etiquetaMonto.setForeground(Color.black);
	etiquetaMonto.setFont(new Font("Agency FB", Font.BOLD, 25));
	panelMonto.add(etiquetaMonto);
	seccionInferior.add(panelMonto);
	
	JTextField textoMonto = new JTextField("1815.0000000000002    ");
	textoMonto.setFont(new Font("Agency FB", Font.BOLD, 25));
	panelMonto.add(textoMonto);
	seccionInferior.add(panelMonto);
    
	centroInteres.add(seccionInferior);
    
	JPanel OesteInteres = new JPanel();
	OesteInteres.setBackground(Color.white);
	Panel_Interes.add(OesteInteres, BorderLayout.WEST);
	
	JPanel EsteInteres = new JPanel();
	EsteInteres.setBackground(Color.white);
	Panel_Interes.add(EsteInteres, BorderLayout.EAST);
	
	JPanel SurInteres = new JPanel();
	SurInteres.setBackground(Color.white);
	Panel_Interes.add(SurInteres, BorderLayout.SOUTH);
	
	this.add(Panel_Interes);
}

public void calculadoraVersion2() {
	
	this.setSize(480, 650);
	
	JPanel Panel_Calculadora2 = new JPanel();
	Panel_Calculadora2.setSize(this.getWidth(), this.getHeight());
	Panel_Calculadora2.setBackground(Color.decode("#bababa"));
	Panel_Calculadora2.setLayout(new BorderLayout());
	
	JLabel pantalla = new JLabel("100.00", 4);
	pantalla.setOpaque(true);
	pantalla.setBackground(Color.white);
	pantalla.setFont(new Font("Agency FB", Font.BOLD, 40));
	Panel_Calculadora2.add(pantalla, BorderLayout.NORTH);
	
	JPanel centro = new JPanel();
	centro.setBackground(Color.decode("#DE920D"));
	centro.setLayout(new GridLayout(4, 3, 10, 10));
	Panel_Calculadora2.add(centro, BorderLayout.CENTER);
	
	String botones[] = {"7", "8", "9", "6", "5", "4", "3", "2", "1", "0", ".", "/"};
	for(int i = 0; i < 12; i++)
	{
		JButton boton = new JButton(botones[i]);
		centro.add(boton);
		
	}
	
	JPanel este = new JPanel();
	este.setBackground(Color.decode("#23AF50"));
	este.setLayout(new GridLayout(3, 1, 0, 10));
	Panel_Calculadora2.add(este, BorderLayout.EAST);
	
	String botones2[] = {"+", "-", "="};
	for(int i = 0; i < 3; i++)
	{
		JButton boton = new JButton(botones2[i]);
		este.add(boton);
		
	}
	
	JPanel oeste = new JPanel();
	oeste.setBackground(Color.DARK_GRAY);
	oeste.setLayout(new BoxLayout(oeste, BoxLayout.Y_AXIS));
	Panel_Calculadora2.add(oeste, BorderLayout.WEST);
	
	String botones3[] = {"MC", "M+", "  *  "};
	for(int i = 0; i < 3; i++)
	{
		JButton boton = new JButton(botones3[i]);
		oeste.add(boton);
		
	}
	
	this.add(Panel_Calculadora2);
}

public void loginVersion2() {
		
	JPanel loginVersion2 = new JPanel();
	loginVersion2.setSize(this.getWidth(), this.getHeight());
	loginVersion2.setBackground(Color.decode("#056cd4"));
	loginVersion2.setLayout(null);
	
	JLabel login_tag = new JLabel("Inicio de sesion", 0);
	login_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
	login_tag.setForeground(Color.white);
	login_tag.setBounds(350, 10, 300, 90);
	loginVersion2.add(login_tag);
	
	JLabel miCuenta = new JLabel("Mi cuenta", 0);
	miCuenta.setBounds(345, 100, 300, 90);
	miCuenta.setForeground(Color.yellow);
	miCuenta.setFont(new Font("Agency FB", Font.BOLD, 40));
	loginVersion2.add(miCuenta);
	
	JLabel usuarioEtiqueta = new JLabel("Nombre de usuario");
	usuarioEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 25));
	usuarioEtiqueta.setForeground(Color.white);
	usuarioEtiqueta.setBounds(360,  210,  200, 40);
	loginVersion2.add(usuarioEtiqueta);
	
	JLabel iconoUsuario = new JLabel();
	iconoUsuario.setIcon(new ImageIcon(getClass().getResource("Icono_Usuario.png")));
	iconoUsuario.setBounds(315, 250, 40, 40);
	loginVersion2.add(iconoUsuario);
	
	JTextField nombreUsuario = new JTextField();
	nombreUsuario.setBounds(360,  250,  300, 40);
	loginVersion2.add(nombreUsuario);
	
	JLabel contraseñaEtiqueta = new JLabel("Contraseña");
	contraseñaEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 25));
	contraseñaEtiqueta.setForeground(Color.white);
	contraseñaEtiqueta.setBounds(360,  310,  300, 40);
	loginVersion2.add(contraseñaEtiqueta);
	
	JLabel iconoCandado = new JLabel();
	iconoCandado.setIcon(new ImageIcon(getClass().getResource("Icono_Candado.png")));
	iconoCandado.setBounds(315, 350, 40, 40);
	loginVersion2.add(iconoCandado);

	JPasswordField contraseña = new JPasswordField();
	contraseña.setBounds(360,  350,  300, 40);
	loginVersion2.add(contraseña);
	
	JButton loginBoton = new JButton("Acceder");
	loginBoton.setFont(new Font("Agency FB", Font.BOLD, 25));
	loginBoton.setOpaque(true);
	loginBoton.setBackground(Color.yellow);
	loginBoton.setBounds(420,  420,  150, 40);
	loginVersion2.add(loginBoton);
	
	JLabel olvidarContraseña = new JLabel("¿No tienes cuenta?");
	olvidarContraseña.setFont(new Font("Agency FB", Font.BOLD, 25));
	olvidarContraseña.setBounds(423,  505,  150, 40);
	olvidarContraseña.setForeground(Color.white);
	loginVersion2.add(olvidarContraseña);
	
	JButton botonRegistrarse = new JButton("Registrarse");
	botonRegistrarse.setFont(new Font("Agency FB", Font.BOLD, 25));
	botonRegistrarse.setOpaque(true);
	botonRegistrarse.setBackground(Color.yellow);
	botonRegistrarse.setBounds(420,  545,  150, 40);
	loginVersion2.add(botonRegistrarse);
	
	JLabel fondoVerde = new JLabel();
	fondoVerde.setBounds(145, 110, 700, 500);
	fondoVerde.setOpaque(true); 
	fondoVerde.setBackground(Color.decode("#1056C0"));
	loginVersion2.add(fondoVerde);
	
	this.add(loginVersion2);

}

public void registro() {
	
	JPanel registro = new JPanel();
	registro.setSize(this.getWidth()/2, this.getHeight());
	registro.setLocation(500, 0);
	registro.setBackground(Color.decode("#47CBEC"));
	registro.setLayout(null);
	
	JLabel registro_tag = new JLabel("REGISTRO", 0);
	registro_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
	registro_tag.setForeground(Color.white);
	registro_tag.setSize(300, 80);
	registro_tag.setLocation(100, 20);
	registro_tag.setOpaque(true);
	registro_tag.setBackground(Color.black);
	registro.add(registro_tag);
	
	JLabel usuarioRegistro = new JLabel("Nombre de usuario", 0);
	usuarioRegistro.setFont(new Font("Agency FB", Font.BOLD, 24));
	usuarioRegistro.setBounds(50,  120,  400, 40);
	usuarioRegistro.setOpaque(true);
	usuarioRegistro.setBackground(Color.yellow);
	registro.add(usuarioRegistro);
	
	JTextField nombreRegistro = new JTextField();
	nombreRegistro.setFont(new Font("Agency FB", Font.BOLD, 24));
	nombreRegistro.setBounds(50,  160,  400, 40);
	nombreRegistro.setHorizontalAlignment(0);
	registro.add(nombreRegistro);
	
	JLabel bio = new JLabel("BIO", 0);
	bio.setFont(new Font("Agency FB", Font.BOLD, 24));
	bio.setBounds(50,  200,  400, 40);
	registro.add(bio);
	
	JTextArea bioArea = new JTextArea();
	bioArea.setFont(new Font("Agency FB", Font.BOLD, 24));
	bioArea.setBounds(50,  240,  400, 50);
	registro.add(bioArea);
	
	JLabel preferenciaEtiqueta = new JLabel("Preferencias");
	preferenciaEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 24));
	preferenciaEtiqueta.setBounds(50,  290,  400, 40);
	registro.add(preferenciaEtiqueta);
	
	JCheckBox objeto_Caja_1 = new JCheckBox("Dulces");
	objeto_Caja_1.setFont(new Font("Agency FB", Font.BOLD, 22));
	objeto_Caja_1.setOpaque(false);
	objeto_Caja_1.setBounds(50,  320,  80, 40);
	registro.add(objeto_Caja_1);
	
	JCheckBox objeto_Caja_2 = new JCheckBox("Salado");
	objeto_Caja_2.setFont(new Font("Agency FB", Font.BOLD, 22));
	objeto_Caja_2.setOpaque(false);
	objeto_Caja_2.setBounds(140,  320,  90, 40);
	registro.add(objeto_Caja_2);
	
	JCheckBox objeto_Caja_3 = new JCheckBox("Saludable");
	objeto_Caja_3.setFont(new Font("Agency FB", Font.BOLD, 22));
	objeto_Caja_3.setOpaque(false);
	objeto_Caja_3.setBounds(240,  320,  110, 40);
	registro.add(objeto_Caja_3);
	
	JLabel terminoEtiqueta = new JLabel("Terminos");
	terminoEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 24));
	terminoEtiqueta.setBounds(50,  345,  400, 40);
	registro.add(terminoEtiqueta);
	
	JRadioButton aceptoBoton = new JRadioButton("Acepto los terminos");
	aceptoBoton.setFont(new Font("Agency FB", Font.BOLD, 24));
	aceptoBoton.setOpaque(false);
	aceptoBoton.setBounds(50,  370,  200, 40);
	registro.add(aceptoBoton);
	
	JRadioButton NoAceptoBoton = new JRadioButton("No acepto los terminos");
	NoAceptoBoton.setFont(new Font("Agency FB", Font.BOLD, 24));
	NoAceptoBoton.setBounds(250,  370,  400, 40);
	NoAceptoBoton.setOpaque(false);
	registro.add(NoAceptoBoton);
	
	ButtonGroup opciones = new ButtonGroup();
	opciones.add(aceptoBoton);
	opciones.add(NoAceptoBoton);
	
	String colonias[] = {"Centro", "Camino Real"};

	JComboBox localizaciones = new JComboBox(colonias);
	localizaciones.setBounds(50,  410,  400, 35);
	localizaciones.setFont(new Font("Agency FB", Font.BOLD, 24));
	registro.add(localizaciones);

	JButton registroBoton = new JButton("Registro");
	registroBoton.setBounds(185 ,  450,  100, 45);
	registroBoton.setFont(new Font("Agency FB", Font.BOLD, 24));
	registro.add(registroBoton);
	
	registroBoton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String usr = nombreRegistro.getText();
			String bio = bioArea.getText();
			
			
			if(usr.length()<=0) {
				nombreRegistro.setBorder(BorderFactory.createLineBorder(Color.red, 2));
			}else {
				nombreRegistro.setBorder(BorderFactory.createLineBorder(Color.green, 2));
			}
			
			if(bio.length()<=0) {
				bioArea.setBorder(BorderFactory.createLineBorder(Color.red, 2));
			}else {
				bioArea.setBorder(BorderFactory.createLineBorder(Color.green, 2));
			}
			
			if(objeto_Caja_1.isSelected()) {
				objeto_Caja_1.setBorderPainted(true);
				objeto_Caja_1.setBorder(BorderFactory.createLineBorder(Color.green, 2));
			}else {
				objeto_Caja_1.setBorderPainted(true);
				objeto_Caja_1.setBorder(BorderFactory.createLineBorder(Color.red, 2));
		}
		
		}});
	
	this.add(registro);

}

public void login() {
	
	
	JPanel login = new JPanel();
	login.setSize(this.getWidth()/2, this.getHeight());
	login.setBackground(Color.gray);
	login.setLayout(null);
	
	JLabel login_tag = new JLabel("ACCEDER", 0);
	login_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
	login_tag.setForeground(Color.white);
	login_tag.setSize(300, 90);
	login_tag.setLocation(100, 20);
	login_tag.setOpaque(true);
	login_tag.setBackground(Color.red);
	this.add(login_tag);
	
	/*JLabel logo = new JLabel();
	logo.setIcon(new ImageIcon(getClass().getResource("polluelo.png")));
	logo.setBounds(100, 50, 256, 400);
	this.add(logo);*/
	
	JLabel usuarioEtiqueta = new JLabel("Nombre de usuario");
	usuarioEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 25));
	usuarioEtiqueta.setBounds(100,  120,  200, 40);
	this.add(usuarioEtiqueta);
	
	JTextField nombreUsuario = new JTextField();
	nombreUsuario.setBounds(100,  160,  300, 40);
	this.add(nombreUsuario);
	
	JLabel contraseñaEtiqueta = new JLabel("Contraseña");
	contraseñaEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 25));
	contraseñaEtiqueta.setBounds(100,  210,  300, 40);
	this.add(contraseñaEtiqueta);

	JPasswordField contraseña = new JPasswordField();
	contraseña.setBounds(100,  250,  300, 40);
	this.add(contraseña);

	JCheckBox recordar = new JCheckBox("Recordarme");
	recordar.setBounds(100,  285,  150, 40);
	recordar.setOpaque(false);
	this.add(recordar);
	
	JLabel olvidarContraseña = new JLabel("¿Olvido su contraseña?");
	olvidarContraseña.setBounds(260,  285,  150, 40);
	this.add(olvidarContraseña);
	
	JButton loginBoton = new JButton("Acceder");
	loginBoton.setFont(new Font("Agency FB", Font.BOLD, 25));
	loginBoton.setBounds(175,  340,  150, 50);
	this.add(loginBoton);
	
	loginBoton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Hola");
			
			String usr = nombreUsuario.getText();
			String pwd = new String(contraseña.getPassword());
			
			if(usr.length()<=0) {
				nombreUsuario.setBorder(BorderFactory.createLineBorder(Color.red, 2));
			}else {
				nombreUsuario.setBorder(BorderFactory.createLineBorder(Color.green, 2));
			}
			if(pwd.length()<=0) {
				contraseña.setBorder(BorderFactory.createLineBorder(Color.red, 2));
			}else {
				contraseña.setBorder(BorderFactory.createLineBorder(Color.green, 2));
			}
			if(usr.equals("SuperUser")) {
				if(pwd.equals("SuperPass")) {
					System.out.println("Bienvenido");
				}
			}else {
				System.out.println("UsuarioNoEncontrado");
			}
			
		}
		
	});
	
	this.add(login);

}
	
public void admin() {
	
	JPanel admin_Panel = new JPanel();
	admin_Panel.setLocation(0, 0);
	admin_Panel.setSize(this.getWidth(), this.getHeight());
	admin_Panel.setBackground(Color.decode("#6DE19B"));
	admin_Panel.setLayout(null);
	
	JMenuBar barra = new JMenuBar();
	
	JMenu menu = new JMenu("Archivo");
	
	JMenuItem open_Item = new JMenuItem("Abrir archivo");
	JMenuItem create_Item = new JMenuItem("Crear archivo");
	
	barra.add(menu);
	
	menu.add(open_Item);
	menu.add(create_Item);
	
	JLabel usuarioEtiqueta = new JLabel("USUARIOS", 0);
	usuarioEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 40));
	usuarioEtiqueta.setForeground(Color.white);
	usuarioEtiqueta.setSize(300, 80);
	usuarioEtiqueta.setLocation(350, 20);
	usuarioEtiqueta.setOpaque(true);
	usuarioEtiqueta.setBackground(Color.black);
	admin_Panel.add(usuarioEtiqueta);

	JLabel titulo_widget = new JLabel("Total de usuarios", 0);
	titulo_widget.setBounds(40, 120, 300, 40);
	titulo_widget.setForeground(Color.white);
	titulo_widget.setFont(new Font("Agency FB", Font.BOLD, 20));
	admin_Panel.add(titulo_widget);
	
	JLabel contenido_widget = new JLabel("100", 0);
	contenido_widget.setBounds(40, 160, 300, 40);
	contenido_widget.setForeground(Color.white);
	contenido_widget.setFont(new Font("Agency FB", Font.BOLD, 30));
	admin_Panel.add(contenido_widget);
	
	JButton descargar = new JButton("Exportar");
	descargar.setBounds(750, 230,100, 40);
	admin_Panel.add(descargar);
	
	JButton agregar_user = new JButton("Añadir");
	agregar_user.setBounds(860, 230,100, 40);
	admin_Panel.add(agregar_user);
	
	JLabel widget = new JLabel("");
	widget.setBounds(40, 120, 300, 100);
	widget.setOpaque(true);
	widget.setBackground(Color.black);
	admin_Panel.add(widget);
	
	String titulos[] = {"Nu. Control", "Nombre", "Apellido"};
	
	String datos_Tabla[][] = {
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"},
			{"Nu. Control", "Nombre", "Apellido"}
	};
	
	JTable users = new JTable(datos_Tabla, titulos);
	
	JScrollPane table_scroll = new JScrollPane(users);
	table_scroll.setBounds(40, 280, 920, 300);
	admin_Panel.add(table_scroll);
	
	this.setJMenuBar(barra);
	
	this.add(admin_Panel);
}

public void Calculadora() {
	JPanel Panel_Calculadora = new JPanel();
	Panel_Calculadora.setLocation(0, 0);
	Panel_Calculadora.setSize(this.getWidth(), this.getHeight());
	Panel_Calculadora.setBackground(Color.decode("#bababa"));
	Panel_Calculadora.setLayout(null);
	
	JLabel pantallaCalculadora = new JLabel("888", 4);
	pantallaCalculadora.setFont(new Font("Agency FB", Font.BOLD, 40));
	pantallaCalculadora.setForeground(Color.black);
	pantallaCalculadora.setBounds(15, 20, 960, 104);
	pantallaCalculadora.setOpaque(true);
	pantallaCalculadora.setBackground(Color.decode("#ffffff"));
	Panel_Calculadora.add(pantallaCalculadora);
	
	JButton botonCE = new JButton("CE");
	botonCE.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonCE.setForeground(Color.white);
	botonCE.setBounds(15, 133, 232, 105);
	botonCE.setOpaque(true);
	botonCE.setBackground(Color.black);
	Panel_Calculadora.add(botonCE);
	
	JLabel espacioVacio = new JLabel();
	espacioVacio.setFont(new Font("Agency FB", Font.BOLD, 40));
	espacioVacio.setForeground(Color.white);
	espacioVacio.setBounds(257, 133, 717, 105);
	espacioVacio.setOpaque(true);
	espacioVacio.setBackground(Color.black);
	Panel_Calculadora.add(espacioVacio);
	
	JButton botonNum7 = new JButton("7");
	botonNum7.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonNum7.setForeground(Color.white);
	botonNum7.setBounds(15, 248, 232, 105);
	botonNum7.setOpaque(true);
	botonNum7.setBackground(Color.black);
	Panel_Calculadora.add(botonNum7);
	
	JButton botonNum8 = new JButton("8");
	botonNum8.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonNum8.setForeground(Color.white);
	botonNum8.setBounds(257, 248, 232, 105);
	botonNum8.setOpaque(true);
	botonNum8.setBackground(Color.black);
	Panel_Calculadora.add(botonNum8);
	
	JButton botonNum9 = new JButton("8");
	botonNum9.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonNum9.setForeground(Color.white);
	botonNum9.setBounds(499, 248, 232, 105);
	botonNum9.setOpaque(true);
	botonNum9.setBackground(Color.black);
	Panel_Calculadora.add(botonNum9);
	
	JButton botonDivision = new JButton("/");
	botonDivision.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonDivision.setForeground(Color.white);
	botonDivision.setBounds(741, 248, 233, 105);
	botonDivision.setOpaque(true);
	botonDivision.setBackground(Color.black);
	Panel_Calculadora.add(botonDivision);
	
	JButton botonNum4 = new JButton("4");
	botonNum4.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonNum4.setForeground(Color.white);
	botonNum4.setBounds(15, 362, 232, 105);
	botonNum4.setOpaque(true);
	botonNum4.setBackground(Color.black);
	Panel_Calculadora.add(botonNum4);
	
	JButton botonNum5 = new JButton("5");
	botonNum5.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonNum5.setForeground(Color.white);
	botonNum5.setBounds(257, 362, 232, 105);
	botonNum5.setOpaque(true);
	botonNum5.setBackground(Color.black);
	Panel_Calculadora.add(botonNum5);
	
	JButton botonNum6 = new JButton("6");
	botonNum6.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonNum6.setForeground(Color.white);
	botonNum6.setBounds(499, 362, 232, 105);
	botonNum6.setOpaque(true);
	botonNum6.setBackground(Color.black);
	Panel_Calculadora.add(botonNum6);
	
	JButton botonMultiplicacion = new JButton("*");
	botonMultiplicacion.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonMultiplicacion.setForeground(Color.white);
	botonMultiplicacion.setBounds(741, 362, 233, 105);
	botonMultiplicacion.setOpaque(true);
	botonMultiplicacion.setBackground(Color.black);
	Panel_Calculadora.add(botonMultiplicacion);
	
	JButton botonNum1 = new JButton("1");
	botonNum1.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonNum1.setForeground(Color.white);
	botonNum1.setBounds(15, 476, 232, 105);
	botonNum1.setOpaque(true);
	botonNum1.setBackground(Color.black);
	Panel_Calculadora.add(botonNum1);
	
	JButton botonNum2 = new JButton("2");
	botonNum2.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonNum2.setForeground(Color.white);
	botonNum2.setBounds(257, 476, 232, 105);
	botonNum2.setOpaque(true);
	botonNum2.setBackground(Color.black);
	Panel_Calculadora.add(botonNum2);
	
	JButton botonNum3 = new JButton("3");
	botonNum3.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonNum3.setForeground(Color.white);
	botonNum3.setBounds(499, 476, 232, 105);
	botonNum3.setOpaque(true);
	botonNum3.setBackground(Color.black);
	Panel_Calculadora.add(botonNum3);
	
	JButton botonResta = new JButton("4");
	botonResta.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonResta.setForeground(Color.white);
	botonResta.setBounds(741, 476, 232, 105);
	botonResta.setOpaque(true);
	botonResta.setBackground(Color.black);
	Panel_Calculadora.add(botonResta);
	
	JButton botonNum0 = new JButton("0");
	botonNum0.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonNum0.setForeground(Color.white);
	botonNum0.setBounds(15, 590, 232, 105);
	botonNum0.setOpaque(true);
	botonNum0.setBackground(Color.black);
	Panel_Calculadora.add(botonNum0);
	
	JButton botonPunto = new JButton(".");
	botonPunto.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonPunto.setForeground(Color.white);
	botonPunto.setBounds(257, 590, 232, 105);
	botonPunto.setOpaque(true);
	botonPunto.setBackground(Color.black);
	Panel_Calculadora.add(botonPunto);
	
	JButton botonIgual = new JButton("=");
	botonIgual.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonIgual.setForeground(Color.white);
	botonIgual.setBounds(499, 590, 232, 105);
	botonIgual.setOpaque(true);
	botonIgual.setBackground(Color.black);
	Panel_Calculadora.add(botonIgual);
	
	JButton botonSuma = new JButton("+");
	botonSuma.setFont(new Font("Agency FB", Font.BOLD, 40));
	botonSuma.setForeground(Color.white);
	botonSuma.setBounds(741, 590, 232, 105);
	botonSuma.setOpaque(true);
	botonSuma.setBackground(Color.black);
	Panel_Calculadora.add(botonSuma);
	
	this.add(Panel_Calculadora);
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	Random rand = new Random();
	float r = rand.nextFloat();
	float g = rand.nextFloat();
	float b = rand.nextFloat();
	
	int x = (int)Math.floor(Math.random()*120+1);
	int y = (int)Math.floor(Math.random()*120+1);
	
	String colorTexto2 = "" + r + g + b;
	JButton tercerBoton = new JButton(colorTexto2);
	tercerBoton.setSize(x, y);
	tercerBoton.setLocation(e.getX(), e.getY());
	tercerBoton.setOpaque(true);
	tercerBoton.setBackground(new Color(r, g, b));
	
	tercerBoton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton btn = (JButton) e.getSource();
			String btnTexto = btn.getText();
			JOptionPane.showMessageDialog(null, btnTexto);
		}
		
	});
	
	getContentPane().repaint();
	getContentPane().revalidate();
	
	botones.add(tercerBoton);

}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	Random rand = new Random();
	float r = rand.nextFloat();
	float g = rand.nextFloat();
	float b = rand.nextFloat();
	
	botones.setBackground(new Color(r, g, b));
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


	
}