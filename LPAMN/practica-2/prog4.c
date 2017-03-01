#include <stdio.h>
#include <stdlib.h>

int main(){

	int *p;

	p = (int *)malloc(sizeof(int));
	*p = 33;
	printf("\n %p -> %d", p, *p);
	p++;
	*p = 22;
	printf("\n %p -> %d", p, *p);
	p++;
	*p = 55;
	printf("\n %p -> %d", p, *p);
	p[3] = 37;
	p++;
	p++;
	p++;
	printf("\n %p -> %d", p, *p);






	printf("\n\n");
}