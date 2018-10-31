package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class datos {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datos window = new datos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public datos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(123, 62, 230, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Class . forName ("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/universidad", "root", "");
					
					if (conexion != null) {
						Statement st = conexion.createStatement();
						
						lblNewLabel.setText("conexion bn");
					}else 
						System.out.println("falla. ");
					}
					
					catch (SQLException e) {e .printStackTrace();}
					catch (ClassNotFoundException e) {e .printStackTrace();}
					catch (Exception e ) {e .printStackTrace();
				}
			}
		});
		btnConectar.setBounds(57, 160, 89, 23);
		frame.getContentPane().add(btnConectar);
		
		JButton btnAgregar = new JButton("agregar");
		btnAgregar.setBounds(156, 160, 89, 23);
		frame.getContentPane().add(btnAgregar);
		
		JButton btnBuscar = new JButton("buscar");
		btnBuscar.setBounds(57, 194, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnBorrar = new JButton("borrar");
		btnBorrar.setBounds(156, 194, 89, 23);
		frame.getContentPane().add(btnBorrar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 105, 227, 32);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(39, 71, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblMatricula = new JLabel("matricula");
		lblMatricula.setBounds(49, 114, 46, 14);
		frame.getContentPane().add(lblMatricula);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(126, 239, 227, 70);
		frame.getContentPane().add(lblNewLabel);
	}
}
