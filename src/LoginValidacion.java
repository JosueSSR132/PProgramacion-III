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

public class LoginValidacion extends JFrame {

	private static final long serialVersionUID = 1L;
	JPanel login = new JPanel();
	private static FileWriter crunchifyFile;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginValidacion frame = new LoginValidacion();
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
	public LoginValidacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null); 

		setContentPane(contentPane);
		
		login3(this);
	}
	
	public void login3(JFrame frame) {
		
		try {
            crearYEscribirJSON();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
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
				
				try {
		            String jsonContent = new String(Files.readAllBytes(Paths.get("src/Archivos/JSONPrueba1.txt")));
		            JSONObject jsonObject = new JSONObject(jsonContent);

		            String jsonUsuario = jsonObject.getString("Usuario");
		            String jsonContrasena = jsonObject.getString("Contraseña");

		            //String inputUsuario = nombreUsuario.getText();
		            String inputContrasena = new String(contraseña.getPassword());
		            String usr=nombreUsuario.getText().toString();
		            
		            
		            if(!usr.equals(jsonUsuario)) {
		            	nombreUsuario.setBorder(BorderFactory.createLineBorder(Color.red , 2));
					}else if (usr.equals(jsonUsuario)){
						nombreUsuario.setBorder(BorderFactory.createLineBorder(Color.green , 2));
					}
		            if(!inputContrasena.equals(jsonContrasena)) {
						contraseña.setBorder(BorderFactory.createLineBorder(Color.red , 2));
					}else if (inputContrasena.equals(jsonContrasena)) {
						contraseña.setBorder(BorderFactory.createLineBorder(Color.green , 2));
					}

		            if (usr.equals(jsonUsuario) && inputContrasena.equals(jsonContrasena)) {
		            	
		            	JOptionPane.showMessageDialog(null, "Login exitoso. Bienvenido", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		            	frame.remove(login);
						alta(frame);
						frame.repaint();
						frame.revalidate();
		            } else {
		                JOptionPane.showMessageDialog(null, "Error de Usuario o Contraseña", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
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
		/*btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.remove(login);
				registro3(frame);
				frame.repaint();
				frame.revalidate();
				
			}
			
		});*/
		login.add(btnNewButton);
		
		getContentPane().add(login);
	}
	
	public void alta(JFrame frame) {
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
	
	@SuppressWarnings("unchecked")
    public static void mostrarJSON() {
    	
        try {
        	String jsonContent = new String(Files.readAllBytes(Paths.get("src/Archivos/JSONPrueba1.txt")));
        	JSONObject jsonObject = new JSONObject(jsonContent);
        	
        	String name = (String) jsonObject.get("Usuario");
            System.out.println("Usuario: " + name);
            
            String author = (String) jsonObject.get("Contraseña");
            System.out.println("Contraseña: " + author);
            
            JSONArray companyList = (JSONArray) jsonObject.get("Lista de Compañías");
            
            Iterator<Object> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void crearYEscribirJSON() throws IOException {
    	
    	JSONObject obj = new JSONObject();
        
        // Crear un JSONArray para almacenar múltiples usuarios y contraseñas
        JSONArray usuarios = new JSONArray();
        
        // Define arrays de nombres de usuarios y contraseñas
        String[] nombresUsuarios = {"Carlos", "Ana", "Miguel", "Isabela", "Raul", "María", "David", "Sofía", "Pablo", "Lucía"};
        String[] contraseñas = {"password1", "mypassword", "clave123", "secreto2024", "qwerty789", "123abc", "789xyz", "welcome2023", "letmein", "mypassword123"};

        // Agrega cada usuario y contraseña al array de usuarios
        for (int i = 0; i < nombresUsuarios.length; i++) {
            JSONObject usuario = new JSONObject();
            usuario.put("Usuario", nombresUsuarios[i]);
            usuario.put("Contraseña", contraseñas[i]);
            
            // Agrega el objeto de usuario y contraseña al array de usuarios
            usuarios.put(usuario);
        }
        
        // Agrega el array de usuarios al objeto JSON principal
        obj.put("Usuarios", usuarios);
            
        JSONArray companias = new JSONArray();
        companias.put("Compañía: Facebook");
        companias.put("Compañía: PayPal");
        companias.put("Compañía: Google");
        obj.put("Lista de Compañías", companias);

        crunchifyFile = new FileWriter("src/Archivos/JSONPrueba1.txt");
        crunchifyFile.write(obj.toString());

        //crunchifyLog("Objeto JSON copiado correctamente al archivo...");
        //crunchifyLog("\nObjeto JSON: " + obj);

        crunchifyFile.flush();
        crunchifyFile.close();
    }
    
    static public void crunchifyLog(String str) {
        System.out.println(str);
    }

}
