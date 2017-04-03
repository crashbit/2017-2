#include <stdio.h>

int main(){

	float A;
	float B;
	float error;

	printf("Introduzca el par de valores A,B: ");
	scanf("%f,%f", &A, &B);

	error = A<B ? B-A:A-B;

	printf("El resultado es: %f", error);
	printf("\n\n");
	return 0;
}