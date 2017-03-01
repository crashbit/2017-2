public class Usuario{
	private int id = 0;
	private static int contador;
	private	String nombre;
	private String rol;

	public Usuario(String nom){
		nombre = nom;
		contador = contador + 1;
		id = contador;
		rol = "Usuario";
	}

	public Usuario(){
		nombre = "Don nadie";
		contador = contador + 1;
		id = contador;
		rol = "Usuario";
	}

	public String toString(){
		return "Yo me llamo " + nombre + " soy un " + rol + " y mi id es: " + id;
	}

	public void setNombre(String nom){
		nombre = nom;
	}

	public String getNombre(){
		return nombre;
	}

	public void setRol(String rol){
		this.rol = rol;
	}

	public String getRol(){
		return this.rol;
	}

}
