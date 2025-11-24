#include <stdio.h>

int main(void)
{
	unsigned int num1, num2, num3, prize;
	
	do
		scanf("%d %d %d", &num1, &num2, &num3);
	while(num1>6 || num2>6 || num3>6);
	
	if(num1==num2 && num2==num3)
		prize = 10000 + num1*1000;
	
	else if(num1==num2 && num2!=num3)
		prize = 1000 + num1*100;
	else if(num3==num1 && num1!=num2)
		prize = 1000 + num1*100;
	else if(num2==num3 && num3!=num1)
		prize = 1000 + num2*100;
	
	else if(num1!=num2 && num1!=num3 && num2!=num3){
		if(num1>num2 && num1>num3)
			prize = num1*100;
		else if(num2>num1 && num2>num3)
			prize = num2*100;
		else
			prize = num3*100;
	}
	
	printf("%d\n", prize);
	
	return 0;
}