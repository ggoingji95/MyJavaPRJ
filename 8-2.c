#include <stdio.h>

void main()
{
	int aa[4];
	int hap;

	printf("1��° ���ڸ� �Է��ϼ��� : ");
	scanf("%d", &aa[0]);

	printf("2��° ���ڸ�  �Է��ϼ��� : ");
	scanf("%d", &aa[1]);

	printf("3��° ���ڸ� �Է��ϼ��� : ");
	scanf("%d", &aa[2]);

	printf("4��° ���ڸ� �Է��ϼ��� : ");
	scanf("%d", &aa[3]);

	hap = aa[0] + aa[1] + aa[2] + aa[3];

	printf("�迭�� �հ� : %d \n", hap);
}

