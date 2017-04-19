/*Programa que realizar el factorial de un número dado */

#include <stdio.h>

int main(){
	int n;
	int total = 1;
	printf("Indique el número del cual desea obtener el factorial: ");
	scanf("%d", &n);

	while(n>1){
		total = total * n;
		n = n - 1;
		printf("%d\n", total);
	}


	printf("\n\n");
	return 0;
}