package Carrito;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CarritoVentana extends JFrame implements ActionListener {
	static Connection miConexion;
	static Statement miStatement;
	private HashMap<Integer, Integer> listaCompra;
	private ArrayList<Producto> productos;
	private JPanel panel;
	private JLabel	codigo,unidades,lista;
	private JTextField JTCodigo,JTUnidades;
	private JButton JBAnyadir,JBMostrar,JBHacer;
	
	public CarritoVentana() {
		super("Carrito");
		productos=new ArrayList<Producto>();
		listaCompra = new HashMap<Integer, Integer>();
		llenarArray();
		setBounds(100,100,450,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		construirPanel();
		setVisible(true);
	}
	private void construirPanel() {
		panel=new JPanel();
		add(panel);
		codigo=new JLabel("Cod_producto");
		panel.add(codigo);
		JTCodigo=new JTextField(2);
		panel.add(JTCodigo);
		unidades=new JLabel("Unidades");
		panel.add(unidades);
		JTUnidades=new JTextField(2);
		panel.add(JTUnidades);
		JBAnyadir=new JButton("Añadir carrito");
		panel.add(JBAnyadir);
		JBMostrar=new JButton("Mostar lista");
		panel.add(JBMostrar);
		lista=new JLabel("...");
		panel.add(lista);
		JBHacer=new JButton("Hacer pedido");
		panel.add(JBHacer);
		JBAnyadir.addActionListener(this);
		JBMostrar.addActionListener(this);
		JBHacer.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==JBAnyadir) {
			insertarCarrito();
		}
		if(e.getSource()==JBMostrar){
			mostrarListaCompra();
		}
		if(e.getSource()==JBHacer){
			actualizarBase();
		}
		
	}
	public void llenarArray() {
		String consulta="Select * from producto;";
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Productos", "user","password");
			miStatement = miConexion.createStatement();
			ResultSet miResultset=miStatement.executeQuery(consulta);
			if(miResultset.next()) {
				Producto p = new Producto(miResultset.getInt("cod_producto"),miResultset.getString("nombre_prod"),miResultset.getInt("stock"));
				productos.add(p);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public boolean existeProducto() {
		int codigo=Integer.parseInt(JTCodigo.getText());
		for(int i=0;i<productos.size();i++) {
			if (codigo==productos.get(i).getCod_producto()) {
				return true;
			}
		}
		return false;
	}
	public boolean hayStock() {
		int unidades=Integer.parseInt(JTUnidades.getText());
		int codigo=Integer.parseInt(JTCodigo.getText());
		for(int i=0;i<productos.size();i++) {
			if (codigo==productos.get(i).getCod_producto()) {
				if(unidades<=productos.get(i).getStock()) {
					return true;
				}
			}
		}
		return false;
	}
	public void insertarCarrito() {
		if(existeProducto() && hayStock()) {
		int codigo=Integer.parseInt(JTCodigo.getText());
		int unidad=Integer.parseInt(JTUnidades.getText());
		listaCompra.put(codigo, unidad);
		}
	}
	public void actualizarBase() {
		Set<Integer> claves = listaCompra.keySet();
		String consulta="Select * from producto;";
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Productos", "user","password");
			miStatement = miConexion.createStatement();
			ResultSet miResultset=miStatement.executeQuery(consulta);
			
			/*if(miResultset.next()) {
				for (Integer key : claves) {
					if(key==miResultset.getInt("cod_producto")) {
						int resultado=miResultset.getInt("stock")-listaCompra.get(key);
						String update="UPDATE producto SET stock='"+resultado+" where cod_producto='"+key+"';";
						miStatement.executeUpdate(update);
					}
				}
			}*/
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void mostrarListaCompra() {
	}
}
