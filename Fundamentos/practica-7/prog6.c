#include <stdio.h>

int main(){
	int valor_inicial;
	int valor_final;
	int x;
	int resultado;

	printf("Introduzca el valor inicial: ");
	scanf("%d", &valor_inicial);

	printf("Introduzca el valor final: ");
	scanf("%d", &valor_final);

	printf("X\t\t\b\bf(x)=x*x");
	for(x=valor_inicial; x<=valor_final; x++){
		printf("%d\t\t%d\n", x, (x*x));
	}



	return 0;
}