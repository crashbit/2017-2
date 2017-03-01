import java.util.*;

public class Carrito{
	ArrayList<ElementoCarrito> listaProductos = new ArrayList<ElementoCarrito>();

	void meterProducto(Producto prod, int cantidad){
			ElementoCarrito e = new ElementoCarrito(prod, cantidad);
			listaProductos.add(e);
	}

	void MuestraProductos(){
		int i=0;
		System.out.println("Tienes " + listaProductos.size());
		while(!listaProductos.isEmpty()){
			ElementoCarrito e = listaProductos.remove(i);
			System.out.println(e.elemento + ", cantidad : " + e.cantidad);
		}
	}
}