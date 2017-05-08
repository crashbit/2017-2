#include <stdio.h>
#include <stdlib.h>

int main(){

	FILE *archivo;
	

	archivo = fopen("datos.txt", "w"); //w = write

	fputc('A', archivo);
	fputs("\njelipe", archivo);

	fclose(archivo);

	return 0;
}