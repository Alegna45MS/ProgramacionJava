package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConversorPulgadas extends JFrame implements ActionListener {
	private JPanel jPanel;
	private JTextField jtPulgadas,jtCentimentros;
	private JButton jbCmAPul,jbPulACm;
	private JLabel lcentimetros,lPulgadas;
	
	public ConversorPulgadas() {
		super("ConversorVentana");
		setBounds(100,100,400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(true);
	}
	private void construirPanel() {
		jPanel=new JPanel();
		add(jPanel);
		jtCentimentros=new JTextField(10);
		jtPulgadas=new JTextField(10);
		jbCmAPul=new JButton("cm-pulgadas");
		jbPulACm=new JButton("pulgadas-cm");
		lcentimetros=new JLabel("cm");
		jPanel.add(lcentimetros);
		jPanel.add(jtCentimentros);
		lPulgadas=new JLabel("pulgadas");
		jPanel.add(lPulgadas);
		jPanel.add(jtPulgadas);
		jPanel.add(jbCmAPul);
		jPanel.add(jbPulACm);
		jbCmAPul.addActionListener(this);
		jbPulACm.addActionListener(this);
			
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbCmAPul) {
			double pulgadas=Double.parseDouble(jtCentimentros.getText());
			String resultado=String.valueOf(pulgadas/2.54);
			jtPulgadas.setText(resultado);
		}else if(e.getSource()==jbPulACm) {
			double cm=Double.parseDouble(jtPulgadas.getText());
			String resultado=String.valueOf(cm*2.54);
			jtCentimentros.setText(resultado);
		}
		
	}
	
}
