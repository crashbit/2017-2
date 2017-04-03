#include <stdio.h>

int main(){
	int opcion;

	printf("Seleccione una opcion: \n");
	printf("\n1.- Reprobar");
	printf("\n2.- Recursar");
	printf("\n3.- Aprobar");
	
	printf("\nopcion: ");
	scanf("%d", &opcion);
	printf("\n\n");

	switch(opcion){
		case 1:
			printf("Usted desea reprobar");
			break;
		case 2:
			printf("Usted desea Recursar");
			break;
		case 3:
			printf("Usted desea aprobar, ¿en serio? :O");
			break;
		default:
			printf("A usted le da igual");
			break;
	}

	printf("\n\n");
	return 0;
}