#include <stdio.h>

int main(void)
{
    int T, A, B;

    scanf("%d", &T);

    int result[T];

    for (int i = 0; i < T; i++)
    {
        scanf("%d %d", &A, &B);
        result[i] = A + B;
    }
    
    for (int j = 0; j < T; j++)
    {
        printf("%d\n", result[j]);
    }
    
    return 0;
}