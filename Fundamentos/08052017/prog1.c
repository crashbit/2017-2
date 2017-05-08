#include <stdio.h>
#include <string.h>

int main(){
	struct Alumno{
		int id;
		int edad;
		char nombre[20];
	};

	struct Alumno unam;



	unam.id = 1;
	unam.edad = 20;
	strcpy(unam.nombre,"Jelipe");

	printf("\n%d\t%d\t%s",unam.id, unam.edad, unam.nombre);
	printf("\nTamaño de la struct Alumno: %lu bytes", sizeof(struct Alumno));

	printf("\n\n");
	return 0;
}