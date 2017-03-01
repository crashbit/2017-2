import java.util.*;

public class ArrayListDemo{

	public static void main(String args[]){
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);		
		numeros.add(10);		
		numeros.add(22);		
		numeros.add(33);		
		numeros.add(41);		
		numeros.add(52);
		numeros.add(52);
		numeros.add(52);
		numeros.add(52);
		numeros.add(52);
		numeros.add(52);
		numeros.add(5289);
		System.out.println(numeros);
		System.out.println(numeros.contains(410));		
	}
}