#include <stdio.h>

int main(void)
{
	int T;
	scanf("%d", &T);
	
	int A[T];
	int B[T];
	int sum[T];
	
	for(int i=0; i<T; i++)
	{
		scanf("%d %d", &A[i], &B[i]);
		sum[i] = A[i] + B[i];
	}
	
	for(int j=0; j<T; j++)
	{
		printf("Case #%d: %d + %d = %d\n", j+1, A[j], B[j], sum[j]);
	}
	
	return 0;
}