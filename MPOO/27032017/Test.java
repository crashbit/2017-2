public class Test{

	public static void main(String args[]){

		String linea = "german,30,20,10";
		String []items = linea.split(",");

		System.out.println(items[0]);
		System.out.println(items[1]);
		System.out.println(items[2]);
		System.out.println(items[3]);
	}


}