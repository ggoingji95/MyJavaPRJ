#include <stdio.h>

void main()
{
	int year;
	
	printf("�⵵�� �Է����ּ��� : ");
	scanf("%d",&year);

	if ((year%4==0 && ! 100 ==0) || (year%400==0)) {
		printf("%d���� ������ �½��ϴ�....",year);}
	else{
		printf("%d���� ������ �ƴմϴ�....",year);}
}
