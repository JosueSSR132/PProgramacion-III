package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.json.JSONArray;
import org.json.JSONObject;

import controlador.Controlador;
import modelo.Modelo;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	public static JTextField nombreUsuario;
    public static JPasswordField contraseña;
    public static JButton loginBoton;
    public static JButton botonLogin;
	JPanel login = new JPanel();
	public JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 510, 700);
        contentPane = new JPanel();
        contentPane.setLayout(null); 
        setContentPane(contentPane);

        configurarComponentes();
	}

	public void configurarComponentes() {

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
		usuarioEtiqueta.setBounds(100, 200, 200, 40);
		login.add(usuarioEtiqueta);

		nombreUsuario = new JTextField();
		nombreUsuario.setBounds(100, 240, 300, 40);
		login.add(nombreUsuario);

		JLabel contraseñaEtiqueta = new JLabel("Contraseña");
		contraseñaEtiqueta.setForeground(new Color(0, 0, 0));
		contraseñaEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 25));
		contraseñaEtiqueta.setBounds(100, 290, 300, 40);
		login.add(contraseñaEtiqueta);

		contraseña = new JPasswordField();
		contraseña.setBounds(100, 330, 300, 40);
		login.add(contraseña);

		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setForeground(new Color(0, 0, 0));
		recordar.setFont(new Font("Tahoma", Font.BOLD, 12));
		recordar.setBounds(100, 365, 150, 40);
		recordar.setOpaque(false);
		login.add(recordar);

		JLabel olvidarContraseña = new JLabel("¿Olvido su contraseña?");
		olvidarContraseña.setForeground(new Color(0, 0, 0));
		olvidarContraseña.setFont(new Font("Tahoma", Font.BOLD, 12));
		olvidarContraseña.setBounds(260, 365, 150, 40);
		login.add(olvidarContraseña);

		loginBoton = new JButton("Iniciar sesion");
		loginBoton.setForeground(new Color(255, 255, 255));
		loginBoton.setBackground(new Color(0, 128, 0));
		loginBoton.setFont(new Font("Agency FB", Font.BOLD, 20));
		loginBoton.setBounds(175, 420, 150, 50);
		login.add(loginBoton);

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
		login.add(btnNewButton);

		getContentPane().add(login);
	}

	public void alta() {
		JPanel AltaPanel = new JPanel();
		AltaPanel.setSize(this.getWidth(), this.getHeight());
		AltaPanel.setBackground(new Color(255, 128, 255));
		AltaPanel.setLayout(null);

		contentPane.add(login);

		JLabel login_tag = new JLabel("Pagina Nueva", 0);
		login_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
		login_tag.setForeground(Color.white);
		login_tag.setSize(300, 90);
		login_tag.setLocation(100, 10);
		AltaPanel.add(login_tag);

		getContentPane().add(AltaPanel);
	}
	
	public String obtenerNombreUsuario() {
        return nombreUsuario.getText();
    }

    public String obtenerContraseña() {
        return new String(contraseña.getPassword());
    }
    
    public void addLoginActionListener(ActionListener listener) {
        loginBoton.addActionListener(listener);
    }
    
    public void setUsuarioBorder(Color color) {
        nombreUsuario.setBorder(BorderFactory.createLineBorder(color, 2));
    }

    public void setContraseñaBorder(Color color) {
        contraseña.setBorder(BorderFactory.createLineBorder(color, 2));
    }

    public void mostrarMensaje(String mensaje, String titulo, int tipo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
    }
    

}
