#include <stdio.h>

int main(){

	int matriz[3][3];
	int i, j;

	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			printf("%p ", &matriz[i][j]);
		}
		printf("\n");
	}

	printf("\n\n");
}