#include <stdio.h>
#include <string.h>

int main(){
	char nombre[20];
	int i, largo;
	printf("Teclea un nombre: ");
	scanf("%s", nombre);
	largo = strlen(nombre);

	for(i=largo-1;i>=0;i--){
		printf("%c", nombre[i]);
	}

	printf("\n\n");
	return 0;
}