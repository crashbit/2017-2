/* Trabajo con cadenas 1*/

#include <stdio.h>
#include <string.h>


int main(){
	char nombre[10]= "German";
	int i;
	int largo;

	largo = strlen(nombre);
	printf("El largo de la cadena es: %d\n", largo);

	for(i=0;i<strlen(nombre); i++){
		printf("%c\n", nombre[i]);
	}


	printf("\n\n");
	return 0;
}