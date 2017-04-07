public class Alumno{
	public void evalua(int cal) throws AlumnoException{
		if(cal < 6) throw new AlumnoException("No lo repruebes");
	}
}