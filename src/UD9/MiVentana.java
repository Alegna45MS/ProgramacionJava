package UD9;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiVentana {
	static JFrame ventana;
	static JPanel panel;
	public static void main(String[] args) {
		/*Inicialmete:
		 * 1)La ventana es invisible(Lo ultimo)
		 * 2)tiene tamaño 0
		 * 3)No esta especificado el funcionamiento
		 */
		ventana = new JFrame("Mi primera ventana");
		//establecemos la localizacion y tamaño de la ventana
		ventana.setBounds(100, 100, 200, 200);
		//establecemos el funcionamiento al cerrar la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//creamos una lamina y la añadimos a la ventana
		panel=new JPanel();
		ventana.add(panel);
		//hacemos visible la ventana
		agregaComponentesAlPanel();
		ventana.setVisible(true);
	}
	public static void agregaComponentesAlPanel() {
		JLabel etiquetaNombre=new JLabel("nombre");
		panel.add(etiquetaNombre);
		JTextField campoNombreField=new JTextField(10);
		panel.add(campoNombreField);
		JButton boton= new JButton("saluda");
		panel.add(boton);
	}

}
