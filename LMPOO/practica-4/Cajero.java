public class Cajero extends Usuario{
	public Cajero(String nom){
		super(nom);
		setRol("Cajero");
	}

	void cobrarCliente(Cliente cliente){
		int i=0;
		float total=0;
		int totalProductos = cliente.carrito.listaProductos.size();

		System.out.println("El carrito tiene: " + totalProductos);

		while(!cliente.carrito.listaProductos.isEmpty()){
			ElementoCarrito e = cliente.carrito.listaProductos.remove(i);
			float precio = e.elemento.getPrecio();
			total = total + e.cantidad * precio;
			System.out.println(e.elemento + ", cantidad : " + e.cantidad + " total: " + (precio*e.cantidad));
		}

		System.out.println("Total a pagar: " + total);
	}
}