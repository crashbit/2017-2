#include <stdio.h>

int main(){
	FILE *fp;
	int total;
	int x;

	fp = fopen("numeros.txt", "r");

	if(fp == NULL){
		printf("No existe el archivo :P \n\n");
		return 0;
	}

	total = 0;
	while(!feof(fp)){
		x =0;
		fscanf(fp, "%d,", &x);
		total = total + x;
	}
	printf("este es el total: %d", total);

	printf("\n\n");
}