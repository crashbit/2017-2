/* Dada una cadena eliminar las vocales */

#include <stdio.h>
#include <string.h>

int main(){

	char cadena[100];
	char nueva_cadena[100];
	char vocales[10]="aeiouAEIOU";
	int largo;
	int i,j, k=0;
	int es_vocal = 1;

	printf("Teclea una cadena sin espacios ");
	scanf("%s", cadena);

	largo = strlen(cadena);

	for(i=0; i<largo; i++){

		for(j=0;j<10;j++){
			if(cadena[i]==vocales[j])
				cadena[i]=' ';
		}
	}

	for(i=0;i<strlen(cadena);i++){
		printf("%c", cadena[i]);
	}

	printf("\n\n");
	return 0;
}