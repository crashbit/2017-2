public class Convierte{

	public static void main(String args[]){
		int binario=0;
		int i=1;
		int decimal=25;
		int res;

		while(decimal !=0){
			res = decimal%2;
			decimal = decimal/2;
			binario = binario + (res * i);
			i = i * 10;
		}

		System.out.println(binario);
	}

}