#include <stdio.h>

int main(){
	char sexo = 'm';
	int edad = 18;

	if(sexo=='f' && edad >= 18)
		printf("Puedes entrar a la cantina\n");
	else
		printf("Usted no puede entrar");

	printf("\n\n");
	return 0;
}