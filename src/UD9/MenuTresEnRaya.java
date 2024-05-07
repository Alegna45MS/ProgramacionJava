package UD9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuTresEnRaya extends JFrame implements ActionListener{
	private JPanel jPanel;
	private JButton jB_JVSJ,jB_JVSM;
	private TresEnRayaVentana v2;
	private TresEnRayaJVSM v3;
	
	public MenuTresEnRaya() {
		super("Menu principal");
		setBounds(100, 100, 250, 270);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(true);
	}
	private void construirPanel() {
		jPanel = new JPanel();
		add(jPanel);
		jB_JVSJ=new JButton();
		jPanel.add(jB_JVSJ);
		jB_JVSM=new JButton();
		jPanel.add(jB_JVSM);
		jB_JVSJ.addActionListener(this);
		jB_JVSM.addActionListener(this);
	}
	public void setTresEnRayaJVSJ( TresEnRayaVentana v2) {
		this.v2=v2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		v2.setVisible(true);
		
	}
}
