#include <stdio.h>

int main(){

	FILE *archivo;
	char c;

	archivo =  fopen("hola.txt", "r");

	if(archivo == NULL){
		printf("El archivo no existe");
		return 0;
	}

	while(c != EOF){
		c = fgetc(archivo);
		printf("%c\n", c);
	}

	fclose(archivo);

	printf("\n\n");
}