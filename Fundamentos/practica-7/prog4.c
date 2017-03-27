#include <stdio.h>

int main(){
	char nombre[6];

	nombre[0]='G';
	nombre[1]='e';
	nombre[2]='r';
	nombre[3]='m';
	nombre[4]='a';
	nombre[5]='n';

	printf("Mi nombre es: %s\n", nombre);
	printf("Mi letra inicial es: %c y la final es: %c", nombre[0], nombre[5]);


	return 0;
}