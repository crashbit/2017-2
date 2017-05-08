#include <stdio.h>
#include <string.h>

int main(){
	char nombres[][10]={"German", "Julio","Zaira", "Jesus", "Rodolfo", "Julia", "julio"};
	char temporal[20];

	int i, j;

	for(i=0;i<7;i++){
		for(j=i+1;j<7;j++){
			if(strcmp(nombres[i], nombres[j])>0){
				printf("\n%s vs %s", nombres[i], nombres[j]);
				strcpy(temporal, nombres[i]);
				strcpy(nombres[i], nombres[j]);
				strcpy(nombres[j], temporal);
			}
			strcpy(temporal,"");
		}
	}
	printf("\n\n\n");
	for(i=0;i<7;i++){
		printf("\n%s", nombres[i]);
	}
	printf("\n\n");
	return 0;
}
