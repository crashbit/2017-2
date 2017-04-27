#include <stdio.h>

int reversa(int num);
int res, rev=0;

int main(){
	int rev;
	int num;
	printf("Su número por favor: ");
	scanf("%d", &num);
	
	rev = reversa(num);
	printf("\n %d", rev);

	printf("\n\n");
	return 0;
}

int reversa(int num){
	if(num>=1){
		res = num%10;
		rev = rev * 10 + res;
		reversa(num/10);
	}
	else 
		return rev;
	return rev;

}