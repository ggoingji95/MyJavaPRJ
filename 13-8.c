#include <stdio.h>

void main()
{
	enum week {sun, mon, tue, wed, thu, fir, sat };
	enum week ww;
	ww = sat;

	if ( ww == sun)
		printf("������ �Ͽ��� �Դϴ�.\n");

	else
		printf("������ �Ͽ����� �ƴմϴ�. \n");

}

