#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){	
	int r;
	srand ( time(NULL) );

	r = rand() % 3;
	printf("%d", r);

	printf("\n\n");
	return 0;
}