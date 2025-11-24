#include <stdio.h>

int main(void)
{
	int T, A, B;
	scanf("%d", &T);
	
	int sum[T];
	
	for(int i=0; i<T; i++)
	{
		scanf("%d %d", &A, &B);
		sum[i] = A + B;
	}
	
	for(int j=0; j<T; j++)
	{
		printf("Case #%d: %d\n", j+1, sum[j]);
	}
	
	return 0;
}