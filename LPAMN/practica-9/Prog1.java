public class Prog1{

	public static void main(String args[]){

		int x, y;
		x= 1;
		y= 1;

		try{
			System.out.println(x/y);
			System.out.println(args[1]);

		}catch(ArithmeticException e){
			System.out.println("Aprende a dividir... LOL");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Faltan parametros");
		}

		System.out.println("Fin del programa");

	}
}