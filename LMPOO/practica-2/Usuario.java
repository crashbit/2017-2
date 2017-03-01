public class Usuario{
	private int id = 0;
	private static int contador;
	private	String nombre;

	public Usuario(String nom){
		nombre = nom;
		contador = contador + 1;
		id = contador;
	}

	public Usuario(){
		nombre = "Don nadie";
		contador = contador + 1;
		id = contador;
	}

	public String toString(){
		return "Yo me llamo " + nombre + " y mi id es: " + id;
	}

	public void setNombre(String nom){
		nombre = nom;
	}

	public String getNombre(){
		return nombre;
	}
}