#include <stdio.h>

void manin()
{
	int a,num;
	printf("�Է� ���� ���� 1<10> 2<16> 3<8> : \n");
	scanf("%d", &a);
	printf("���ڸ� �Է����ּ��� : \n");

	switch(a) {
		case 1 : scanf("%d", &num);
			 printf("10���� : %d\n", num);
			 printf("16���� : %x\n", num);
			 printf("8���� : %o\n", num);
			 break;

		case 2 : scanf("%x", &num);
			 printf("10���� : %d\n", num);
			 printf("16���� : %x\n", num);
			 printf("8���� : %o\n", num);
			 break;

		case 3 : scanf("%o", &num);
			 printf("10���� : %d\n", num);
			 printf("16���� : %x\n", num);
			 printf("8���� : %o\n", num);
			 break;

		default :
			 printf("�߸��� ���� �Է� �ϼ̽��ϴ�~ ! \n", num);
	}
}

