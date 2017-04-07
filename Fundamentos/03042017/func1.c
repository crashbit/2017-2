#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int aleatorio();

int main(){
        int r;

        r = aleatorio();

        printf("%d", r);

        printf("\n\n");
        return 0;
}

int aleatorio(){
	int r;
    srand ( time(NULL) );

    r = rand() % 8;

    return r;
}