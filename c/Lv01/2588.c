#include <stdio.h>

int main(void)
{
    int num1, num2;

    scanf("%d", &num1);
    scanf("%d", &num2);

    int line1 = num1 * (num2 % 10);
    int line2 = num1 * (((num2 % 100)-(num2 % 10))/10);
    int line3 = num1 * (num2 / 100);
    int line4 = line1 + line2*10 + line3*100;

    printf("%d\n", line1);
    printf("%d\n", line2);
    printf("%d\n", line3);
    printf("%d\n", line4);

    return 0;
}