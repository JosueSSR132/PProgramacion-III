import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Plataforma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JPanel login = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plataforma frame = new Plataforma();
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
	public Plataforma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null); 
		
		JMenuBar barra = new JMenuBar();
		
		JMenu menuCuenta = new JMenu("Cuenta");
		
		JMenuItem open_Login = new JMenuItem("Iniciar Sesion");
		JMenuItem open_Registro = new JMenuItem("Registro");
		JMenuItem open_RecuperarCuenta = new JMenuItem("Recuperacion de cuenta");
		
		barra.add(menuCuenta);
		
		menuCuenta.add(open_Login);
		menuCuenta.add(open_Registro);
		menuCuenta.add(open_RecuperarCuenta);
		
		open_Login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            	getContentPane().removeAll(); 
        		getContentPane().revalidate(); 
        		getContentPane().repaint(); 
        		login3(Plataforma.this);
            }
        });
		
		open_Registro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            	getContentPane().removeAll(); 
        		getContentPane().revalidate(); 
        		getContentPane().repaint();
        		registro3(Plataforma.this);
            }
        });
		
		open_RecuperarCuenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            	getContentPane().removeAll(); 
        		getContentPane().revalidate(); 
        		getContentPane().repaint();
        		RecuperarCuenta(Plataforma.this);
            }
        });
		
		
		JMenu menuUsuarios = new JMenu("Usuarios");
		
		JMenuItem open_Alta = new JMenuItem("Alta");
		JMenuItem open_Baja = new JMenuItem("Baja");
		JMenuItem open_Consultar = new JMenuItem("Consultar");
		
		barra.add(menuUsuarios);
		
		menuUsuarios.add(open_Alta);
		menuUsuarios.add(open_Baja);
		menuUsuarios.add(open_Consultar);
		
		open_Alta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            	getContentPane().removeAll(); 
        		getContentPane().revalidate(); 
        		getContentPane().repaint();
        		Alta(Plataforma.this);
            }
        });
		
		open_Baja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            	getContentPane().removeAll(); 
        		getContentPane().revalidate(); 
        		getContentPane().repaint();
        		Baja(Plataforma.this);
            }
        });
		
		open_Consultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
            	getContentPane().removeAll(); 
        		getContentPane().revalidate(); 
        		getContentPane().repaint();
        		Consultar(Plataforma.this);
            }
        });
		
		JMenu menuAyuda = new JMenu("Ayuda");
		
		JMenuItem open_pregunta1 = new JMenuItem("¿Como crear un usuario?");
		JMenuItem open_pregunta2 = new JMenuItem("¿Como acceder al sistema?");
		JMenuItem open_pregunta3 = new JMenuItem("¿Que pasa si olvide mi contraseña?");
		
		barra.add(menuAyuda);
		
		menuAyuda.add(open_pregunta1);
		menuAyuda.add(open_pregunta2);
		menuAyuda.add(open_pregunta3);
		
		this.setJMenuBar(barra);
		
		this.add(contentPane);

		setContentPane(contentPane);
		
		login3(this);
	}
	
	
	public void Consultar(JFrame frame) {
		JPanel consultarPanel = new JPanel();
		consultarPanel.setSize(this.getWidth(), this.getHeight());
		consultarPanel.setBackground(new Color(255, 128, 255));
		consultarPanel.setLayout(null);
		
		contentPane.add(login);
		
		JLabel baja_tag = new JLabel("Consultar", 0);
		baja_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
		baja_tag.setForeground(Color.white);
		baja_tag.setSize(300, 90);
		baja_tag.setLocation(100, 10);
		consultarPanel.add(baja_tag);
		
		getContentPane().add(consultarPanel);
	}
	
	public void Baja(JFrame frame) {
		JPanel bajaPanel = new JPanel();
		bajaPanel.setSize(this.getWidth(), this.getHeight());
		bajaPanel.setBackground(new Color(255, 128, 255));
		bajaPanel.setLayout(null);
		
		contentPane.add(login);
		
		JLabel baja_tag = new JLabel("Baja", 0);
		baja_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
		baja_tag.setForeground(Color.white);
		baja_tag.setSize(300, 90);
		baja_tag.setLocation(100, 10);
		bajaPanel.add(baja_tag);
		
		getContentPane().add(bajaPanel);
	}
	
	public void Alta(JFrame frame) {
		JPanel AltaPanel = new JPanel();
		AltaPanel.setSize(this.getWidth(), this.getHeight());
		AltaPanel.setBackground(new Color(255, 128, 255));
		AltaPanel.setLayout(null);
		
		contentPane.add(login);
		
		JLabel login_tag = new JLabel("Alta", 0);
		login_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
		login_tag.setForeground(Color.white);
		login_tag.setSize(300, 90);
		login_tag.setLocation(100, 10);
		AltaPanel.add(login_tag);
		
		getContentPane().add(AltaPanel);
	}
	
	
	public void RecuperarCuenta(JFrame frame) {
		JPanel RecuperarCuenta = new JPanel();
		RecuperarCuenta.setSize(this.getWidth(), this.getHeight());
		RecuperarCuenta.setBackground(new Color(255, 128, 255));
		RecuperarCuenta.setLayout(null);
		
		contentPane.add(login);
		
		JLabel login_tag = new JLabel("Recuperar cuenta", 0);
		login_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
		login_tag.setForeground(Color.white);
		login_tag.setSize(300, 90);
		login_tag.setLocation(100, 10);
		RecuperarCuenta.add(login_tag);
		
		getContentPane().add(RecuperarCuenta);
	}
	
	public void login3(JFrame frame) {
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), this.getHeight());
		login.setBackground(new Color(255, 128, 255));
		login.setLayout(null);
		
		contentPane.add(login);
		
		JLabel login_tag = new JLabel("Iniciar sesion", 0);
		login_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
		login_tag.setForeground(Color.white);
		login_tag.setSize(300, 90);
		login_tag.setLocation(100, 100);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.red);
		login.add(login_tag);
		
		JLabel usuarioEtiqueta = new JLabel("Nombre de usuario");
		usuarioEtiqueta.setForeground(new Color(0, 0, 0));
		usuarioEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 25));
		usuarioEtiqueta.setBounds(100,  200,  200, 40);
		login.add(usuarioEtiqueta);
		
		JTextField nombreUsuario = new JTextField();
		nombreUsuario.setBounds(100,  240,  300, 40);
		login.add(nombreUsuario);
		
		JLabel contraseñaEtiqueta = new JLabel("Contraseña");
		contraseñaEtiqueta.setForeground(new Color(0, 0, 0));
		contraseñaEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 25));
		contraseñaEtiqueta.setBounds(100,  290,  300, 40);
		login.add(contraseñaEtiqueta);

		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(100,  330,  300, 40);
		login.add(contraseña);

		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setForeground(new Color(0, 0, 0));
		recordar.setFont(new Font("Tahoma", Font.BOLD, 12));
		recordar.setBounds(100,  365,  150, 40);
		recordar.setOpaque(false);
		login.add(recordar);
		
		JLabel olvidarContraseña = new JLabel("¿Olvido su contraseña?");
		olvidarContraseña.setForeground(new Color(0, 0, 0));
		olvidarContraseña.setFont(new Font("Tahoma", Font.BOLD, 12));
		olvidarContraseña.setBounds(260,  365,  150, 40);
		login.add(olvidarContraseña);
		
		JButton loginBoton = new JButton("Iniciar sesion");
		loginBoton.setForeground(new Color(255, 255, 255));
		loginBoton.setBackground(new Color(0, 128, 0));
		loginBoton.setFont(new Font("Agency FB", Font.BOLD, 20));
		loginBoton.setBounds(175,  420,  150, 50);
		login.add(loginBoton);
		
		loginBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(null, "Error, no se ha registrado");
			}
			
		});
		
		getContentPane().add(login);
		
		JLabel lblNewLabel = new JLabel("¿No tienes cuenta?");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(195, 500, 150, 13);
		login.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setBounds(175, 523, 150, 50);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.remove(login);
				registro3(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		login.add(btnNewButton);
		
		getContentPane().add(login);
	}
	
	public void registro3(JFrame frame) {
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth(), this.getHeight());
		registro.setLocation(0, 0);
		registro.setBackground(Color.decode("#47CBEC"));
		registro.setLayout(null);
		
		contentPane.add(login);
		
		JLabel registro_tag = new JLabel("REGISTRO", 0);
		registro_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
		registro_tag.setForeground(Color.white);
		registro_tag.setSize(300, 80);
		registro_tag.setLocation(100, 20);
		registro_tag.setOpaque(true);
		registro_tag.setBackground(Color.black);
		registro.add(registro_tag);
		
		JLabel usuarioRegistro = new JLabel("Ingresa tu nombre", 0);
		usuarioRegistro.setFont(new Font("Agency FB", Font.BOLD, 20));
		usuarioRegistro.setBounds(50,  120,  160, 40);
		registro.add(usuarioRegistro);
		
		JTextField nombreRegistro = new JTextField();
		nombreRegistro.setFont(new Font("Agency FB", Font.BOLD, 20));
		nombreRegistro.setBounds(70,  160,  160, 40);
		nombreRegistro.setHorizontalAlignment(0);
		registro.add(nombreRegistro);
		
		JLabel usuarioRegistro2 = new JLabel("Ingresa tu apellido", 0);
		usuarioRegistro2.setFont(new Font("Agency FB", Font.BOLD, 20));
		usuarioRegistro2.setBounds(250,  120,  160, 40);
		registro.add(usuarioRegistro2);
		
		JTextField apellidoRegistro = new JTextField();
		apellidoRegistro.setFont(new Font("Agency FB", Font.BOLD, 20));
		apellidoRegistro.setBounds(270,  160,  160, 40);
		apellidoRegistro.setHorizontalAlignment(0);
		registro.add(apellidoRegistro);
		
		JLabel correo = new JLabel("Correo electronico", 0);
		correo.setFont(new Font("Agency FB", Font.BOLD, 20));
		correo.setBounds(80,  200,  200, 40);
		registro.add(correo);
		
		JTextField correoArea = new JTextField();
		correoArea.setFont(new Font("Agency FB", Font.BOLD, 20));
		correoArea.setBounds(120,  240,  270, 40);
		registro.add(correoArea);
		
		JLabel contraseña = new JLabel("Contraseña", 0);
		contraseña.setFont(new Font("Agency FB", Font.BOLD, 20));
		contraseña.setBounds(60,  280,  200, 40);
		registro.add(contraseña);
		
		JPasswordField contraseñaArea = new JPasswordField();
		contraseñaArea.setFont(new Font("Agency FB", Font.BOLD, 20));
		contraseñaArea.setBounds(120,  320,  270, 40);
		registro.add(contraseñaArea);
		
		JLabel contraseñaConfirmar = new JLabel("Confirmar contraseña", 0);
		contraseñaConfirmar.setFont(new Font("Agency FB", Font.BOLD, 20));
		contraseñaConfirmar.setBounds(90,  360,  200, 40);
		registro.add(contraseñaConfirmar);
		
		JPasswordField contraseñaConfirmarArea = new JPasswordField();
		contraseñaConfirmarArea.setFont(new Font("Agency FB", Font.BOLD, 20));
		contraseñaConfirmarArea.setBounds(120,  400,  270, 40);
		registro.add(contraseñaConfirmarArea);
		
		JCheckBox terminos = new JCheckBox("Acepto los terminos y condiciones");
		terminos.setFont(new Font("Agency FB", Font.BOLD, 20));
		terminos.setOpaque(false);
		terminos.setBounds(140,  450,  250, 40);
		registro.add(terminos);
		
		
		JButton registroBoton = new JButton("Registrarse");
		registroBoton.setForeground(new Color(255, 255, 255));
		registroBoton.setBackground(new Color(0, 128, 0));
		registroBoton.setBounds(185 ,  500,  130, 45);
		registroBoton.setFont(new Font("Agency FB", Font.BOLD, 20));
		registro.add(registroBoton);
		
		registroBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String cts = new String (contraseñaArea.getPassword());
				String ctsCmr = new String(contraseñaConfirmarArea.getPassword());
				
				if(cts.equals("") && ctsCmr.equals("")) {
					JOptionPane.showMessageDialog(null, "Error, ninguna contraseña ingresada");
				}else if(cts.equals(ctsCmr)) {
					JOptionPane.showMessageDialog(null, "Éxito");
				}else {
					JOptionPane.showMessageDialog(null, "Error, contraseña incorrecta");
				}
				
				
				
			}
			
		});
		
		JLabel CuentaEx = new JLabel("¿Ya tiene cuenta?", 0);
		CuentaEx.setFont(new Font("Agency FB", Font.BOLD, 20));
		CuentaEx.setBounds(185, 560,  130, 45);
		registro.add(CuentaEx);
		
		JButton registrarCuentaBoton = new JButton("Iniciar sesion");
		registrarCuentaBoton.setForeground(new Color(255, 255, 255));
		registrarCuentaBoton.setBackground(new Color(0, 0, 128));
		registrarCuentaBoton.setBounds(185 ,  600,  130, 45);
		registrarCuentaBoton.setFont(new Font("Agency FB", Font.BOLD, 20));
		registrarCuentaBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.remove(registro);
				login3(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});
		registro.add(registrarCuentaBoton);
		
		getContentPane().add(registro);

	}
}
