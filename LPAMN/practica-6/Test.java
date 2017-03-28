public class Test{

	public static void main(String args[]){

		Alumno sammy = new Alumno();
		Alumno juan = new Alumno();
		Alumno peter = new Alumno();
		Alumno fulano = new Alumno(22);

		Ingenieria telecom = new Ingenieria();

		sammy.edad = 30;
		sammy.setNombre("Batman");
		sammy.id = 1;

		System.out.println(sammy.id + " Yo soy " + sammy.getNombre());
		System.out.println(juan.id + " Yo soy " + juan.getNombre());
		System.out.println(peter);
		System.out.println(telecom);
		System.out.println(fulano);
	}
}