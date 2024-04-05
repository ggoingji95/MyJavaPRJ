#include <stdio.h>
void main()
{
	int a,b,c;
	char ch;

	printf("수식을 한 줄로 띄어쓰기로 입력해주세요 : ");
	scanf("%d %c %d", &a, &ch, &b);

	switch(ch){
		case '+':
			c = a + b;
			printf("%d + %d = %d 입니다. \n", a,b,c);
			break;
		case '-':
			c = a - b;
			printf("%d - %d = %d 입니다. \n", a, b, c);
			break;
		case '*':
			c = a * b;
			printf("%d * %d = %d 입니다. \n", a, b, c);
			break;
		case '/':
			c = a / b;
			printf("%d / %d = %d 입니다. \n", a, b, c);
			break;
		case '%':
			c = a % b;
			printf("%d %% %d = %d 입니다. \n", a, b, c);
			break;
		default:
			printf("연산자를 잘못 입력 하셨습니다.");
	}
}
