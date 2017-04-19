/* Programa que realiza un menú */

#include <stdio.h>

int main(){
	char opcion;

	do{
		printf("\n");
		printf("\n1.- opcion 1");
		printf("\n2.- opcion 1");
		printf("\n3.- opcion 1");
		printf("\n4.- opcion 1");
		printf("\n5.- opcion 1");
		printf("\nPara continuar presion 's/S', para salir presione 'n/N'");
		setbuf(stdin, NULL); // limpia el buffer del teclado
		scanf("%c",&opcion);
		getchar();
		printf("Usted presiono %c", opcion);
	}while(opcion == 's' || opcion== 'S');


	printf("\n\n");
	return 0;
}