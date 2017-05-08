#include <stdio.h>

int main(){
	int arreglo[4][4]={{1,0,0,0}, {0,1,0,0}, {0,0,1,0}, {0,0,0,1}};
	int i,j;

	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			printf("%d ", arreglo[i][j]);
		}
		printf("\n");
	}
	printf("\n\n");
	return 0;
}