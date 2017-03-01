public class Tienda{
	public static void main(String args[]){
		Carrito car = new Carrito();
		Producto naranja = new Producto("naranja", 20);
		Producto manzana = new Producto("manzana", 30);
		Producto pinna = new Producto("piña", 40);

		car.meterProducto(naranja, 3);
		car.meterProducto(manzana, 1);
		car.meterProducto(pinna, 2);

		car.MuestraProductos();
	}
}