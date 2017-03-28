/* Cuenta las vocales en un arreglo */

#include <stdio.h>
#include <string.h>

int main(){
	char cadena[100];
	char vocales[10] = "aeiouAEIOU";
	int i,j, contador=0;
	int largo;

	printf("Teclea una cadena sin espacios ");
	scanf("%s", cadena);

	largo = strlen(cadena);

	for(i=0; i<largo; i++){
		for(j=0;j<10;j++){
			if(cadena[i]==vocales[j])
				contador = contador + 1;
		}
	}

	printf("El total de vocales es: %d ", contador);

	printf("\n\n");
	return 0;
}