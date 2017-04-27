#include <stdio.h>

int calcula_factorial(int n);
int main(){
	int factorial;
	int n = 5;

	factorial = calcula_factorial(n);

	printf("\n%d", factorial);
	printf("\n\n");
	return 0;
}

int calcula_factorial(int n){
	if(n>0){
		return n * calcula_factorial(n-1);
	}
	else return 1;
}