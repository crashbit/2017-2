public class Producto{

	private String nombre;
	private float precio;
	private int inventario;

	public Producto(String nom, float precio){
		this.nombre = nom;
		this.precio = precio;
		this.inventario = 0;
	}

	public Producto(String nom, float precio, int inventario){
		this.nombre = nom;
		this.precio = precio;
		this.inventario = inventario;
	}

	public String toString(){
		return "Producto " + nombre;
	}

	float getPrecio(){
		return this.precio;
	}

}