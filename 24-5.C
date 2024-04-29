#include <stdio.h>

void main()
{
	int a,b,c,i;
	int result=0;

	printf("합계의 시작 값 : \n");
	scanf("%d", &a);
	printf("합계의 끝 값 : \n");
	scanf("%d", &b);
	printf("배수 : \n");
	scanf("%d", &c);

	for(i=a; i<=b; i++){
		if(i % c !=0)
			continue;
		result+=i; }
	printf("%d부터 %d까지의 %d 배수의 합계 : %d \n", a,b,c,result); }

