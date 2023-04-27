package pruebas;

import javax.swing.*;

public class Ejemplo_1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Ventana Hola Mundo");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Hola Mundo");
		frame.getContentPane().add(label);
		// frame.pack(); tamaño comprimido a textp
		//frame.setLocationRelativeTo(null); localizacion en referencia a null
		//frame.setSize(300, 150); tamaño en px
		frame.setBounds(400,200,200,300); //posicion x e y Y tamaño en px
		frame.setVisible(true);
	}


}
