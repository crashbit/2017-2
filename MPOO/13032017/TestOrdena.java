public class TestOrdena{

	public static void main(String args[]){
		Ordena o = new Ordena();
		int largo = args.length;
		int numbers[] = new int[largo-1];
		int i;

		if(args[largo-1].compareTo("numbers")==0){
			for(i=0;i<largo-1;i++){
				numbers[i] = Integer.parseInt(args[i]);
			}

			o.burbuja(numbers);
		}else{
			o.burbuja(args);
		}

	}



}