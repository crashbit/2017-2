public class Prog2{

	public static void main(String args[]){

		int x, y;
		x= 1;
		y= 0;

		try{
			System.out.println(args[1]);
			System.out.println(x/y);

		}catch(ArithmeticException e){
			System.out.println("Hubo un error pero no se cuál fue");			
			e.printStackTrace(System.err);			
		}finally{
			System.out.println("Bloque finally");
		}

		System.out.println("Fin del programa");

	}
}