#include <stdio.h>

int main(){

	FILE *fp, *salida;
	int total, x;

	fp = fopen("numeros.txt", "r");
	salida = fopen("resultado.txt", "w");

	if(fp == NULL){
		printf("No existe el archivo :P \n");
		return 0;
	}

	total = 0;
	while(!feof(fp)){
		x = 0;
		fscanf(fp, "%d,", &x);
		total = total + x;
	}


	printf("El total es: %d", total);
	fprintf(salida, "El total es: %d", total);

	fclose(fp);
	fclose(salida);

	printf("\n\n");
}