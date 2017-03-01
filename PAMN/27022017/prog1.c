#include <stdio.h>

int main(){
	FILE *fp;
	char c;

	fp = fopen("hola.txt", "r");

	if(fp == NULL){
		printf("No existe el archivo :P \n\n");
		return 0;
	}

	while(c!=EOF){
		c = fgetc(fp);
		printf("%c ", c);
	}

	printf("\n\n");
}