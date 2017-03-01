#include <stdio.h>

int main(){
	int arreglo[5] = {1, 2, 3, 5, 6};
	int i;

	for(i=0;i<5;i++){
		printf("%p \n", &arreglo[i]);	
	}

	printf("%lu", sizeof(int));

}