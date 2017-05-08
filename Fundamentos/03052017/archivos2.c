#include <stdio.h>
#include <stdlib.h>

int main(){

	FILE *archivo;
	char c[2];

	archivo = fopen("numeros.txt", "r");

	if(archivo == NULL){
		printf("No existe el archivo :(");
		return 0;
	}

	printf("\n\n--------INICIO DE ARCHIVO---------\n\n");
	
	while(c[0]!=EOF){
		c[0] = fgetc(archivo);
		printf("\n%d,", atoi(c));
		if(atoi(c)!=0) printf("\nSuma: %d", (atoi(c)+10));
	}

	printf("\n\n-------FIN DE ARCHIVO-------\n\n");
	fclose(archivo);
	printf("\n\n");
	return 0;
}