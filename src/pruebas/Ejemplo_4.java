package pruebas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JInternalFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JTabbedPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

public class Ejemplo_4 extends JFrame {
	private JButton btnok;
	private JTextField txtnombre;
	private JLabel nombre;
	private JComboBox comboBox;
	private JCheckBox chckbxNewCheckBox;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JList milista;

	public Ejemplo_4() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));

		setBounds(100, 100, 443, 339);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		nombre = new JLabel("Nombre: ");
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nombre.setBounds(32, 11, 112, 39);
		getContentPane().add(nombre);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(100, 23, 184, 20);
		getContentPane().add(txtnombre);
		txtnombre.setColumns(10);
		
		btnok = new JButton("OK");
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtnombre.getText());
				comboBox.addItem(txtnombre.getText());
				System.out.println(chckbxNewCheckBox.isSelected());
				//System.out.println("la contraseña es: " + passwordField.getText());
				System.out.println(passwordField.getPassword());
				
				
				
			}
		});
		btnok.setBounds(316, 253, 89, 23);
		getContentPane().add(btnok);
		
		comboBox = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Opcion 1", "Opcion 2", "Opcion 3"}));
		comboBox.setBounds(32, 103, 163, 23);
		getContentPane().add(comboBox);
		
		chckbxNewCheckBox = new JCheckBox("Pregunta ");
		chckbxNewCheckBox.setBounds(270, 103, 97, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(124, 61, 161, 20);
		getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Contraseña:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(32, 61, 104, 14);
		getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String texto = ((JRadioButton)e.getSource()).getText();
				if (e.getStateChange()==ItemEvent.DESELECTED)
				System.out.format( "Botón %s deseleccionado.\n",texto);
				else if (e.getStateChange()==ItemEvent.SELECTED)
				System.out.format ( "Botón %s seleccionado.\n",texto);
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(316, 22, 109, 23);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String texto = ((JRadioButton)e.getSource()).getText();
				if (e.getStateChange()==ItemEvent.DESELECTED)
				System.out.format( "Botón %s deseleccionado.\n",texto);
				else if (e.getStateChange()==ItemEvent.SELECTED)
				System.out.format ( "Botón %s seleccionado.\n",texto);
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(316, 60, 109, 23);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1000, 1000, 2000, 1));
		spinner.setBounds(32, 137, 89, 20);
		getContentPane().add(spinner);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 181, 97, 39);
		getContentPane().add(scrollPane);
		
		milista = new JList();
		scrollPane.setViewportView(milista);
		milista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		milista.setModel(new AbstractListModel() {
			String[] values = new String[] {"DAM", "ASIR"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejemplo_4 n = new Ejemplo_4();
	}
}