#include <stdio.h>

int main(){
	int res, rev=0, num;

	printf("Su número por favor: ");
	scanf("%d", &num);
	while(num>=1){
		res = num%10;
		rev = rev * 10 + res;
		num = num/10;
	}

	printf("\n %d", rev);

	printf("\n\n");
	return 0;
}