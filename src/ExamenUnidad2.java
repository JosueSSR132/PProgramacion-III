import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class ExamenUnidad2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCalle;
	private JTextField textField_3;
	private JTextField txtJhonDoe;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamenUnidad2 frame = new ExamenUnidad2();
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
	public ExamenUnidad2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(33, 96, 180));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("   Factura en Java - NeatBeans - ArrayList y POO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("   [Sin Base de Datos]");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_4, BorderLayout.WEST);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_5, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_6, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		panel_7.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Datos del cliente");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_8.add(lblNewLabel_2, BorderLayout.NORTH);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 255, 255));
		panel_12.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		panel_8.add(panel_12, BorderLayout.CENTER);
		panel_12.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_12.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(255, 255, 255));
		panel_13.add(panel_19, BorderLayout.NORTH);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 255, 255));
		panel_13.add(panel_20, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("Documento:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_20.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setText("123456");
		textField.setFont(new Font("Arial", Font.PLAIN, 10));
		panel_20.add(textField);
		textField.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_12.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(255, 255, 255));
		panel_14.add(panel_17, BorderLayout.NORTH);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(255, 255, 255));
		panel_14.add(panel_18, BorderLayout.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("Nombres:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_18.add(lblNewLabel_4);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setFont(new Font("Arial", Font.PLAIN, 10));
		txtJhonDoe.setText("Jhon Doe");
		panel_18.add(txtJhonDoe);
		txtJhonDoe.setColumns(10);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(255, 255, 255));
		panel_12.add(panel_15);
		
		JLabel lblNewLabel_5 = new JLabel("Direccion:   ");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_15.add(lblNewLabel_5);
		
		txtCalle = new JTextField();
		txtCalle.setFont(new Font("Arial", Font.PLAIN, 10));
		txtCalle.setText("Calle 1 #123");
		panel_15.add(txtCalle);
		txtCalle.setColumns(10);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 255, 255));
		panel_12.add(panel_16);
		
		JLabel lblNewLabel_6 = new JLabel("Telefono:");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_16.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 10));
		textField_3.setText("5554433");
		panel_16.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		panel_7.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(255, 255, 255));
		panel_9.add(panel_21, BorderLayout.NORTH);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(255, 255, 255));
		panel_9.add(panel_22, BorderLayout.CENTER);
		panel_22.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Datos de factura");
		lblNewLabel_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_22.add(lblNewLabel_7, BorderLayout.NORTH);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(255, 255, 255));
		panel_23.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		panel_22.add(panel_23, BorderLayout.CENTER);
		panel_23.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(255, 255, 255));
		panel_23.add(panel_24, BorderLayout.NORTH);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(new Color(255, 255, 255));
		panel_23.add(panel_25, BorderLayout.WEST);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(255, 255, 255));
		panel_23.add(panel_26, BorderLayout.EAST);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(255, 255, 255));
		panel_23.add(panel_27, BorderLayout.SOUTH);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(255, 255, 255));
		panel_23.add(panel_28, BorderLayout.CENTER);
		panel_28.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_29 = new JPanel();
		panel_28.add(panel_29);
		panel_29.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(new Color(255, 255, 255));
		panel_29.add(panel_31, BorderLayout.NORTH);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(new Color(255, 255, 255));
		panel_29.add(panel_32, BorderLayout.WEST);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(new Color(255, 255, 255));
		panel_29.add(panel_33, BorderLayout.EAST);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(new Color(255, 255, 255));
		panel_29.add(panel_34, BorderLayout.SOUTH);
		
		JPanel panel_35 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_35.getLayout();
		panel_35.setBackground(new Color(255, 255, 255));
		panel_29.add(panel_35, BorderLayout.CENTER);
		
		JLabel lblNewLabel_8 = new JLabel("N° Factura:      ");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_35.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("1");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 15));
		panel_35.add(lblNewLabel_9);
		
		JPanel panel_30 = new JPanel();
		panel_28.add(panel_30);
		panel_30.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(new Color(255, 255, 255));
		panel_30.add(panel_36, BorderLayout.NORTH);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(new Color(255, 255, 255));
		panel_30.add(panel_37, BorderLayout.WEST);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(new Color(255, 255, 255));
		panel_30.add(panel_38, BorderLayout.EAST);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(new Color(255, 255, 255));
		panel_30.add(panel_39, BorderLayout.SOUTH);
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(new Color(255, 255, 255));
		panel_30.add(panel_40, BorderLayout.CENTER);
		
		JLabel lblNewLabel_10 = new JLabel("Fecha:      ");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_40.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("2021/50/21");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 15));
		panel_40.add(lblNewLabel_11);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		panel_7.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_41 = new JPanel();
		panel_10.add(panel_41, BorderLayout.NORTH);
		panel_41.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_42 = new JPanel();
		panel_42.setBackground(new Color(255, 255, 255));
		panel_10.add(panel_42, BorderLayout.CENTER);
		panel_42.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_43 = new JPanel();
		panel_43.setBackground(new Color(255, 255, 255));
		panel_43.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		panel_42.add(panel_43, BorderLayout.NORTH);
		panel_43.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_52 = new JPanel();
		panel_52.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_4 = (FlowLayout) panel_52.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_43.add(panel_52);
		
		JLabel lblNewLabel_21 = new JLabel("Ver listado de facturas");
		lblNewLabel_21.setIcon(new ImageIcon("C:\\Users\\era-1\\Downloads\\xd\\EjemploVentana\\src\\Icono_Lista.png"));
		lblNewLabel_21.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_52.add(lblNewLabel_21);
		
		JPanel panel_54 = new JPanel();
		panel_54.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_5 = (FlowLayout) panel_54.getLayout();
		flowLayout_5.setAlignment(FlowLayout.RIGHT);
		panel_43.add(panel_54);
		
		JLabel lblNewLabel_22 = new JLabel("Añadir");
		lblNewLabel_22.setIcon(new ImageIcon("C:\\Users\\era-1\\Downloads\\xd\\EjemploVentana\\src\\Icono_Añadir.png"));
		lblNewLabel_22.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_54.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Eliminar");
		lblNewLabel_23.setIcon(new ImageIcon("C:\\Users\\era-1\\Downloads\\xd\\EjemploVentana\\src\\Icono_Cancelar.png"));
		lblNewLabel_23.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_54.add(lblNewLabel_23);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Agua", "2", "500", "1000.00"},
				{"Cereal", "5", "1000", "5000.00"},
				{"Leche", "2", "300", "600.00"},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Sub Total"
			}
		));
		
		JScrollPane table_scroll = new JScrollPane(table);
		panel_42.add(table_scroll, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		panel_7.add(panel_11);
		panel_11.setLayout(new GridLayout(5, 0, 0, 0));
		
		JPanel panel_44 = new JPanel();
		panel_11.add(panel_44);
		panel_44.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_53 = new JPanel();
		panel_53.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout = (FlowLayout) panel_53.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_44.add(panel_53, BorderLayout.CENTER);
		
		JLabel lblNewLabel_12 = new JLabel("SubTotal:            ");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_53.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("6600.0");
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 15));
		panel_53.add(lblNewLabel_13);
		
		JPanel panel_45 = new JPanel();
		panel_11.add(panel_45);
		panel_45.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_51 = new JPanel();
		panel_51.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_1 = (FlowLayout) panel_51.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_45.add(panel_51, BorderLayout.CENTER);
		
		JLabel lblNewLabel_14 = new JLabel("% Descuento:    ");
		lblNewLabel_14.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_51.add(lblNewLabel_14);
		
		textField_1 = new JTextField();
		textField_1.setText("5");
		textField_1.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_51.add(textField_1);
		textField_1.setColumns(4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 10));
		chckbxNewCheckBox.setSelected(true);
		panel_51.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_17 = new JLabel("Valor descontado:    ");
		lblNewLabel_17.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_51.add(lblNewLabel_17);
		
		JLabel lblNewLabel_20 = new JLabel("330.0");
		lblNewLabel_20.setFont(new Font("Arial", Font.BOLD, 15));
		panel_51.add(lblNewLabel_20);
		
		JPanel panel_46 = new JPanel();
		panel_46.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_2 = (FlowLayout) panel_46.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_11.add(panel_46);
		
		JLabel lblNewLabel_15 = new JLabel("IVA 19%:            ");
		lblNewLabel_15.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_46.add(lblNewLabel_15);
		
		JLabel lblNewLabel_18 = new JLabel("1254.0");
		lblNewLabel_18.setFont(new Font("Arial", Font.BOLD, 15));
		panel_46.add(lblNewLabel_18);
		
		JPanel panel_47 = new JPanel();
		panel_47.setBackground(new Color(255, 255, 255));
		panel_11.add(panel_47);
		panel_47.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel_16 = new JLabel("Total Factura:     ");
		lblNewLabel_16.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_47.add(lblNewLabel_16);
		
		JLabel lblNewLabel_19 = new JLabel("300.0");
		lblNewLabel_19.setFont(new Font("Arial", Font.BOLD, 15));
		panel_47.add(lblNewLabel_19);
		
		JPanel panel_48 = new JPanel();
		panel_11.add(panel_48);
		panel_48.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_49 = new JPanel();
		panel_49.setBackground(new Color(255, 255, 255));
		panel_48.add(panel_49, BorderLayout.EAST);
		
		JPanel panel_50 = new JPanel();
		panel_50.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_3 = (FlowLayout) panel_50.getLayout();
		flowLayout_3.setAlignment(FlowLayout.RIGHT);
		panel_48.add(panel_50, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("Finalizar factura");
		panel_50.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Limpiar");
		panel_50.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(33, 96, 180));
		contentPane.add(panel_2, BorderLayout.SOUTH);
	}
}
