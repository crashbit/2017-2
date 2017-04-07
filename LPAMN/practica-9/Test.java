public class Test{

	public static void main(String args[]){
		Alumno telecom = new Alumno();
		Alumno computo = new Alumno();
		try{
			telecom.evalua(5);
			computo.evalua(6);			
		}catch(AlumnoException e){
			e.printStackTrace(System.err);
			System.out.println("Te volaste a un alumno, je, je, kudos!!");
		}

		System.out.println("Fin del programa");
	}
}