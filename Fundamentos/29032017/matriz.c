#include <stdio.h>

int main(){
	int matriz[4][3]={{1,2,3},{4,5,6},{7,8,9}, {10, 11, 12}};

	int i, j;

	for(i=0; i< 4; i++){
		for(j=0; j<3; j++){
			printf("%d\t", matriz[i][j]);
		}
		printf("\n");
	}


	printf("\n\n");
	return 0;
}