import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class InterfazUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textoNombre;
	private JTextField textoApellidoP;
	private JTextField textoApellidoM;
	private JTextField textoFechaNacimiento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazUsuario frame = new InterfazUsuario();
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
	public InterfazUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(0, 255, 0));
		panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
		panelSuperior.setLayout(new BorderLayout(0, 0));
		
		JLabel etiquetaRegistro = new JLabel("       Registro de usuarios");
		etiquetaRegistro.setFont(new Font("Agency FB", Font.BOLD, 25));
		etiquetaRegistro.setPreferredSize(new Dimension(170, 25));
		panelSuperior.add(etiquetaRegistro);
		
		JPanel panelCentro = new JPanel();
		panelPrincipal.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panelSuperiorRegistro = new JPanel();
		panelSuperiorRegistro.setBackground(new Color(0, 255, 64));
		panelSuperiorRegistro.setPreferredSize(new Dimension(400, 200));
		panelCentro.add(panelSuperiorRegistro);
		panelSuperiorRegistro.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBackground(new Color(20, 237, 183));
		panelDatos.setPreferredSize(new Dimension(425, 200));
		panelSuperiorRegistro.add(panelDatos);
		panelDatos.setLayout(new BorderLayout(0, 0));
		
		JLabel etiquetaDatos = new JLabel("  Datos Generales");
		etiquetaDatos.setBackground(new Color(20, 237, 183));
		etiquetaDatos.setFont(new Font("Agency FB", Font.BOLD, 20));
		panelDatos.add(etiquetaDatos, BorderLayout.NORTH);
		
		JPanel panelDatos_2 = new JPanel();
		panelDatos_2.setBackground(new Color(20, 237, 183));
		panelDatos.add(panelDatos_2, BorderLayout.CENTER);
		panelDatos_2.setLayout(new GridLayout(7, 0, 0, 0));
		
		JPanel panelNombre = new JPanel();
		panelNombre.setBackground(new Color(20, 237, 183));
		panelDatos_2.add(panelNombre);
		
		JLabel etiquetaNombre = new JLabel("              Nombres:");
		panelNombre.add(etiquetaNombre);
		
		textoNombre = new JTextField();
		textoNombre.setText("Juan Carlos");
		panelNombre.add(textoNombre);
		textoNombre.setColumns(10);
		
		JPanel panelApellidoP = new JPanel();
		panelApellidoP.setBackground(new Color(20, 237, 183));
		panelDatos_2.add(panelApellidoP);
		
		JLabel etiquetaApellidoP = new JLabel("Apellido Paterno:");
		panelApellidoP.add(etiquetaApellidoP);
		
		textoApellidoP = new JTextField();
		textoApellidoP.setText("Arcila");
		panelApellidoP.add(textoApellidoP);
		textoApellidoP.setColumns(10);
		
		JPanel panelApellidoM = new JPanel();
		panelApellidoM.setBackground(new Color(20, 237, 183));
		panelDatos_2.add(panelApellidoM);
		
		JLabel etiquetaApellidoMaterno = new JLabel("Apellido Materno:");
		panelApellidoM.add(etiquetaApellidoMaterno);
		
		textoApellidoM = new JTextField();
		textoApellidoM.setText("Diaz");
		panelApellidoM.add(textoApellidoM);
		textoApellidoM.setColumns(10);
		
		JPanel panelFechaNacimiento = new JPanel();
		panelFechaNacimiento.setBackground(new Color(20, 237, 183));
		panelDatos_2.add(panelFechaNacimiento);
		
		JLabel etiquetaFechaNacimiento = new JLabel("Fecha nacimiento:");
		panelFechaNacimiento.add(etiquetaFechaNacimiento);
		
		textoFechaNacimiento = new JTextField();
		textoFechaNacimiento.setText("07/01/1990");
		panelFechaNacimiento.add(textoFechaNacimiento);
		textoFechaNacimiento.setColumns(10);
		
		JPanel panelSexo = new JPanel();
		panelSexo.setBackground(new Color(20, 237, 183));
		panelDatos_2.add(panelSexo);
		panelSexo.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel subpanelSexo = new JPanel();
		subpanelSexo.setBackground(new Color(20, 237, 183));
		FlowLayout fl_subpanelSexo = (FlowLayout) subpanelSexo.getLayout();
		fl_subpanelSexo.setAlignment(FlowLayout.RIGHT);
		panelSexo.add(subpanelSexo);
		
		JLabel etiquetaSexo = new JLabel("Sexo:");
		etiquetaSexo.setHorizontalTextPosition(SwingConstants.CENTER);
		etiquetaSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		subpanelSexo.add(etiquetaSexo);
		
		JPanel subpanelOpciones = new JPanel();
		subpanelOpciones.setBackground(new Color(20, 237, 183));
		panelSexo.add(subpanelOpciones);
		subpanelOpciones.setLayout(new GridLayout(2, 0, 0, 0));
		
		JRadioButton opcion1 = new JRadioButton("Masculino");
		opcion1.setHorizontalTextPosition(SwingConstants.RIGHT);
		opcion1.setHorizontalAlignment(SwingConstants.LEFT);
		opcion1.setBackground(new Color(2, 253, 190));
		opcion1.setOpaque(false);
		buttonGroup.add(opcion1);
		subpanelOpciones.add(opcion1);
		
		JRadioButton opcion2 = new JRadioButton("Femenino");
		opcion2.setBackground(new Color(2, 253, 190));
		opcion2.setOpaque(false);
		buttonGroup.add(opcion2);
		subpanelOpciones.add(opcion2);
		
		JPanel panelNacionalidad = new JPanel();
		panelNacionalidad.setBackground(new Color(20, 237, 183));
		panelDatos_2.add(panelNacionalidad);
		
		JLabel etiquetaNacionalidad = new JLabel("Nacionalidad:");
		panelNacionalidad.add(etiquetaNacionalidad);
		
		JComboBox opcionesPaises = new JComboBox();
		opcionesPaises.setModel(new DefaultComboBoxModel(new String[] {"Peru", "Mexico", "Argentina", "Brasil", "Ecuador"}));
		panelNacionalidad.add(opcionesPaises);
		
		JPanel panelPerfil = new JPanel();
		panelPerfil.setBackground(new Color(255, 128, 128));
		panelPerfil.setPreferredSize(new Dimension(180, 200));
		panelSuperiorRegistro.add(panelPerfil);
		panelPerfil.setLayout(new BorderLayout(0, 0));
		
		JLabel etiquetaPerfil = new JLabel("  Perfil de usuario");
		etiquetaPerfil.setFont(new Font("Agency FB", Font.BOLD, 20));
		panelPerfil.add(etiquetaPerfil, BorderLayout.NORTH);
		
		JPanel subpanelPerfil = new JPanel();
		FlowLayout fl_subpanelPerfil = (FlowLayout) subpanelPerfil.getLayout();
		fl_subpanelPerfil.setAlignment(FlowLayout.LEFT);
		subpanelPerfil.setBackground(new Color(255, 128, 128));
		panelPerfil.add(subpanelPerfil, BorderLayout.CENTER);
		
		JLabel imagenUsuario = new JLabel("");
		imagenUsuario.setIcon(new ImageIcon("C:\\Users\\era-1\\Downloads\\xd\\EjemploVentana\\src\\Perfil_Usuario.png"));
		subpanelPerfil.add(imagenUsuario);
		
		JCheckBox casillaMostrarPerfil = new JCheckBox("Mostrar foto de perfil");
		casillaMostrarPerfil.setOpaque(false);
		subpanelPerfil.add(casillaMostrarPerfil);
		
		JCheckBox casillaMostrarFecha = new JCheckBox("Mostrar fecha nacimiento");
		casillaMostrarFecha.setOpaque(false);
		subpanelPerfil.add(casillaMostrarFecha);
		
		JPanel PaneInferiorRegistro = new JPanel();
		PaneInferiorRegistro.setBackground(new Color(0, 255, 0));
		panelCentro.add(PaneInferiorRegistro);
		
		JPanel panelDatosOpcionales = new JPanel();
		panelDatosOpcionales.setBackground(new Color(241, 16, 106));
		panelDatosOpcionales.setPreferredSize(new Dimension(425, 200));
		PaneInferiorRegistro.add(panelDatosOpcionales);
		panelDatosOpcionales.setLayout(new BorderLayout(0, 0));
		
		JLabel etiquetaDatosOpcionales = new JLabel("Datos Opcionales");
		etiquetaDatosOpcionales.setBackground(new Color(241, 16, 106));
		etiquetaDatosOpcionales.setFont(new Font("Agency FB", Font.BOLD, 20));
		panelDatosOpcionales.add(etiquetaDatosOpcionales, BorderLayout.NORTH);
		
		JPanel subpanelDatosOpcionales = new JPanel();
		subpanelDatosOpcionales.setBackground(new Color(241, 16, 106));
		panelDatosOpcionales.add(subpanelDatosOpcionales, BorderLayout.CENTER);
		subpanelDatosOpcionales.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel subpanelDescripcion = new JPanel();
		subpanelDescripcion.setBackground(new Color(241, 16, 106));
		subpanelDatosOpcionales.add(subpanelDescripcion);
		subpanelDescripcion.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(new Color(241, 16, 106));
		panel_35.setPreferredSize(new Dimension(10, 25));
		subpanelDescripcion.add(panel_35, BorderLayout.NORTH);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(new Color(241, 16, 106));
		panel_36.setPreferredSize(new Dimension(25, 10));
		subpanelDescripcion.add(panel_36, BorderLayout.WEST);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(new Color(241, 16, 106));
		panel_37.setPreferredSize(new Dimension(25, 10));
		subpanelDescripcion.add(panel_37, BorderLayout.EAST);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(new Color(241, 16, 106));
		panel_38.setPreferredSize(new Dimension(10, 25));
		subpanelDescripcion.add(panel_38, BorderLayout.SOUTH);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(new Color(241, 16, 106));
		subpanelDescripcion.add(panel_39, BorderLayout.CENTER);
		
		JLabel etiquetaDescripcion = new JLabel("Descripcion");
		panel_39.add(etiquetaDescripcion);
		
		JTextArea textoDescripcion = new JTextArea();
		textoDescripcion.setText("Hola amigos\r\nde youtube gracias \r\npor compartir \r\nmis videos.");
		panel_39.add(textoDescripcion);
		
		JPanel subpanelPrefefencias = new JPanel();
		subpanelPrefefencias.setBackground(new Color(255, 2, 109));
		subpanelDatosOpcionales.add(subpanelPrefefencias);
		subpanelPrefefencias.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(new Color(241, 16, 106));
		panel_40.setPreferredSize(new Dimension(10, 25));
		subpanelPrefefencias.add(panel_40, BorderLayout.NORTH);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(new Color(241, 16, 106));
		panel_41.setPreferredSize(new Dimension(25, 10));
		subpanelPrefefencias.add(panel_41, BorderLayout.WEST);
		
		JPanel panel_42 = new JPanel();
		panel_42.setBackground(new Color(241, 16, 106));
		panel_42.setPreferredSize(new Dimension(25, 10));
		subpanelPrefefencias.add(panel_42, BorderLayout.EAST);
		
		JPanel panel_43 = new JPanel();
		panel_43.setBackground(new Color(241, 16, 106));
		panel_43.setPreferredSize(new Dimension(10, 25));
		subpanelPrefefencias.add(panel_43, BorderLayout.SOUTH);
		
		JPanel panel_44 = new JPanel();
		panel_44.setBackground(new Color(241, 16, 106));
		subpanelPrefefencias.add(panel_44, BorderLayout.CENTER);
		
		JLabel etiquetaPreferencias = new JLabel("Preferencias");
		panel_44.add(etiquetaPreferencias);
		
		JTextArea textoPreferencias = new JTextArea();
		textoPreferencias.setText("Cantar\r\nEscuchar Musica\r\nLeer\r\nDeportes\r\nOtros");
		panel_44.add(textoPreferencias);
		
		JPanel panelOpcionesUsuario = new JPanel();
		panelOpcionesUsuario.setBackground(new Color(20, 237, 183));
		panelOpcionesUsuario.setPreferredSize(new Dimension(180, 200));
		PaneInferiorRegistro.add(panelOpcionesUsuario);
		panelOpcionesUsuario.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_19 = new JPanel();
		panelOpcionesUsuario.add(panel_19, BorderLayout.CENTER);
		panel_19.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_21 = new JPanel();
		panel_19.add(panel_21);
		panel_21.setLayout(new BorderLayout(0, 0));
		
		JButton botonNuevoUsuario = new JButton("Nuevo");
		botonNuevoUsuario.setBackground(new Color(0, 0, 0));
		botonNuevoUsuario.setForeground(new Color(255, 255, 255));
		botonNuevoUsuario.setIcon(new ImageIcon("C:\\Users\\era-1\\Downloads\\xd\\EjemploVentana\\src\\Icono_Nuevo_Usuario.png"));
		panel_21.add(botonNuevoUsuario, BorderLayout.CENTER);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(20, 237, 183));
		panel_21.add(panel_23, BorderLayout.NORTH);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(20, 237, 183));
		panel_24.setPreferredSize(new Dimension(25, 10));
		panel_21.add(panel_24, BorderLayout.WEST);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(new Color(20, 237, 183));
		panel_25.setPreferredSize(new Dimension(25, 10));
		panel_21.add(panel_25, BorderLayout.EAST);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(20, 237, 183));
		panel_21.add(panel_26, BorderLayout.SOUTH);
		
		JPanel panel_20 = new JPanel();
		panel_19.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(20, 237, 183));
		panel_20.add(panel_27, BorderLayout.NORTH);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(20, 237, 183));
		panel_28.setPreferredSize(new Dimension(25, 10));
		panel_20.add(panel_28, BorderLayout.WEST);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(20, 237, 183));
		panel_29.setPreferredSize(new Dimension(25, 10));
		panel_20.add(panel_29, BorderLayout.EAST);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(new Color(20, 237, 183));
		panel_20.add(panel_30, BorderLayout.SOUTH);
		
		JButton botonGuardar = new JButton("Guardar");
		botonGuardar.setBackground(new Color(0, 0, 0));
		botonGuardar.setForeground(new Color(255, 255, 255));
		botonGuardar.setIcon(new ImageIcon("C:\\Users\\era-1\\Downloads\\xd\\EjemploVentana\\src\\Icono_Calcular.png"));
		panel_20.add(botonGuardar, BorderLayout.CENTER);
		
		JPanel panel_22 = new JPanel();
		panel_19.add(panel_22);
		panel_22.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(new Color(20, 237, 183));
		panel_31.setPreferredSize(new Dimension(25, 10));
		panel_22.add(panel_31, BorderLayout.WEST);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(new Color(20, 237, 183));
		panel_22.add(panel_32, BorderLayout.NORTH);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(new Color(20, 237, 183));
		panel_33.setPreferredSize(new Dimension(25, 10));
		panel_22.add(panel_33, BorderLayout.EAST);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(new Color(20, 237, 183));
		panel_22.add(panel_34, BorderLayout.SOUTH);
		
		JButton botonSalir = new JButton("Cancelar");
		botonSalir.setBackground(new Color(0, 0, 0));
		botonSalir.setForeground(new Color(255, 255, 255));
		botonSalir.setIcon(new ImageIcon("C:\\Users\\era-1\\Downloads\\xd\\EjemploVentana\\src\\Icono_Cancelar.png"));
		panel_22.add(botonSalir, BorderLayout.CENTER);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(new Color(0, 255, 64));
		panelInferior.setPreferredSize(new Dimension(10, 25));
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);
	}

}
