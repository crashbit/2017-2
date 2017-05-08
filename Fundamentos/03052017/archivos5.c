#include <stdio.h>
#include <stdlib.h>

int main(){

	FILE *archivo;
	

	archivo = fopen("datos.txt", "a"); //a = append sobreescritura

	fputc('A', archivo);
	fputs("\njelipe", archivo);

	fclose(archivo);

	return 0;
}