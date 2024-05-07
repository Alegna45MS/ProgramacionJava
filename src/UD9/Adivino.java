package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Adivino extends JFrame implements ActionListener{
	private JPanel jPanel;
	private JButton mayor,menor,acertaste;
	private JLabel instruccion;
	private int num;
	private int minimo,maximo;
	
	public Adivino() {
		super("Adivinar numero");
		
		setBounds(90,90,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(true);
	}
	public void construirPanel() {
		Random random=new Random();
		jPanel=new JPanel();
		add(jPanel);
		num=random.nextInt(100)+1;
		instruccion=new JLabel("Es este tu numero?"+Integer.toString(num));
		jPanel.add(instruccion);
		mayor=new JButton("mayor");
		menor=new JButton("menor");
		acertaste=new JButton("acertaste");
		jPanel.add(mayor);
		jPanel.add(menor);
		jPanel.add(acertaste);
		mayor.addActionListener(this);
		menor.addActionListener(this);
		acertaste.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Random random=new Random();
		if(e.getSource()==mayor) {
			int numeroAle=random.nextInt(100+1-num)+num;
			instruccion.setText("Es este tu numero? "+Integer.toString(numeroAle));
			
		}else if(e.getSource()==menor) {
			int numeroAle=random.nextInt(num)+1;
			instruccion.setText("Es este tu numero? "+Integer.toString(numeroAle));
		}else {
			instruccion.setText("HAS ACERTADO");
		}
		
	}

}
