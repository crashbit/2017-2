#include <stdio.h>

int main(){

	FILE *archivo;
	char c;

	archivo = fopen("hola.txt", "r");

	if(archivo == NULL){
		printf("No existe el archivo :(");
		return 0;
	}

	printf("\n\n--------INICIO DE ARCHIVO---------\n\n");
	
	while(c!=EOF){
		c = fgetc(archivo);
		printf("%c", c);
	}

	printf("\n\n-------FIN DE ARCHIVO-------\n\n");
	fclose(archivo);
	printf("\n\n");
	return 0;
}