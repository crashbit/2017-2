#include <stdio.h>

int main(){
	char nombre[20]="Alumnos";
	char *p;

	p = nombre;
	printf("%c -> %p\n", *p, p);
	p++;
	printf("%c -> %p\n", *p, p);
	p++;
	printf("%c -> %p\n", *p, p);
	p++;
	printf("%c -> %p\n", *p, p);
	p++;
	printf("%c -> %p\n", *p, p);
	p++;
	printf("%c -> %p\n", *p, p);
	p++;
	printf("%c -> %p\n", *p, p);
	p++;
	printf("%c -> %p\n", *p, p);

	printf("\n\n");

	return 0;
}