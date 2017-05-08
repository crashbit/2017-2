#include <stdio.h>
#include <string.h>
#include <ctype.h>

void imprimir(char[]);
char *convierte(char[]);

int main(int argc, char** argv){
	char nombre[]="universidad";
	char *resultado;
	int i;

	if(argc==1){
		printf("No existen parametros");
		printf("\n%s", argv[0]);
		return 0;
	}
	else{
		imprimir(argv[1]);
		resultado = convierte(argv[1]);
		printf("%s", resultado);
	}

	for(i=0;i<argc;i++){
		printf("\nParametro %d -> %s", i, argv[i]);
	}

	printf("\n\n");

}

void imprimir(char cadena[]){
	int i;
	for(i=0;i<strlen(cadena);i++){
		printf("%c", cadena[i]);
		printf("\n");
	}
}

char *convierte(char cadena[]){
	int i;
	for(i=0;i<strlen(cadena);i++){
		cadena[i] = toupper(cadena[i]);
	}

	return cadena;
}


