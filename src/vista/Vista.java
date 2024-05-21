package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
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

public class Vista{

	private JFrame frame;
	private Modelo modelo;

	/**
	 * Create the frame.
	 */
	public Vista() {
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 510, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));		
		modelo = new Modelo();
	}

	public void login() {
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 128, 255));
		loginPanel.setLayout(null);

		JLabel login_tag = new JLabel("Iniciar sesion", 0);
		login_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
		login_tag.setForeground(Color.white);
		login_tag.setSize(300, 90);
		login_tag.setLocation(100, 100);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.red);
		loginPanel.add(login_tag);

		JLabel usuarioEtiqueta = new JLabel("Nombre de usuario");
		usuarioEtiqueta.setForeground(new Color(0, 0, 0));
		usuarioEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 25));
		usuarioEtiqueta.setBounds(100, 200, 200, 40);
		loginPanel.add(usuarioEtiqueta);

		JTextField nombreUsuario = new JTextField();
		nombreUsuario.setBounds(100, 240, 300, 40);
		loginPanel.add(nombreUsuario);

		JLabel contraseñaEtiqueta = new JLabel("Contraseña");
		contraseñaEtiqueta.setForeground(new Color(0, 0, 0));
		contraseñaEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 25));
		contraseñaEtiqueta.setBounds(100, 290, 300, 40);
		loginPanel.add(contraseñaEtiqueta);

		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(100, 330, 300, 40);
		loginPanel.add(contraseña);

		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setForeground(new Color(0, 0, 0));
		recordar.setFont(new Font("Tahoma", Font.BOLD, 12));
		recordar.setBounds(100, 365, 150, 40);
		recordar.setOpaque(false);
		loginPanel.add(recordar);

		JLabel olvidarContraseña = new JLabel("¿Olvido su contraseña?");
		olvidarContraseña.setForeground(new Color(0, 0, 0));
		olvidarContraseña.setFont(new Font("Tahoma", Font.BOLD, 12));
		olvidarContraseña.setBounds(260, 365, 150, 40);
		loginPanel.add(olvidarContraseña);

		JButton loginBoton = new JButton("Iniciar sesion");
		loginBoton.setForeground(new Color(255, 255, 255));
		loginBoton.setBackground(new Color(0, 128, 0));
		loginBoton.setFont(new Font("Agency FB", Font.BOLD, 20));
		loginBoton.setBounds(175, 420, 150, 50);
		loginBoton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {	
        		boolean loginExitoso = modelo.login(nombreUsuario.getText(), contraseña.getText());
        		
        		if (loginExitoso) {
                    JOptionPane.showMessageDialog(frame, "Inicio de sesión exitoso");
                } else {
                    JOptionPane.showMessageDialog(frame, "Inicio de sesión fallido");
                }
        	}
		});
		loginPanel.add(loginBoton);

		JLabel lblNewLabel = new JLabel("¿No tienes cuenta?");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(195, 500, 150, 13);
		loginPanel.add(lblNewLabel);

		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setBounds(175, 523, 150, 50);
		btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {	
        		frame.remove(loginPanel);
        		registro();
        	}
		});
		loginPanel.add(btnNewButton);
		
		frame.add(loginPanel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}

	public void registro() {
		JPanel registroPanel = new JPanel();
		registroPanel.setBackground(new Color(255, 128, 255));
		registroPanel.setLayout(null);

		JLabel login_tag = new JLabel("Registro", 0);
		login_tag.setFont(new Font("Agency FB", Font.BOLD, 40));
		login_tag.setForeground(Color.white);
		login_tag.setSize(300, 90);
		login_tag.setLocation(100, 100);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.red);
		registroPanel.add(login_tag);

		JLabel usuarioEtiqueta = new JLabel("Nombre de usuario");
		usuarioEtiqueta.setForeground(new Color(0, 0, 0));
		usuarioEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 25));
		usuarioEtiqueta.setBounds(100, 200, 200, 40);
		registroPanel.add(usuarioEtiqueta);

		JTextField nombreUsuario = new JTextField();
		nombreUsuario.setBounds(100, 240, 300, 40);
		registroPanel.add(nombreUsuario);

		JLabel contraseñaEtiqueta = new JLabel("Contraseña");
		contraseñaEtiqueta.setForeground(new Color(0, 0, 0));
		contraseñaEtiqueta.setFont(new Font("Agency FB", Font.BOLD, 25));
		contraseñaEtiqueta.setBounds(100, 290, 300, 40);
		registroPanel.add(contraseñaEtiqueta);

		JPasswordField contraseña = new JPasswordField();
		contraseña.setBounds(100, 330, 300, 40);
		registroPanel.add(contraseña);

		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setForeground(new Color(0, 0, 0));
		recordar.setFont(new Font("Tahoma", Font.BOLD, 12));
		recordar.setBounds(100, 365, 150, 40);
		recordar.setOpaque(false);
		registroPanel.add(recordar);

		JLabel olvidarContraseña = new JLabel("¿Olvido su contraseña?");
		olvidarContraseña.setForeground(new Color(0, 0, 0));
		olvidarContraseña.setFont(new Font("Tahoma", Font.BOLD, 12));
		olvidarContraseña.setBounds(260, 365, 150, 40);
		registroPanel.add(olvidarContraseña);

		JButton loginBoton = new JButton("Registro");
		loginBoton.setForeground(new Color(255, 255, 255));
		loginBoton.setBackground(new Color(0, 128, 0));
		loginBoton.setFont(new Font("Agency FB", Font.BOLD, 20));
		loginBoton.setBounds(175, 420, 150, 50);
		registroPanel.add(loginBoton);

		JLabel lblNewLabel = new JLabel("¿Ya tienes cuenta?");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(195, 500, 150, 13);
		registroPanel.add(lblNewLabel);

		JButton btnNewButton = new JButton("Iniciar Sesion");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Agency FB", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setBounds(175, 523, 150, 50);
		btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {	
        		frame.remove(registroPanel);
        		login();
        		
        	}
		});
		registroPanel.add(btnNewButton);
		
		frame.add(registroPanel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
    

}
