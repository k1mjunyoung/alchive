#include <stdio.h>

int main(void)
{
    int x, y;

    do
    {
        scanf("%d", &x);
        scanf("%d", &y);
    } while ((x==0)||(y==0));
    
    if ((x > 0) && (y > 0))
    {
        printf("1\n");
    }
    else if ((x > 0) && (y < 0))
    {
        printf("4\n");
    }
    else if ((x < 0) && (y < 0))
    {
        printf("3\n");
    }
    else if ((x < 0) && (y > 0))
    {
        printf("2\n");
    }
    
    return 0;
}