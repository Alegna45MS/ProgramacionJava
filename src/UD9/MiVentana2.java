package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiVentana2 implements ActionListener {
	private JFrame ventana;
	private JPanel panel;
	private JLabel etiquetaSaluda;
	private JLabel etiquetaNombre;
	private JTextField campoNombreField;
	public MiVentana2() {
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
	
	private void agregaComponentesAlPanel() {
		etiquetaNombre=new JLabel("nombre");
		panel.add(etiquetaNombre);
		campoNombreField=new JTextField(10);
		panel.add(campoNombreField);
		JButton boton= new JButton("saluda");
		//asociamos el boton en concreto con la respuesta a dicho evento 
		boton.addActionListener(this);
		panel.add(boton);
		etiquetaSaluda=new JLabel("Hola");
		panel.add(etiquetaSaluda);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//respuesta al evento del click de raton
		String saludoString="Hola "+campoNombreField.getText();
		etiquetaSaluda.setText(saludoString);
		
	}

}
