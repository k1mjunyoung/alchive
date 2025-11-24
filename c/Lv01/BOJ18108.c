#include <stdio.h>

int main(void)
{
    unsigned int y = 0;

    while (y < 1000 || y > 3000)
    {
        scanf("%d", &y);
    }

    printf("%d\n", y - 543);
    
    return 0;
}