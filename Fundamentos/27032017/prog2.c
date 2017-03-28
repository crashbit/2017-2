/* Devuelve el largo de una cadena que introduce el usuario */

#include <stdio.h>
#include <string.h>

int main(){

	char cadena[100];
	int largo;

	printf("Introduce una cadena: ");
	scanf("%s", cadena);

	largo = strlen(cadena);
	printf("El largo de la cadena '%s' es de %d caracteres", cadena, largo);

	printf("\n\n");
	return 0;
}