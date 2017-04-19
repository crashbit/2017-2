/*Convierte un número binario a decimal*/
#include <stdio.h>
int main(){
	int binario, decimal=0, base=1, res;
	int num = 11001;
	binario = num;
	while(num > 0){
		res = num%10;
		decimal = decimal + res * base;
		num = num/10;
		base = base * 2;
	}

	printf("%d", decimal);


	printf("\n\n");
	return 0;
}