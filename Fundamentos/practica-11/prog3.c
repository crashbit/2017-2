#include <stdio.h>

int main(){
	int x;
	int *p;

	x = 20;
	p = &x;

	printf("Contenido %d \t\t Ubicación en memoria %p", x, &x);
	printf("\nContenido %p \t\t Ubicación en memoria %p", p, &p);
	printf("\n%d", *p);
	*p = 30;
	printf("\n%d", x);

	printf("\n\n");
	return 0;
}