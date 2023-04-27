package pruebas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejemplo_2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo_2 window = new Ejemplo_2();
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
	public Ejemplo_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(77, 41, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCorreo = new JLabel("correo");
		lblCorreo.setBounds(77, 78, 46, 14);
		frame.getContentPane().add(lblCorreo);
		
		textField = new JTextField();
		textField.setBounds(161, 38, 158, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(161, 75, 158, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(161, 154, 121, 44);
		frame.getContentPane().add(btnNewButton);
	}

}
