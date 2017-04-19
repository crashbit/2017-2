#include <stdio.h>
#include <string.h>

void voltea(int arreglo[], int largo);
int *regresa();

int main(){
	int numeros[10]={1,2,3,4,5,6,7,8,9,0};
	int *valor;

	voltea(numeros, 10);
	valor = regresa();
	printf("\n%d, %d", valor[0], valor[1]);

	printf("\n\n");
	return 0;
}

void voltea(int arreglo[], int largo){
	int i;

	for(i=largo-1;i>=0;i--){
		printf("%d ",arreglo[i]);
	}
}

int *regresa(){
	int i[2]={3,7};
	return i;
}

