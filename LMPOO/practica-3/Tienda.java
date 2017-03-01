public class Tienda{
	public static void main(String args[]){
		Usuario itzel = new Usuario("Itzelita");
		Usuario pedro = new Usuario();
		Usuario luis = new Usuario("Luis");

		Cliente erick = new Cliente("Erick");

		Cajero jose = new Cajero("Jose");

		Proveedor rosa = new Proveedor("Rosa");

		System.out.println(itzel);
		System.out.println(pedro);
		System.out.println(luis);
		
		System.out.println(erick);
		System.out.println(jose);
		System.out.println(rosa);




	}
}