package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Traductor extends JFrame implements ActionListener{
	private static Connection miConexion;
	private static Statement miStatement;
	private JPanel jPanel;
	private JButton traducir;
	private JTextField ingles;
	private JLabel español;
	
	public Traductor(){
		super("Traductor");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(true);
	}
	private void construirPanel() {
		jPanel=new JPanel();
		add(jPanel);
		ingles=new JTextField(10);
		jPanel.add(ingles);
		español=new JLabel("Palabra traducida");
		jPanel.add(español);
		traducir=new JButton("Traducir");
		jPanel.add(traducir);
		traducir.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==traducir) {
			String palabra=ingles.getText();
			String palabraTraducida=dameTraduccion(palabra);
			español.setText(palabraTraducida);
		}
		
	}
	private String dameTraduccion(String palabra) {
		try {
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Traductor", "user","password");
			miStatement = miConexion.createStatement();
			String consulta="Select espanyol from Traduccion where ingles="+"'"+palabra+"';";
			ResultSet miResultset=miStatement.executeQuery(consulta);
			while(miResultset.next()) {
				return miResultset.getString("espanyol");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return "Palabra no encontrada";
	}
	
}
