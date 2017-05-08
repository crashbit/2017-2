#include <stdio.h>
#include <string.h>

int main(){
	struct Alumno{
		int id;
		int edad;
		char nombre[20];
	};

	struct Alumno unam[2];

	unam[0].id = 1;
	unam[0].edad = 20;
	strcpy(unam[0].nombre,"Jelipe");

	unam[1].id = 2;
	unam[1].edad = 21;
	strcpy(unam[1].nombre,"Felipe");

	printf("\n%d\t%d\t%s",unam[0].id, unam[0].edad, unam[0].nombre);
	printf("\n%d\t%d\t%s",unam[1].id, unam[1].edad, unam[1].nombre);
		printf("\nTamaño de la struct Alumno: %lu bytes", sizeof(unam));

	printf("\n\n");
	return 0;
}