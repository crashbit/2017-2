#include <stdio.h>

void intercambia(int *a, int *b);

int main(){
	int x, y;

	x = 22;
	y = 57;

	printf("\n %d - %d ", x, y);
	intercambia(&x, &y);
	printf("\n %d - %d ", x, y);

	printf("\n\n");

}

void intercambia(int *a, int *b){
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}
