/* Programa que realiza la serie de fibonacci */

#include <stdio.h>

int main(){
	int sem1, sem2, total = 0;
	int i;
	int n;
	printf("Cuantos números de la serie de fibonacci desea: ");
	scanf("%d", &n);

	sem1=sem2=1;

	for(i=0;i<n;i++){
		total = sem1 + sem2;
		sem1 = sem2;
		sem2 = total;
		printf("%d ", total);
	}

	printf("\n\n");
	return 0;
}