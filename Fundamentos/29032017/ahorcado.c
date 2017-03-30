#include <stdio.h>
#include <string.h>


int main(){
	char palabra[100] = "Alejandraaaa";
	char adivinado[100];
	char letra[2];
	int errores = 0;
	int aciertos =0;
	int largo;
	int i;
	int encontrado = 0;

	largo = strlen(palabra);

	for(i=0; i< largo; i++){
		adivinado[i] = '_';
	}

	for(i=0; i< largo; i++){
		printf("%c", adivinado[i]);
	}

	printf("\n");

	/* Empieza el juego */
	while(errores < 4){
		encontrado = 0;
		printf("Teclea una letra: ");
		scanf("%s", letra);
		for(i=0;i<largo;i++){
			if(letra[0] == palabra[i]){
				palabra[i]= '_';
				adivinado[i] = letra[0];
				encontrado = 1;
				aciertos = aciertos + 1;
			}
		}

				
		if(encontrado == 0){
			errores = errores +1;
		}
		
		printf("errores: %d\n", errores);
		printf("aciertos: %d\n", aciertos);

		for(i=0; i< largo; i++){
			printf("%c", adivinado[i]);
		}
		printf("\n");

		if(aciertos == largo)
			break;
	}

	if(aciertos == largo)
		printf("Usted gano!!! yeah!! pomo, pomo");
	else
		printf("Usted perdio, looser, pomo, pomo");

	printf("\n\n\n");
	return 0;

}