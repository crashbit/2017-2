#include <stdio.h>
void decrementa(int n);
int main(){
	int n = 10;
	int i;
	decrementa(n);
	printf("----------------\n");
	for(i=n;i>0;i--){
		printf("\n%d",i);
	}
	
	printf("\n\n");
	return 0;
}

void decrementa(int n){
	if(n>0){
		printf("\n %d", n);
		decrementa(n-1);
	}
}