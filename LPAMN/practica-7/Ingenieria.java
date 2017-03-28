public class Ingenieria extends Alumno{

	public Ingenieria(){
		edad = 20;
		setNombre("Don Sr. Ingeniero");
	}

	public Ingenieria(int e){
		super(e);
		edad = e;
	}
}