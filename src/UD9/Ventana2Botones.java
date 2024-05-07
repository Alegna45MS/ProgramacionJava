package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana2Botones extends JFrame implements ActionListener{
	private JPanel jPanel;
	private JButton jButton1;
	private JButton jButton2;
	
	public Ventana2Botones() {
		super("Ventana con dos botones");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(true);
	}
	private void construirPanel() {
		jPanel=new JPanel();
		jButton1=new JButton("boton 1");
		jButton1.addActionListener(this);
		jButton2=new JButton("boton 2");
		jButton2.addActionListener(this);
		jPanel.add(jButton1);
		jPanel.add(jButton2);
		add(jPanel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jButton1) {
			System.out.println("Has pulsado boton 1");
		}else {
			System.out.println("Has pulsado boton 2");
		}
		
	}
}
