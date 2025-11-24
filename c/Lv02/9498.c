#include <stdio.h>

int main(void)
{
    unsigned int score;

    do
    {
        scanf("%d", &score);
    } while (score > 100);
    
    if (90 <= score && score <= 100)
        printf("A\n");
    else if (80 <= score && score <= 89)
        printf("B\n");
    else if (70 <= score && score <= 79)
        printf("C\n");
    else if (60 <= score && score <= 69)
        printf("D\n");
    else if (00 <= score && score <= 59)
        printf("F\n");

    return 0;
}