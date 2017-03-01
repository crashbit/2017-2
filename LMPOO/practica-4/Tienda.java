public class Tienda{
	public static void main(String args[]){
		Cliente itzel = new Cliente("Itzel");
		Cliente sofia = new Cliente("Sofia");
		Cajero alex = new Cajero("Alex");

		Producto naranja = new Producto("naranja", 20);
		Producto manzana = new Producto("manzana", 30);
		Producto pinna = new Producto("piña", 40);
		Producto lapices = new Producto("lapices", 10, 20);

		Producto peras = new Producto("peras", 30);

		itzel.agregarProducto(naranja, 3);
		itzel.agregarProducto(manzana, 1);
		itzel.agregarProducto(pinna, 5);
		itzel.agregarProducto(pinna, 10);

		sofia.agregarProducto(peras, 2)

		alex.cobrarCliente(itzel);

		
	}
}