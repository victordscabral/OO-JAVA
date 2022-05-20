package leitura;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

// Classe focada em leitura
public class Leitura {
	public static String lerEntrada(JTextField entrada) {
		return entrada.getText();
	}

	public static String lerEntrada(JRadioButton entrada) {
		return entrada.getText();
	}

	public static String lerEntrada(JComboBox<String> entrada) {
		return entrada.getSelectedItem().toString();
	}
}
