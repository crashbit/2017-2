#include <stdio.h>
#include <stdlib.h>

int main(){

	FILE *archivo;
	int id = 33;
	float promedio = 6.78;
	char nombre[10]="Jelipe";

	archivo = fopen("datos.txt", "w"); 
	fprintf(archivo, "%d \t %s \t %.2f", id, nombre, promedio);


	fclose(archivo);

	return 0;
}