#include <stdio.h>

void main()
{
	int a,b,c,d;
	int result;

	printf("ù��° ����� ���� �Է��ϼ��� : \n");
	scanf("%d", &a);
	printf("�ι�° ����� ���� �Է��ϼ��� : \n");
	scanf("%d", &b);
	printf("����° ����� ���� �Է��ϼ��� : \n");
	scanf("%d", &c);
	printf("�׹�° ����� ���� �Է��ϼ��� : \n");
	scanf("%d",&d);

	result = a + b + c + d;
	printf("%d+%d+%d+%d=%d \n", a,b,c,d,result);
}
