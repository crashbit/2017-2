#include <stdio.h>
#include <string.h>

int main(){

	FILE *archivo;
	char datos[5];
	

	archivo = fopen("hola.txt", "r"); //a = append sobreescritura

	
	while(!feof(archivo)){
		fgets(datos, 5, archivo);
		printf("\n%s", datos);
		strcpy(datos, "");
	}


	fclose(archivo);

	return 0;
}