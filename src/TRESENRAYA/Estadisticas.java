package TRESENRAYA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Estadisticas extends JFrame implements ActionListener {
	private JPanel panel;
	private JButton JBVolver;
	private Menu menu;
	
	public Estadisticas() {
		super("Estadisticas");
		setBounds(200, 200, 250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(false);
	}
	public void setMenu(Menu ventana) {
		this.menu=ventana;
	}
	public void construirPanel() {
		panel=new JPanel();
		add(panel);
		JBVolver=new JButton("Volver");
		panel.add(JBVolver);
		JBVolver.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		menu.setVisible(true);
	}

}
