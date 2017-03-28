/* pasa de minusculas a mayusculas */
/* pasa de mayusculas a minusculas */

#include <stdio.h>
#include <ctype.h>
#include <string.h>
int main(){
	char cadena[100];
	int largo;
	int i;

	printf("Introduzca una cadena");
	scanf("%s", cadena);

	largo= strlen(cadena);

	for(i=0;i<largo;i++){
		printf("%c", toupper(cadena[i]));
	}

	printf("\n\n");

	for(i=0;i<largo;i++){
		printf("%c", tolower(cadena[i]));
	}

	printf("\n\n");
	return 0;
}


