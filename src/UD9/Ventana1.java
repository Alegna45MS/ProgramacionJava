package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana1 extends JFrame implements ActionListener{
	private JPanel jPanel;
	private JButton jButton;
	private Ventana2 v2;
	
	public Ventana1() {
		super("Ventana1");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(true);
	}
	public void setVentana2(Ventana2 v2) {
		this.v2=v2;
	}
	private void construirPanel() {
		jPanel=new JPanel();
		add(jPanel);
		jButton = new JButton("Ir");
		jPanel.add(jButton);
		jButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		v2.setVisible(true);
		
	}
}
