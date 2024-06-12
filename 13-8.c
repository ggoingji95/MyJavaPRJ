#include <stdio.h>

void main()
{
	enum week {sun, mon, tue, wed, thu, fir, sat };
	enum week ww;
	ww = sat;

	if ( ww == sun)
		printf("오늘은 일요일 입니다.\n");

	else
		printf("오늘은 일요일이 아닙니다. \n");

}

