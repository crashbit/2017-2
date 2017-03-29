public class Exception1{
	
	public static void main(String args[]){

		int x;
		try{
			
			System.out.println(1/1);
			System.out.println(args[1]);

		}catch(ArithmeticException var){
			System.out.println("Hubo error, aguas... :)");
		}catch(ArrayIndexOutOfBoundsException var){
			System.out.println("Faltan 2 parametros");
		}finally{
			System.out.println("Bloque finally");
		}

		System.out.println("Fin del programita");

	}

}
