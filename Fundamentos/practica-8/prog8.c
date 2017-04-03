#include <stdio.h>

int main(){

	enum boolean {NO, SI};
	enum semana {LUNES, MARTES=15, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};
	enum boolean verdad;
	verdad = SI;

	printf("%d", verdad);

	printf("\n %d", LUNES);
	printf("\n %d", MARTES);
	printf("\n %d", MIERCOLES);
	printf("\n %d", JUEVES);
	printf("\n %d", VIERNES);
	printf("\n %d", SABADO);
	printf("\n %d", DOMINGO);

	printf("\n\n");
	return 0;
}