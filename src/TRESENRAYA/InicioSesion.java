package TRESENRAYA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import UD9.Ventana2;

public class InicioSesion extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel usuario,contraseña;
	private JTextField JTUsuario,JTContraseña;
	private JButton inicio;
	private Menu menu;
	
	public InicioSesion() {
		super("Iniciar sesion");
		setBounds(100, 100, 250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(true);
	}
	public void setMenu(Menu ventana) {
		this.menu=ventana;
	}
	public void construirPanel() {
		panel=new JPanel();
		add(panel);
		usuario=new JLabel("Usuario");
		panel.add(usuario);
		JTUsuario=new JTextField(10);
		panel.add(JTUsuario);
		contraseña=new JLabel("Contraseña");
		panel.add(contraseña);
		JTContraseña=new JTextField(10);
		panel.add(JTContraseña);
		inicio=new JButton("INICIAR");
		panel.add(inicio);
		inicio.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		menu.setVisible(true);
		
	}
	
}
