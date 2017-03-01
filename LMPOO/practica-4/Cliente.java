public class Cliente extends Usuario{
	Carrito carrito;

	public Cliente(String nombre){
		super(nombre);
		setRol("Cliente");
		carrito = new Carrito();
	}

	void agregarProducto(Producto p, int c){
		carrito.meterProducto(p, c);
	}

}