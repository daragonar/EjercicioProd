package servlet;

import java.util.ArrayList;

public class GestorProducto {
	ArrayList<Producto> productos= new ArrayList<>();
	public GestorProducto()
	{
		Producto p;
	p= new Producto("Platano", "img/zucchini-1605792_960_720.jpg", "Esto es un platano");
	productos.add(p);
	p = new Producto("Calabacin", "img/zucchini-1605792_960_720.jpg", "Esto es un calabacin");
	productos.add(p);
	p= new Producto("Pera", "img/zucchini-1605792_960_720.jpg", "Esto es un platano");
	productos.add(p);
	p = new Producto("Fresas", "img/zucchini-1605792_960_720.jpg", "Esto es un calabacin");
	productos.add(p);
	p= new Producto("Manzana", "img/zucchini-1605792_960_720.jpg", "Esto es un platano");
	productos.add(p);
	p = new Producto("Acelgas", "img/zucchini-1605792_960_720.jpg", "Esto es un calabacin");
	productos.add(p);
	}
	
	public Producto getProducto(int i)
	{
		return this.productos.get(i);
	}
	
	public ArrayList<Producto> getProductos()
	{
		return this.productos;
	}
}
