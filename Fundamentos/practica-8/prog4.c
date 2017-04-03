#include <stdio.h>

int main(){
	int edad_fin = 35;
	int edad_inicio = 18;

	if(edad_inicio <= 17 || edad_fin > 37)
		printf("Puedes trabajar\n");
	else
		printf("Usted no puede trabajar");

	printf("\n\n");
	return 0;
}