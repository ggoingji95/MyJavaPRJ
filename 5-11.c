#include <stdio.h>
void main()
{
	int a,b,c;
	char ch;

	printf("������ �� �ٷ� ����� �Է����ּ��� : ");
	scanf("%d %c %d", &a, &ch, &b);

	switch(ch){
		case '+':
			c = a + b;
			printf("%d + %d = %d �Դϴ�. \n", a,b,c);
			break;
		case '-':
			c = a - b;
			printf("%d - %d = %d �Դϴ�. \n", a, b, c);
			break;
		case '*':
			c = a * b;
			printf("%d * %d = %d �Դϴ�. \n", a, b, c);
			break;
		case '/':
			c = a / b;
			printf("%d / %d = %d �Դϴ�. \n", a, b, c);
			break;
		case '%':
			c = a % b;
			printf("%d %% %d = %d �Դϴ�. \n", a, b, c);
			break;
		default:
			printf("�����ڸ� �߸� �Է� �ϼ̽��ϴ�.");
	}
}
