public class Numeros{

	public static void main(String args[]){
		Ordena metodo = new Ordena();
		int nums[] = new int[args.length];
		int i;
		int largo = args.length;

		if(args[largo-1].compareTo("int") == 0){	
			for(i=0;i<args.length-1;i++){
				nums[i] = Integer.parseInt(args[i]);
			}

			metodo.burbuja(nums);
		}
		else{
			metodo.burbuja(args);
		}


	}
}