public class Alumno{

	private static int contador =0;
	int id = 0;
	int edad;
	private String nombre;

	public Alumno(){
		nombre = "don nadie";
		edad = 18;
		contador = contador + 1;
		id = contador;
	}

	public Alumno(int e){
		
	}

	void setNombre(String nom){
		nombre = nom;
	}

	String getNombre(){
		return nombre;
	}

	public String toString(){
		return "Yo soy " + nombre + " mi edad es: " + edad + " mi id es: " + id;
	}


}