public class Ordena{

	void burbuja(int arreglo[]){
		int i, j, temp;

		for(i=0;i<arreglo.length;i++){
			for(j=i+1;j<arreglo.length;j++){
				if(arreglo[i]<arreglo[j]){
					temp = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temp;
				}
			}
		}

		for(i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]);
		}

	}

	void burbuja(String arreglo[]){
		int i, j; 
		String temp;

		for(i=0;i<arreglo.length;i++){
			for(j=i+1;j<arreglo.length;j++){
				if(arreglo[i].compareTo(arreglo[j])>0){
					temp = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temp;
				}
			}
		}

		for(i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]);
		}

	}

}