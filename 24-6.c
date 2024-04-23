#include <stdio.h>

void manin()
{
	int a,num;
	printf("입력 진수 결정 1<10> 2<16> 3<8> : \n");
	scanf("%d", &a);
	printf("숫자를 입력해주세요 : \n");

	switch(a) {
		case 1 : scanf("%d", &num);
			 printf("10진수 : %d\n", num);
			 printf("16진수 : %x\n", num);
			 printf("8진수 : %o\n", num);
			 break;

		case 2 : scanf("%x", &num);
			 printf("10진수 : %d\n", num);
			 printf("16진수 : %x\n", num);
			 printf("8진수 : %o\n", num);
			 break;

		case 3 : scanf("%o", &num);
			 printf("10진수 : %d\n", num);
			 printf("16진수 : %x\n", num);
			 printf("8진수 : %o\n", num);
			 break;

		default :
			 printf("잘못된 값을 입력 하셨습니다~ ! \n", num);
	}
}

