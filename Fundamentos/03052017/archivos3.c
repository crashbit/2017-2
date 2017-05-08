#include <stdio.h>
#include <stdlib.h>

int main(){

	FILE *archivo;
	int numero;
	int total;

	archivo = fopen("numeros.txt", "r");

	if(archivo == NULL){
		printf("No existe el archivo :(");
		return 0;
	}

	printf("\n\n--------INICIO DE ARCHIVO---------\n\n");
	
	total = 0;
	while(!feof(archivo)){
		numero = 0;
		fscanf(archivo,"%d", &numero);
		total = total+numero;
	}
	printf("El gran total es: %d", total);
	printf("\n\n-------FIN DE ARCHIVO-------\n\n");
	fclose(archivo);
	printf("\n\n");
	return 0;
}