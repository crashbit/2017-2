import java.util.*;

public class Util{

	public static void main(String args[]){

		Scanner teclado = new Scanner(System.in);
		String cadena;
		int numero;

		cadena = teclado.nextLine();
		numero = teclado.nextInt();
		System.out.println(cadena);
		System.out.println(numero * 3);  


	}
}