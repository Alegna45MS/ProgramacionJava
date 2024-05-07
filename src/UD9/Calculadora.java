package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {
	private JPanel jPanel;
	private JButton BTsuma,BTresta,BTmultiplicar,BTdividir;
	private JLabel operador,igual;
	private JTextField TBoperador1,TBoperador2,TBResultado;
	
	public Calculadora() {
		super("Calculadora");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		construirBotones();
		setVisible(true);
	}
	private void construirPanel() {
		jPanel=new JPanel();
		add(jPanel);
		TBoperador1=new JTextField(5);
		jPanel.add(TBoperador1);
		operador=new JLabel("operador");
		jPanel.add(operador);
		TBoperador2=new JTextField(5);
		jPanel.add(TBoperador2);
		igual=new JLabel("=");
		jPanel.add(igual);
		TBResultado=new JTextField(5);
		jPanel.add(TBResultado);
	}
	private void construirBotones() {
		BTsuma=new JButton("+");
		BTresta=new JButton("-");
		BTmultiplicar=new JButton("*");
		BTdividir=new JButton("/");
		jPanel.add(BTsuma);
		jPanel.add(BTresta);
		jPanel.add(BTmultiplicar);
		jPanel.add(BTdividir);
		BTsuma.addActionListener(this);
		BTresta.addActionListener(this);
		BTmultiplicar.addActionListener(this);
		BTdividir.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int op1,op2;
		String suma,resta,multiplicacion,division;
		op1=Integer.parseInt(TBoperador1.getText());
		op2=Integer.parseInt(TBoperador2.getText());
		if(e.getSource()==BTsuma) {
			operador.setText("+");
			suma=Integer.toString(op1+op2);
			TBResultado.setText(suma);
		}else if(e.getSource()==BTresta) {
			operador.setText("-");
			resta=Integer.toString(op1-op2);
			TBResultado.setText(resta);
		}else if(e.getSource()==BTmultiplicar) {
			operador.setText("*");
			multiplicacion=Integer.toString(op1*op2);
			TBResultado.setText(multiplicacion);
		}else {
			operador.setText("/");
			division=Integer.toString(op1/op2);
			TBResultado.setText(division);
		}
		
	}

}
