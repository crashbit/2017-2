#include <stdio.h>

int main(){
	FILE *fp;
	char c[5];

	fp = fopen("hola.txt", "r");

	if(fp == NULL){
		printf("No existe el archivo :P \n\n");
		return 0;
	}

	while(!feof(fp)){
		fgets(c, 5, fp);
		printf("%s ", c);
	}

	printf("\n\n");
}