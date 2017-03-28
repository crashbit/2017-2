public class Test{

	public static void main(String args[]){
		Operacion op = new Operacion();
		float resultado;
		try{
			resultado = op.restar(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			System.out.println(resultado);
		}catch(ArrayIndexOutOfBoundsException var){
			System.out.println("Faltan parametros");
		}catch(ArithmeticException var){
			System.out.println("Los valores no deben ser cero");
		}

	}

}