#include <stdio.h>

int main(void)
{
	unsigned int H, M;
	
	do
	{
		scanf("%d", &H);
		scanf("%d", &M);
	}
	while(H > 24 || M > 60);
	
	if(H == 0 && M < 45)
	{
		H = 23;
		M = M + 60 - 45;
	}
	else if(H == 0 && M >=45)
	{
		M -= 45;
	}
	else if(M >= 45)
	{
		M -= 45;
	}
	else if(M < 45)
	{
		H -= 1;
		M = M + 60 - 45;
	}
	
	printf("%d %d\n", H, M);
	
	return 0;
}