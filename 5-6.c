#include <stdio.h>


void main()
{
	int a, b ,c ,d,e;

	printf("첫번째 계산값을 작성해주세요");
	scanf("%d", &a);

	printf("두번째 계산값을 작성해주세요");
	scanf("%d", &b);

	printf("세번째 계산값을 작성해주세요");
	scanf("%d", &c);

	printf("네번째 계산값을 작성해주세요");
	scanf("%d", &d);


	e = a + b + c + d;
	printf("%d + %d + %d + %d = %d \n", a, b, c, d, e);
}
