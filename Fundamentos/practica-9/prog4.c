/* Uso de define */

#include <stdio.h>

#define edadMinima 18
 
#define saludo printf("\nEste es un saludo\n");

int main(){

	int edad;

	printf("\n¿Cuantos años tienes? ");
	scanf("%d", &edad);
	if(edad >= edadMinima)
		printf("\nPuedes pasar al antro");
	else
		printf("\nUsted no puede pasar");

	saludo;
	printf("\n\n");
	return 0;
}