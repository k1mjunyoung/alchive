#include <stdio.h>

int main(void)
{
	unsigned int A, B, C;
	
	do
	{
	scanf("%d %d", &A, &B);
	scanf("%d", &C);
	}
	while(A > 23 || B > 59 || C > 1000);
	
	B += C;
	
	if(B > 59)
	{
		int H = B / 60;
		B -= H*60;
		
		A += H;
	}
	
	if(A > 23)
	{
		A -= 24;
	}

	
	printf("%d %d\n", A, B);
	
	return 0;
}