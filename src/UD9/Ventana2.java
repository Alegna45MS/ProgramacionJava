package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana2 extends JFrame implements ActionListener{
	private JPanel jPanel;
	private JButton jButton;
	private Ventana1 v1;
	
	public Ventana2(){
		super("Ventana2");
		setBounds(90,90,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(false);
	}
	public void setVentana1(Ventana1 v1) {
		this.v1=v1;
	}
	private void construirPanel() {
		jPanel=new JPanel();
		add(jPanel);
		jButton = new JButton("volver");
		jPanel.add(jButton);
		jButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		v1.setVisible(true);
		
	}
}
