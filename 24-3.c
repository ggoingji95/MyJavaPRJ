#include <stdio.h>

void main()
{
	int a,b,c;
	char ch;

	printf("수식을 한줄로 입력하시오 : \n");
	scanf("%d %c %d", &a, &ch, &b);

	switch(ch){
		case '+' :
			c = a + b;
			printf("%d + %d = %d 입니다.", a,b,c);
			break;
		case '-' :
			c = a - b;
			printf("%d - %d = %d 입니다.", a,b,c);
			break;
		case '*' :
			c = a * b;
			printf("%d * %d = %d 입니다.", a,b,c);
			break;
		case '/' :
			c = a / b;
			printf("%d / %d = %d 입니다.", a,b,c);
			break;
		case '%' :
			c = a % b;
			printf("%d %% %d = %d 입니다.", a,b,c);
			break;
		default :
			printf("연산자를 잘못 입력 하셨습니다.");
	}
}


