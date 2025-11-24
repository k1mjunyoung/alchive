#include <stdio.h>

int main(void)
{
    unsigned int A, B;

    scanf("%d %d", &A, &B);
    
    while (A < 1 || B > 10000)
    {
        scanf("%d %d", &A, &B);
    }

    printf("%d\n", A + B);
    printf("%d\n", A - B);
    printf("%d\n", A * B);
    printf("%d\n", A / B);
    printf("%d\n", A % B);
    
    return 0;
}