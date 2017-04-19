/*Convierte un número cualquier base a decimal*/
#include <stdio.h>
int main(){
	int binario, decimal=0, base=1, res;
	int num;
	int base_usuario;
	printf("Indique la base: ");
	scanf("%d", &base_usuario);
	printf("Indique el número a convertir:");
	scanf("%d", &num);
	binario = num;
	while(num > 0){
		res = num%10;
		decimal = decimal + res * base;
		num = num/10;
		base = base * base_usuario;
	}

	printf("El numero en decimal es: %d", decimal);

	printf("\n\n");
	return 0;
}