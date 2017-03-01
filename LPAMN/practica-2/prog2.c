#include <stdio.h>

int main(){

	int x = 23;
	int *p;

	p = &x;

	printf("\n %p", &x);
	printf("\n %d", *p);

	*p = 88;

	printf("\n %d", x);
	printf("\n %d", *p);

	printf("\n\n");


}