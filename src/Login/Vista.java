package Login;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private Controlador miControlador;
	private Modelo miModelo;
	private JButton txtpwd;
	private JLabel lblContrasea;
	private JLabel lblNewLabel;
	private JTextField textUsr;
	private JPasswordField password;
	private JLabel lblNewLabel_1;
	private String resultado;

	public Vista() {
		setTitle("Login MVC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(68, 44, 46, 14);
		getContentPane().add(lblNewLabel);
		
		lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(68, 79, 82, 14);
		getContentPane().add(lblContrasea);
		
		textUsr = new JTextField();
		textUsr.setBounds(173, 41, 164, 20);
		getContentPane().add(textUsr);
		textUsr.setColumns(10);
		
		txtpwd = new JButton("Login");
		txtpwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				miControlador.login();
			}
		});
		txtpwd.setBounds(173, 134, 164, 23);
		getContentPane().add(txtpwd);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(142, 120, 164, 14);
		getContentPane().add(lblNewLabel_1);
		
		password = new JPasswordField();
		password.setBounds(173, 76, 164, 20);
		getContentPane().add(password);

	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public String getUsr() {
		
		return textUsr.getText();
	}

	public String getpwd() {
		// TODO Auto-generated method stub
		return null;
	}

}
