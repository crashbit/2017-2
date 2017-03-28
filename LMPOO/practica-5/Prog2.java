public class Prog2{

	public static void main(String args[]){

		int y=1;
		int x=1;

		try{
			System.out.println(x/y);
			System.out.println(args[2]);

		}catch(ArithmeticException var){
			System.out.println("No se puede ese tipo de divisiones");
		}catch(ArrayIndexOutOfBoundsException var){
			System.out.println("Faltan argumentos");
		}
		
	}
}