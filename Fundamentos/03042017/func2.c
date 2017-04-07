#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void muestraArreglo(int a[], int size);
void muestraMatriz(int m[][2], int ren);

int main(){
	int arreglo[5]={1,2,3,4,5};
	int array2[10]={1,2,3,4,5, 6, 7, 8, 9, 10};
	int matriz[3][2]={{1,2}, {3,4}, {5,6}};

	muestraArreglo(arreglo, 5);	
	muestraArreglo(array2, 10);
	muestraMatriz(matriz, 3);
        
    printf("\n\n");
    return 0;
}

void muestraArreglo(int a[], int size){
	int i;

	for(i=0;i<size;i++){
		printf("%d ", a[i]);
	}

	printf("\n\n");
}


void muestraMatriz(int m[][2 ], int ren){
	int i, j;
	int col = 2;

	for(i=0;i<ren;i++){
		for(j=0;j<col;j++){
			printf("%d ", m[i][j]);
		}
		printf("\n");
	}

	printf("\n");
}