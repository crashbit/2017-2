public class Test1{

	public static void saludos(Alumno a){
		a.saludar();
	}

	public static void main(String args[]){

		Alumno pedro = new Ingenieria();
		Alumno jorge = new Contaduria();

		pedro.leer();
		jorge.leer();
		System.out.println(jorge);
		System.out.println(pedro);

		saludos(pedro);
		saludos(jorge);
	}
}