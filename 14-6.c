#include <stdio.h>

void myfunc();

void main()
{
	myfunc();
	myfunc();

}

void myfunc()
{
	static int a = 0;

	a = a + 100;
	printf("a�� �� ==> %d\n", a);

}

