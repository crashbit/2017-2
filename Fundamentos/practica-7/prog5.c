#include <stdio.h>

int main(){
	int x;
	float y;

	printf("Introduce un entero:");
	scanf("%d", &x);

	printf("Introduce un flotante");
	scanf("%f", &y);

	printf("Usted tecleo: %d y %f\n\n", x, y);

	return 0;
}